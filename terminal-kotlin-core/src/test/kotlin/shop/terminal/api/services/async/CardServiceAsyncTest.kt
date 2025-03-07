// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.CardCreateParams
import shop.terminal.api.models.CardDeleteParams
import shop.terminal.api.models.CardGetParams

@ExtendWith(TestServerExtension::class)
class CardServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardServiceAsync = client.card()

        val card =
            cardServiceAsync.create(
                CardCreateParams.builder().token("tok_1N3T00LkdIwHu7ixt44h1F8k").build()
            )

        card.validate()
    }

    @Test
    suspend fun list() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardServiceAsync = client.card()

        val card = cardServiceAsync.list()

        card.validate()
    }

    @Test
    suspend fun delete() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardServiceAsync = client.card()

        val card =
            cardServiceAsync.delete(
                CardDeleteParams.builder().id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        card.validate()
    }

    @Test
    suspend fun collect() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardServiceAsync = client.card()

        val response = cardServiceAsync.collect()

        response.validate()
    }

    @Test
    suspend fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cardServiceAsync = client.card()

        val card =
            cardServiceAsync.get(
                CardGetParams.builder().id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        card.validate()
    }
}
