// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CartClearResponseTest {

    @Test
    fun create() {
        val cartClearResponse = CartClearResponse.builder().data(CartClearResponse.Data.OK).build()

        assertThat(cartClearResponse.data()).isEqualTo(CartClearResponse.Data.OK)
    }
}
