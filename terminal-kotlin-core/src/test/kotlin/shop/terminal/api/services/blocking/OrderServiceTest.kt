// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.core.JsonValue
import shop.terminal.api.models.order.OrderCreateParams
import shop.terminal.api.models.order.OrderGetParams

@ExtendWith(TestServerExtension::class)
class OrderServiceTest {

    @Test
    fun create() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.order()

        val order =
            orderService.create(
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
    fun list() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.order()

        val order = orderService.list()

        order.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.order()

        val order =
            orderService.get(OrderGetParams.builder().id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX").build())

        order.validate()
    }
}
