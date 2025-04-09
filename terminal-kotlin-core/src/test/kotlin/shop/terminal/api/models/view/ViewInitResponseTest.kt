// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.view

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper
import shop.terminal.api.models.address.Address
import shop.terminal.api.models.app.App
import shop.terminal.api.models.card.Card
import shop.terminal.api.models.cart.Cart
import shop.terminal.api.models.order.Order
import shop.terminal.api.models.product.Product
import shop.terminal.api.models.product.ProductVariant
import shop.terminal.api.models.profile.Profile
import shop.terminal.api.models.subscription.Subscription
import shop.terminal.api.models.token.Token

internal class ViewInitResponseTest {

    @Test
    fun create() {
        val viewInitResponse =
            ViewInitResponse.builder()
                .data(
                    ViewInitResponse.Data.builder()
                        .addAddress(
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
                        .addApp(
                            App.builder()
                                .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .name("Example App")
                                .redirectUri("https://example.com/callback")
                                .secret("sec_******XXXX")
                                .build()
                        )
                        .addCard(
                            Card.builder()
                                .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .brand("Visa")
                                .expiration(
                                    Card.Expiration.builder().month(12L).year(2023L).build()
                                )
                                .last4("1234")
                                .build()
                        )
                        .cart(
                            Cart.builder()
                                .amount(
                                    Cart.Amount.builder()
                                        .subtotal(4400L)
                                        .shipping(800L)
                                        .total(0L)
                                        .build()
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
                        .addOrder(
                            Order.builder()
                                .id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .amount(
                                    Order.Amount.builder().shipping(800L).subtotal(4400L).build()
                                )
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
                                        .status("DELIVERED")
                                        .statusDetails("Your shipment has been delivered.")
                                        .statusUpdatedAt("2025-04-08T12:00:00.000Z")
                                        .url(
                                            "https://tools.usps.com/go/TrackConfirmAction_input?origTrackNum=92346903470167000000000019"
                                        )
                                        .build()
                                )
                                .index(0L)
                                .build()
                        )
                        .addProduct(
                            Product.builder()
                                .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .description(
                                    "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                                )
                                .name("[object Object]")
                                .addVariant(
                                    ProductVariant.builder()
                                        .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                        .name("12oz")
                                        .price(2200L)
                                        .build()
                                )
                                .order(100L)
                                .subscription(Product.Subscription.ALLOWED)
                                .tags(
                                    Product.Tags.builder()
                                        .app("app")
                                        .color("color")
                                        .featured(true)
                                        .marketEu(true)
                                        .marketNa(true)
                                        .build()
                                )
                                .build()
                        )
                        .profile(
                            Profile.builder()
                                .user(
                                    Profile.User.builder()
                                        .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                        .email("john@example.com")
                                        .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                                        .name("John Doe")
                                        .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                                        .build()
                                )
                                .build()
                        )
                        .region(Region.NA)
                        .addSubscription(
                            Subscription.builder()
                                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .quantity(1L)
                                .next("2025-02-01T19:36:19.000Z")
                                .schedule(
                                    Subscription.Schedule.Weekly.builder()
                                        .interval(3L)
                                        .type(Subscription.Schedule.Weekly.Type.WEEKLY)
                                        .build()
                                )
                                .build()
                        )
                        .addToken(
                            Token.builder()
                                .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .token("trm_test_******XXXX")
                                .created("2024-06-29T19:36:19.000Z")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(viewInitResponse.data())
            .isEqualTo(
                ViewInitResponse.Data.builder()
                    .addAddress(
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
                    .addApp(
                        App.builder()
                            .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .name("Example App")
                            .redirectUri("https://example.com/callback")
                            .secret("sec_******XXXX")
                            .build()
                    )
                    .addCard(
                        Card.builder()
                            .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .brand("Visa")
                            .expiration(Card.Expiration.builder().month(12L).year(2023L).build())
                            .last4("1234")
                            .build()
                    )
                    .cart(
                        Cart.builder()
                            .amount(
                                Cart.Amount.builder()
                                    .subtotal(4400L)
                                    .shipping(800L)
                                    .total(0L)
                                    .build()
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
                    .addOrder(
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
                                    .status("DELIVERED")
                                    .statusDetails("Your shipment has been delivered.")
                                    .statusUpdatedAt("2025-04-08T12:00:00.000Z")
                                    .url(
                                        "https://tools.usps.com/go/TrackConfirmAction_input?origTrackNum=92346903470167000000000019"
                                    )
                                    .build()
                            )
                            .index(0L)
                            .build()
                    )
                    .addProduct(
                        Product.builder()
                            .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .description(
                                "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                            )
                            .name("[object Object]")
                            .addVariant(
                                ProductVariant.builder()
                                    .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                    .name("12oz")
                                    .price(2200L)
                                    .build()
                            )
                            .order(100L)
                            .subscription(Product.Subscription.ALLOWED)
                            .tags(
                                Product.Tags.builder()
                                    .app("app")
                                    .color("color")
                                    .featured(true)
                                    .marketEu(true)
                                    .marketNa(true)
                                    .build()
                            )
                            .build()
                    )
                    .profile(
                        Profile.builder()
                            .user(
                                Profile.User.builder()
                                    .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                    .email("john@example.com")
                                    .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                                    .name("John Doe")
                                    .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                                    .build()
                            )
                            .build()
                    )
                    .region(Region.NA)
                    .addSubscription(
                        Subscription.builder()
                            .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .quantity(1L)
                            .next("2025-02-01T19:36:19.000Z")
                            .schedule(
                                Subscription.Schedule.Weekly.builder()
                                    .interval(3L)
                                    .type(Subscription.Schedule.Weekly.Type.WEEKLY)
                                    .build()
                            )
                            .build()
                    )
                    .addToken(
                        Token.builder()
                            .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .token("trm_test_******XXXX")
                            .created("2024-06-29T19:36:19.000Z")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val viewInitResponse =
            ViewInitResponse.builder()
                .data(
                    ViewInitResponse.Data.builder()
                        .addAddress(
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
                        .addApp(
                            App.builder()
                                .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .name("Example App")
                                .redirectUri("https://example.com/callback")
                                .secret("sec_******XXXX")
                                .build()
                        )
                        .addCard(
                            Card.builder()
                                .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .brand("Visa")
                                .expiration(
                                    Card.Expiration.builder().month(12L).year(2023L).build()
                                )
                                .last4("1234")
                                .build()
                        )
                        .cart(
                            Cart.builder()
                                .amount(
                                    Cart.Amount.builder()
                                        .subtotal(4400L)
                                        .shipping(800L)
                                        .total(0L)
                                        .build()
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
                        .addOrder(
                            Order.builder()
                                .id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .amount(
                                    Order.Amount.builder().shipping(800L).subtotal(4400L).build()
                                )
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
                                        .status("DELIVERED")
                                        .statusDetails("Your shipment has been delivered.")
                                        .statusUpdatedAt("2025-04-08T12:00:00.000Z")
                                        .url(
                                            "https://tools.usps.com/go/TrackConfirmAction_input?origTrackNum=92346903470167000000000019"
                                        )
                                        .build()
                                )
                                .index(0L)
                                .build()
                        )
                        .addProduct(
                            Product.builder()
                                .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .description(
                                    "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                                )
                                .name("[object Object]")
                                .addVariant(
                                    ProductVariant.builder()
                                        .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                        .name("12oz")
                                        .price(2200L)
                                        .build()
                                )
                                .order(100L)
                                .subscription(Product.Subscription.ALLOWED)
                                .tags(
                                    Product.Tags.builder()
                                        .app("app")
                                        .color("color")
                                        .featured(true)
                                        .marketEu(true)
                                        .marketNa(true)
                                        .build()
                                )
                                .build()
                        )
                        .profile(
                            Profile.builder()
                                .user(
                                    Profile.User.builder()
                                        .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                        .email("john@example.com")
                                        .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                                        .name("John Doe")
                                        .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                                        .build()
                                )
                                .build()
                        )
                        .region(Region.NA)
                        .addSubscription(
                            Subscription.builder()
                                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .quantity(1L)
                                .next("2025-02-01T19:36:19.000Z")
                                .schedule(
                                    Subscription.Schedule.Weekly.builder()
                                        .interval(3L)
                                        .type(Subscription.Schedule.Weekly.Type.WEEKLY)
                                        .build()
                                )
                                .build()
                        )
                        .addToken(
                            Token.builder()
                                .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .token("trm_test_******XXXX")
                                .created("2024-06-29T19:36:19.000Z")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedViewInitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(viewInitResponse),
                jacksonTypeRef<ViewInitResponse>(),
            )

        assertThat(roundtrippedViewInitResponse).isEqualTo(viewInitResponse)
    }
}
