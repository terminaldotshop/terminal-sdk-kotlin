// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.token.TokenDeleteParams
import shop.terminal.api.models.token.TokenGetParams

@ExtendWith(TestServerExtension::class)
internal class TokenServiceTest {

    @Test
    fun create() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenService = client.token()

        val token = tokenService.create()

        token.validate()
    }

    @Test
    fun list() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenService = client.token()

        val tokens = tokenService.list()

        tokens.validate()
    }

    @Test
    fun delete() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenService = client.token()

        val token =
            tokenService.delete(
                TokenDeleteParams.builder().id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        token.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenService = client.token()

        val token =
            tokenService.get(TokenGetParams.builder().id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX").build())

        token.validate()
    }
}
