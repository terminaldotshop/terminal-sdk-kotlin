// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.TestServerExtension
import shop.terminal.client.okhttp.TerminalOkHttpClient
import shop.terminal.models.CartListParams
import shop.terminal.models.CartSetAddressParams
import shop.terminal.models.CartSetCardParams
import shop.terminal.models.CartSetItemParams

@ExtendWith(TestServerExtension::class)
class CartServiceTest {

    @Test
    fun callList() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartService = client.cart()
        val cartListResponse = cartService.list(CartListParams.builder().build())
        println(cartListResponse)
        cartListResponse.validate()
    }

    @Test
    fun callSetAddress() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartService = client.cart()
        val cartSetAddressResponse =
            cartService.setAddress(
                CartSetAddressParams.builder().addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )
        println(cartSetAddressResponse)
        cartSetAddressResponse.validate()
    }

    @Test
    fun callSetCard() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartService = client.cart()
        val cartSetCardResponse =
            cartService.setCard(
                CartSetCardParams.builder().cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )
        println(cartSetCardResponse)
        cartSetCardResponse.validate()
    }

    @Test
    fun callSetItem() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartService = client.cart()
        val cartSetItemResponse =
            cartService.setItem(
                CartSetItemParams.builder()
                    .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .quantity(2L)
                    .build()
            )
        println(cartSetItemResponse)
        cartSetItemResponse.validate()
    }
}
