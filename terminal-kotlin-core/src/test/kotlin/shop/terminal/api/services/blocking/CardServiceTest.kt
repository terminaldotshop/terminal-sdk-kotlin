// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.CardCollectParams
import shop.terminal.api.models.CardCreateParams
import shop.terminal.api.models.CardDeleteParams
import shop.terminal.api.models.CardListParams

@ExtendWith(TestServerExtension::class)
class CardServiceTest {

    @Test
    fun callCreate() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardService = client.card()
        val cardCreateResponse =
            cardService.create(
                CardCreateParams.builder().token("tok_1N3T00LkdIwHu7ixt44h1F8k").build()
            )
        println(cardCreateResponse)
        cardCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardService = client.card()
        val cardListResponse = cardService.list(CardListParams.builder().build())
        println(cardListResponse)
        cardListResponse.validate()
    }

    @Test
    fun callDelete() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardService = client.card()
        val cardDeleteResponse =
            cardService.delete(
                CardDeleteParams.builder().id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )
        println(cardDeleteResponse)
        cardDeleteResponse.validate()
    }

    @Test
    fun callCollect() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardService = client.card()
        val cardCollectResponse = cardService.collect(CardCollectParams.builder().build())
        println(cardCollectResponse)
        cardCollectResponse.validate()
    }
}
