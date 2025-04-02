// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class CartClearResponseTest {

    @Test
    fun create() {
        val cartClearResponse = CartClearResponse.builder().data(CartClearResponse.Data.OK).build()

        assertThat(cartClearResponse.data()).isEqualTo(CartClearResponse.Data.OK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cartClearResponse = CartClearResponse.builder().data(CartClearResponse.Data.OK).build()

        val roundtrippedCartClearResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cartClearResponse),
                jacksonTypeRef<CartClearResponse>(),
            )

        assertThat(roundtrippedCartClearResponse).isEqualTo(cartClearResponse)
    }
}
