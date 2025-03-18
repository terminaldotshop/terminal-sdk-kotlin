// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.order

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderTest {

    @Test
    fun createOrder() {
        val order =
            Order.builder()
                .id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .amount(Order.Amount.builder().shipping(800L).subtotal(4400L).build())
                .addItem(
                    Order.Item.builder()
                        .id("itm_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .amount(4400L)
                        .quantity(2L)
                        .description("description")
                        .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .build()
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
        assertThat(order).isNotNull
        assertThat(order.id()).isEqualTo("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(order.amount())
            .isEqualTo(Order.Amount.builder().shipping(800L).subtotal(4400L).build())
        assertThat(order.items())
            .containsExactly(
                Order.Item.builder()
                    .id("itm_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .amount(4400L)
                    .quantity(2L)
                    .description("description")
                    .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .build()
            )
        assertThat(order.shipping())
            .isEqualTo(
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
        assertThat(order.tracking())
            .isEqualTo(
                Order.Tracking.builder()
                    .number("92346903470167000000000019")
                    .service("USPS Ground Advantage")
                    .url(
                        "https://tools.usps.com/go/TrackConfirmAction_input?origTrackNum=92346903470167000000000019"
                    )
                    .build()
            )
        assertThat(order.index()).isEqualTo(0L)
    }
}
