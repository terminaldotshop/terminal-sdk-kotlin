// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartRemoveGiftCardResponseTest {

    @Test
    fun createCartRemoveGiftCardResponse() {
        val cartRemoveGiftCardResponse =
            CartRemoveGiftCardResponse.builder().data(CartRemoveGiftCardResponse.Data.OK).build()
        assertThat(cartRemoveGiftCardResponse).isNotNull
        assertThat(cartRemoveGiftCardResponse.data()).isEqualTo(CartRemoveGiftCardResponse.Data.OK)
    }
}
