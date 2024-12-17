// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartSetAddressResponseTest {

    @Test
    fun createCartSetAddressResponse() {
        val cartSetAddressResponse =
            CartSetAddressResponse.builder().data(CartSetAddressResponse.Data.OK).build()
        assertThat(cartSetAddressResponse).isNotNull
        assertThat(cartSetAddressResponse.data()).isEqualTo(CartSetAddressResponse.Data.OK)
    }
}
