// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.core.JsonValue
import shop.terminal.api.models.OrderCreateParams
import shop.terminal.api.models.OrderGetParams

@ExtendWith(TestServerExtension::class)
class OrderServiceTest {

    @Test
    fun callCreate() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.order()
        val orderCreateResponse =
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
        println(orderCreateResponse)
        orderCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.order()
        val orderListResponse = orderService.list()
        println(orderListResponse)
        orderListResponse.validate()
    }

    @Test
    fun callGet() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.order()
        val orderGetResponse =
            orderService.get(OrderGetParams.builder().id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX").build())
        println(orderGetResponse)
        orderGetResponse.validate()
    }
}
