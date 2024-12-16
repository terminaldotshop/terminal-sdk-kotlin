// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartConvertResponseTest {

    @Test
    fun createCartConvertResponse() {
        val cartConvertResponse =
            CartConvertResponse.builder()
                .data(
                    Order.builder()
                        .id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .amount(Order.Amount.builder().shipping(800L).subtotal(4400L).build())
                        .items(
                            listOf(
                                Order.Item.builder()
                                    .id("itm_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                    .amount(4400L)
                                    .quantity(2L)
                                    .description("description")
                                    .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                    .build()
                            )
                        )
                        .shipping(
                            Order.Shipping.builder()
                                .city("Anytown")
                                .country("US")
                                .name("John Doe")
                                .street1("123 Main St")
                                .zip("12345")
                                .phone("5555555555")
                                .province("CA")
                                .street2("Apt 1")
                                .build()
                        )
                        .tracking(
                            Order.Tracking.builder()
                                .number("92346903470167000000000019")
                                .service("USPS Ground Advantage")
                                .url(
                                    "https://tools.usps.com/go/TrackConfirmAction_input?origTrackNum=92346903470167000000000019"
                                )
                                .build()
                        )
                        .index(0L)
                        .build()
                )
                .build()
        assertThat(cartConvertResponse).isNotNull
        assertThat(cartConvertResponse.data())
            .isEqualTo(
                Order.builder()
                    .id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .amount(Order.Amount.builder().shipping(800L).subtotal(4400L).build())
                    .items(
                        listOf(
                            Order.Item.builder()
                                .id("itm_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .amount(4400L)
                                .quantity(2L)
                                .description("description")
                                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .build()
                        )
                    )
                    .shipping(
                        Order.Shipping.builder()
                            .city("Anytown")
                            .country("US")
                            .name("John Doe")
                            .street1("123 Main St")
                            .zip("12345")
                            .phone("5555555555")
                            .province("CA")
                            .street2("Apt 1")
                            .build()
                    )
                    .tracking(
                        Order.Tracking.builder()
                            .number("92346903470167000000000019")
                            .service("USPS Ground Advantage")
                            .url(
                                "https://tools.usps.com/go/TrackConfirmAction_input?origTrackNum=92346903470167000000000019"
                            )
                            .build()
                    )
                    .index(0L)
                    .build()
            )
    }
}
