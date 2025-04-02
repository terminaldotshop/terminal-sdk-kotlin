// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class CartGetResponseTest {

    @Test
    fun create() {
        val cartGetResponse =
            CartGetResponse.builder()
                .data(
                    Cart.builder()
                        .amount(
                            Cart.Amount.builder().subtotal(4400L).shipping(800L).total(0L).build()
                        )
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
                )
                .build()

        assertThat(cartGetResponse.data())
            .isEqualTo(
                Cart.builder()
                    .amount(Cart.Amount.builder().subtotal(4400L).shipping(800L).total(0L).build())
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cartGetResponse =
            CartGetResponse.builder()
                .data(
                    Cart.builder()
                        .amount(
                            Cart.Amount.builder().subtotal(4400L).shipping(800L).total(0L).build()
                        )
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
                )
                .build()

        val roundtrippedCartGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cartGetResponse),
                jacksonTypeRef<CartGetResponse>(),
            )

        assertThat(roundtrippedCartGetResponse).isEqualTo(cartGetResponse)
    }
}
