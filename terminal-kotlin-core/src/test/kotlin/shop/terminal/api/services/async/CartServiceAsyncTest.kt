// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.CartSetAddressParams
import shop.terminal.api.models.CartSetCardParams
import shop.terminal.api.models.CartSetItemParams

@ExtendWith(TestServerExtension::class)
class CartServiceAsyncTest {

    @Test
    suspend fun convert() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartServiceAsync = client.cart()

        val response = cartServiceAsync.convert()

        response.validate()
    }

    @Test
    suspend fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartServiceAsync = client.cart()

        val cart = cartServiceAsync.get()

        cart.validate()
    }

    @Test
    suspend fun setAddress() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartServiceAsync = client.cart()

        val response =
            cartServiceAsync.setAddress(
                CartSetAddressParams.builder().addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        response.validate()
    }

    @Test
    suspend fun setCard() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartServiceAsync = client.cart()

        val response =
            cartServiceAsync.setCard(
                CartSetCardParams.builder().cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        response.validate()
    }

    @Test
    suspend fun setItem() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val cartServiceAsync = client.cart()

        val response =
            cartServiceAsync.setItem(
                CartSetItemParams.builder()
                    .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .quantity(2L)
                    .build()
            )

        response.validate()
    }
}
