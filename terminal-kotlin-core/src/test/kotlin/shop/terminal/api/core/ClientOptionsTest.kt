// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.core

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.mock
import org.mockito.kotlin.never
import org.mockito.kotlin.verify
import shop.terminal.api.core.http.HttpClient

@ExtendWith(MockitoExtension::class)
internal class ClientOptionsTest {

    private val httpClient = mock<HttpClient>()

    @Test
    fun putHeader_canOverwriteDefaultHeader() {
        val clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .putHeader("User-Agent", "My User Agent")
                .bearerToken("My Bearer Token")
                .build()

        assertThat(clientOptions.headers.values("User-Agent")).containsExactly("My User Agent")
    }

    @Test
    fun toBuilder_appIdCanBeUpdated() {
        var clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .appId("My App ID")
                .bearerToken("My Bearer Token")
                .build()

        clientOptions = clientOptions.toBuilder().appId("another My App ID").build()

        assertThat(clientOptions.headers.values("x-terminal-app-id"))
            .containsExactly("another My App ID")
    }

    @Test
    fun toBuilder_bearerCanBeUpdated() {
        var clientOptions =
            ClientOptions.builder().httpClient(httpClient).bearerToken("My Bearer Token").build()

        clientOptions = clientOptions.toBuilder().bearerToken("another My Bearer Token").build()

        assertThat(clientOptions.headers.values("Authorization"))
            .containsExactly("Bearer another My Bearer Token")
    }

    @Test
    fun toBuilder_whenOriginalClientOptionsGarbageCollected_doesNotCloseOriginalClient() {
        var clientOptions =
            ClientOptions.builder().httpClient(httpClient).bearerToken("My Bearer Token").build()
        verify(httpClient, never()).close()

        // Overwrite the `clientOptions` variable so that the original `ClientOptions` is GC'd.
        clientOptions = clientOptions.toBuilder().build()
        System.gc()
        Thread.sleep(100)

        verify(httpClient, never()).close()
        // This exists so that `clientOptions` is still reachable.
        assertThat(clientOptions).isEqualTo(clientOptions)
    }
}
