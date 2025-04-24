// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.order

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class OrderTest {

    @Test
    fun create() {
        val order =
            Order.builder()
                .id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .amount(Order.Amount.builder().shipping(800L).subtotal(4400L).build())
                .created("2024-06-29T19:36:19.000Z")
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
                        .status(Order.Tracking.Status.DELIVERED)
                        .statusDetails("Your shipment has been delivered.")
                        .statusUpdatedAt("2025-04-08T12:00:00.000Z")
                        .url(
                            "https://tools.usps.com/go/TrackConfirmAction_input?origTrackNum=92346903470167000000000019"
                        )
                        .build()
                )
                .index(0L)
                .build()

        assertThat(order.id()).isEqualTo("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(order.amount())
            .isEqualTo(Order.Amount.builder().shipping(800L).subtotal(4400L).build())
        assertThat(order.created()).isEqualTo("2024-06-29T19:36:19.000Z")
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
                    .status(Order.Tracking.Status.DELIVERED)
                    .statusDetails("Your shipment has been delivered.")
                    .statusUpdatedAt("2025-04-08T12:00:00.000Z")
                    .url(
                        "https://tools.usps.com/go/TrackConfirmAction_input?origTrackNum=92346903470167000000000019"
                    )
                    .build()
            )
        assertThat(order.index()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val order =
            Order.builder()
                .id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .amount(Order.Amount.builder().shipping(800L).subtotal(4400L).build())
                .created("2024-06-29T19:36:19.000Z")
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
                        .status(Order.Tracking.Status.DELIVERED)
                        .statusDetails("Your shipment has been delivered.")
                        .statusUpdatedAt("2025-04-08T12:00:00.000Z")
                        .url(
                            "https://tools.usps.com/go/TrackConfirmAction_input?origTrackNum=92346903470167000000000019"
                        )
                        .build()
                )
                .index(0L)
                .build()

        val roundtrippedOrder =
            jsonMapper.readValue(jsonMapper.writeValueAsString(order), jacksonTypeRef<Order>())

        assertThat(roundtrippedOrder).isEqualTo(order)
    }
}
