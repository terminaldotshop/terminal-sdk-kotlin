// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.TokenDeleteParams
import shop.terminal.api.models.TokenGetParams

@ExtendWith(TestServerExtension::class)
class TokenServiceTest {

    @Test
    fun callCreate() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenService = client.token()
        val tokenCreateResponse = tokenService.create()
        println(tokenCreateResponse)
        tokenCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenService = client.token()
        val tokenListResponse = tokenService.list()
        println(tokenListResponse)
        tokenListResponse.validate()
    }

    @Test
    fun callDelete() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenService = client.token()
        val tokenDeleteResponse =
            tokenService.delete(
                TokenDeleteParams.builder().id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )
        println(tokenDeleteResponse)
        tokenDeleteResponse.validate()
    }

    @Test
    fun callGet() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenService = client.token()
        val tokenGetResponse =
            tokenService.get(TokenGetParams.builder().id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX").build())
        println(tokenGetResponse)
        tokenGetResponse.validate()
    }
}
