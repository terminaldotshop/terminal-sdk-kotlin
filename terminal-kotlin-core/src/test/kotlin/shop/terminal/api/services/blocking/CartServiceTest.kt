// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.CartConvertParams
import shop.terminal.api.models.CartGetParams
import shop.terminal.api.models.CartSetAddressParams
import shop.terminal.api.models.CartSetCardParams
import shop.terminal.api.models.CartSetItemParams

@ExtendWith(TestServerExtension::class)
class CartServiceTest {

    @Test
    fun callConvert() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartService = client.cart()
        val cartConvertResponse = cartService.convert(CartConvertParams.builder().build())
        println(cartConvertResponse)
        cartConvertResponse.validate()
    }

    @Test
    fun callGet() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartService = client.cart()
        val cartGetResponse = cartService.get(CartGetParams.builder().build())
        println(cartGetResponse)
        cartGetResponse.validate()
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
