// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.OrderGetParams
import shop.terminal.api.models.OrderListParams

@ExtendWith(TestServerExtension::class)
class OrderServiceTest {

    @Test
    fun callList() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.order()
        val orderListResponse = orderService.list(OrderListParams.builder().build())
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
