// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartRedeemGiftCardParamsTest {

    @Test
    fun create() {
        CartRedeemGiftCardParams.builder().giftCardId("giftCardID").build()
    }

    @Test
    fun body() {
        val params = CartRedeemGiftCardParams.builder().giftCardId("giftCardID").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.giftCardId()).isEqualTo("giftCardID")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CartRedeemGiftCardParams.builder().giftCardId("giftCardID").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.giftCardId()).isEqualTo("giftCardID")
    }
}
