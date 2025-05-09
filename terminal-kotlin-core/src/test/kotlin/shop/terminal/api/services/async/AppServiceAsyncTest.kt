// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.app.AppCreateParams

@ExtendWith(TestServerExtension::class)
internal class AppServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val app =
            appServiceAsync.create(
                AppCreateParams.builder()
                    .name("Example App")
                    .redirectUri("https://example.com/callback")
                    .build()
            )

        app.validate()
    }

    @Test
    suspend fun list() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val apps = appServiceAsync.list()

        apps.validate()
    }

    @Test
    suspend fun delete() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val app = appServiceAsync.delete("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")

        app.validate()
    }

    @Test
    suspend fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val app = appServiceAsync.get("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")

        app.validate()
    }
}
