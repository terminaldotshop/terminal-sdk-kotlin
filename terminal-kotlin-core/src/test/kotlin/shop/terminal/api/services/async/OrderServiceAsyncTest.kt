// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.core.JsonValue
import shop.terminal.api.models.order.OrderCreateParams

@ExtendWith(TestServerExtension::class)
internal class OrderServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderServiceAsync = client.order()

        val order =
            orderServiceAsync.create(
                OrderCreateParams.builder()
                    .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .variants(
                        OrderCreateParams.Variants.builder()
                            .putAdditionalProperty(
                                "var_XXXXXXXXXXXXXXXXXXXXXXXXX",
                                JsonValue.from(1),
                            )
                            .build()
                    )
                    .build()
            )

        order.validate()
    }

    @Test
    suspend fun list() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderServiceAsync = client.order()

        val orders = orderServiceAsync.list()

        orders.validate()
    }

    @Test
    suspend fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderServiceAsync = client.order()

        val order = orderServiceAsync.get("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")

        order.validate()
    }
}
