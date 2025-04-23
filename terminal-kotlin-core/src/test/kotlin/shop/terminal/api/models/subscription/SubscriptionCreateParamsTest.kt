// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.subscription

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateParamsTest {

    @Test
    fun create() {
        SubscriptionCreateParams.builder()
            .subscription(
                Subscription.builder()
                    .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .created("2024-06-29T19:36:19.000Z")
                    .price(2200L)
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
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionCreateParams.builder()
                .subscription(
                    Subscription.builder()
                        .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .created("2024-06-29T19:36:19.000Z")
                        .price(2200L)
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                Subscription.builder()
                    .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .created("2024-06-29T19:36:19.000Z")
                    .price(2200L)
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubscriptionCreateParams.builder().build()

        val body = params._body()
    }
}
