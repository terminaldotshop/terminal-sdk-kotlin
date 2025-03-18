// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.card.CardCreateParams
import shop.terminal.api.models.card.CardDeleteParams
import shop.terminal.api.models.card.CardGetParams

@ExtendWith(TestServerExtension::class)
internal class CardServiceTest {

    @Test
    fun create() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardService = client.card()

        val card =
            cardService.create(
                CardCreateParams.builder().token("tok_1N3T00LkdIwHu7ixt44h1F8k").build()
            )

        card.validate()
    }

    @Test
    fun list() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardService = client.card()

        val card = cardService.list()

        card.validate()
    }

    @Test
    fun delete() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardService = client.card()

        val card =
            cardService.delete(
                CardDeleteParams.builder().id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        card.validate()
    }

    @Test
    fun collect() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardService = client.card()

        val response = cardService.collect()

        response.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardService = client.card()

        val card =
            cardService.get(CardGetParams.builder().id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build())

        card.validate()
    }
}
