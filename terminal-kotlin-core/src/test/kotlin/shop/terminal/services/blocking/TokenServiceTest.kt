// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.TestServerExtension
import shop.terminal.client.okhttp.TerminalOkHttpClient
import shop.terminal.models.TokenDeleteParams
import shop.terminal.models.TokenGetParams
import shop.terminal.models.TokenListParams

@ExtendWith(TestServerExtension::class)
class TokenServiceTest {

    @Test
    fun callList() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tokenService = client.token()
        val tokenListResponse = tokenService.list(TokenListParams.builder().build())
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
