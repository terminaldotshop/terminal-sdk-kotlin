// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartTest {

    @Test
    fun createCart() {
        val cart =
            Cart.builder()
                .amount(Cart.Amount.builder().subtotal(4400L).shipping(800L).build())
                .addItem(
                    Cart.Item.builder()
                        .id("itm_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .quantity(2L)
                        .subtotal(4400L)
                        .build()
                )
                .subtotal(4400L)
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .shipping(
                    Cart.Shipping.builder()
                        .service("USPS Ground Advantage")
                        .timeframe("3-5 days")
                        .build()
                )
                .build()
        assertThat(cart).isNotNull
        assertThat(cart.amount())
            .isEqualTo(Cart.Amount.builder().subtotal(4400L).shipping(800L).build())
        assertThat(cart.items())
            .containsExactly(
                Cart.Item.builder()
                    .id("itm_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .quantity(2L)
                    .subtotal(4400L)
                    .build()
            )
        assertThat(cart.subtotal()).isEqualTo(4400L)
        assertThat(cart.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(cart.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(cart.shipping())
            .isEqualTo(
                Cart.Shipping.builder()
                    .service("USPS Ground Advantage")
                    .timeframe("3-5 days")
                    .build()
            )
    }
}
