// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartClearResponseTest {

    @Test
    fun createCartClearResponse() {
        val cartClearResponse = CartClearResponse.builder().data(CartClearResponse.Data.OK).build()
        assertThat(cartClearResponse).isNotNull
        assertThat(cartClearResponse.data()).isEqualTo(CartClearResponse.Data.OK)
    }
}
