// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CartSetCardResponseTest {

    @Test
    fun create() {
        val cartSetCardResponse =
            CartSetCardResponse.builder().data(CartSetCardResponse.Data.OK).build()

        assertThat(cartSetCardResponse.data()).isEqualTo(CartSetCardResponse.Data.OK)
    }
}
