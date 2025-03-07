// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionGetResponseTest {

    @Test
    fun createSubscriptionGetResponse() {
        val subscriptionGetResponse =
            SubscriptionGetResponse.builder()
                .data(
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
                .build()
        assertThat(subscriptionGetResponse).isNotNull
        assertThat(subscriptionGetResponse.data())
            .isEqualTo(
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
    }
}
