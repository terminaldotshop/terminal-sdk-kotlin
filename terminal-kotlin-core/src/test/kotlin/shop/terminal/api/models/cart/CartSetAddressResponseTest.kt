// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class CartSetAddressResponseTest {

    @Test
    fun create() {
        val cartSetAddressResponse =
            CartSetAddressResponse.builder().data(CartSetAddressResponse.Data.OK).build()

        assertThat(cartSetAddressResponse.data()).isEqualTo(CartSetAddressResponse.Data.OK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cartSetAddressResponse =
            CartSetAddressResponse.builder().data(CartSetAddressResponse.Data.OK).build()

        val roundtrippedCartSetAddressResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cartSetAddressResponse),
                jacksonTypeRef<CartSetAddressResponse>(),
            )

        assertThat(roundtrippedCartSetAddressResponse).isEqualTo(cartSetAddressResponse)
    }
}
