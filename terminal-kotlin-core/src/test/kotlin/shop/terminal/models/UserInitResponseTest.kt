// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.core.JsonValue

class UserInitResponseTest {

    @Test
    fun createUserInitResponse() {
        val userInitResponse =
            UserInitResponse.builder()
                .data(
                    UserInitResponse.Data.builder()
                        .addresses(
                            listOf(
                                Address.builder()
                                    .id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
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
                        )
                        .cards(
                            listOf(
                                Card.builder()
                                    .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                    .brand("Visa")
                                    .expiration(
                                        Card.Expiration.builder().month(12L).year(2023L).build()
                                    )
                                    .last4("1234")
                                    .build()
                            )
                        )
                        .cart(
                            Cart.builder()
                                .amount(
                                    Cart.Amount.builder().subtotal(4400L).shipping(800L).build()
                                )
                                .items(
                                    listOf(
                                        Cart.Item.builder()
                                            .id("itm_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                            .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                            .quantity(2L)
                                            .subtotal(4400L)
                                            .build()
                                    )
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
                        .orders(
                            listOf(
                                Order.builder()
                                    .id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                    .amount(
                                        Order.Amount.builder()
                                            .shipping(800L)
                                            .subtotal(4400L)
                                            .build()
                                    )
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
                        )
                        .products(
                            listOf(
                                Product.builder()
                                    .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                    .description(
                                        "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                                    )
                                    .name("[object Object]")
                                    .variants(
                                        listOf(
                                            ProductVariant.builder()
                                                .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                                .name("12oz")
                                                .price(2200L)
                                                .build()
                                        )
                                    )
                                    .order(100L)
                                    .subscription(Product.Subscription.ALLOWED)
                                    .tags(
                                        Product.Tags.builder()
                                            .putAdditionalProperty(
                                                "featured",
                                                JsonValue.from("true")
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                        )
                        .subscriptions(
                            listOf(
                                Subscription.builder()
                                    .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                    .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                    .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                    .frequency(Subscription.Frequency.FIXED)
                                    .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                    .quantity(1L)
                                    .build()
                            )
                        )
                        .user(
                            User.builder()
                                .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .email("john@example.com")
                                .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                                .name("John Doe")
                                .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(userInitResponse).isNotNull
        assertThat(userInitResponse.data())
            .isEqualTo(
                UserInitResponse.Data.builder()
                    .addresses(
                        listOf(
                            Address.builder()
                                .id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
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
                    )
                    .cards(
                        listOf(
                            Card.builder()
                                .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .brand("Visa")
                                .expiration(
                                    Card.Expiration.builder().month(12L).year(2023L).build()
                                )
                                .last4("1234")
                                .build()
                        )
                    )
                    .cart(
                        Cart.builder()
                            .amount(Cart.Amount.builder().subtotal(4400L).shipping(800L).build())
                            .items(
                                listOf(
                                    Cart.Item.builder()
                                        .id("itm_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                        .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                        .quantity(2L)
                                        .subtotal(4400L)
                                        .build()
                                )
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
                    .orders(
                        listOf(
                            Order.builder()
                                .id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .amount(
                                    Order.Amount.builder().shipping(800L).subtotal(4400L).build()
                                )
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
                    )
                    .products(
                        listOf(
                            Product.builder()
                                .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .description(
                                    "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                                )
                                .name("[object Object]")
                                .variants(
                                    listOf(
                                        ProductVariant.builder()
                                            .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                            .name("12oz")
                                            .price(2200L)
                                            .build()
                                    )
                                )
                                .order(100L)
                                .subscription(Product.Subscription.ALLOWED)
                                .tags(
                                    Product.Tags.builder()
                                        .putAdditionalProperty("featured", JsonValue.from("true"))
                                        .build()
                                )
                                .build()
                        )
                    )
                    .subscriptions(
                        listOf(
                            Subscription.builder()
                                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .frequency(Subscription.Frequency.FIXED)
                                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .quantity(1L)
                                .build()
                        )
                    )
                    .user(
                        User.builder()
                            .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .email("john@example.com")
                            .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                            .name("John Doe")
                            .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                            .build()
                    )
                    .build()
            )
    }
}
