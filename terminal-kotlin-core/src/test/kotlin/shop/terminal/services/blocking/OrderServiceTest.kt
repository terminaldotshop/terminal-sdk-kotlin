// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.TestServerExtension
import shop.terminal.client.okhttp.TerminalOkHttpClient
import shop.terminal.models.OrderCreateParams
import shop.terminal.models.OrderGetParams
import shop.terminal.models.OrderListParams

@ExtendWith(TestServerExtension::class)
class OrderServiceTest {

    @Test
    fun callCreate() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.orders()
        val orderCreateResponse = orderService.create(OrderCreateParams.builder().build())
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
        val orderService = client.orders()
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
        val orderService = client.orders()
        val orderGetResponse =
            orderService.get(OrderGetParams.builder().id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX").build())
        println(orderGetResponse)
        orderGetResponse.validate()
    }
}
