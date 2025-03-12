// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.token.TokenDeleteParams
import shop.terminal.api.models.token.TokenGetParams

@ExtendWith(TestServerExtension::class)
class TokenServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenServiceAsync = client.token()

        val token = tokenServiceAsync.create()

        token.validate()
    }

    @Test
    suspend fun list() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenServiceAsync = client.token()

        val token = tokenServiceAsync.list()

        token.validate()
    }

    @Test
    suspend fun delete() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenServiceAsync = client.token()

        val token =
            tokenServiceAsync.delete(
                TokenDeleteParams.builder().id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        token.validate()
    }

    @Test
    suspend fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenServiceAsync = client.token()

        val token =
            tokenServiceAsync.get(
                TokenGetParams.builder().id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        token.validate()
    }
}
