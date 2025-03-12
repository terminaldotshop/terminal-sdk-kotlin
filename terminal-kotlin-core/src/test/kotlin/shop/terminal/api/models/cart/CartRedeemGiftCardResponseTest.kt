// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartRedeemGiftCardResponseTest {

    @Test
    fun createCartRedeemGiftCardResponse() {
      val cartRedeemGiftCardResponse = CartRedeemGiftCardResponse.builder()
          .data(CartRedeemGiftCardResponse.Data.builder()
              .appliedAmount(0L)
              .giftCardId("giftCardID")
              .remainingBalance(0L)
              .build())
          .build()
      assertThat(cartRedeemGiftCardResponse).isNotNull
      assertThat(cartRedeemGiftCardResponse.data()).isEqualTo(CartRedeemGiftCardResponse.Data.builder()
          .appliedAmount(0L)
          .giftCardId("giftCardID")
          .remainingBalance(0L)
          .build())
    }
}
