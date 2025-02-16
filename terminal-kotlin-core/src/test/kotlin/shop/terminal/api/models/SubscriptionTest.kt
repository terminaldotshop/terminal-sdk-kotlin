// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionTest {

    @Test
    fun createSubscription() {
        val subscription =
            Subscription.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(Subscription.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .schedule(
                    Subscription.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(Subscription.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
                .build()
        assertThat(subscription).isNotNull
        assertThat(subscription.id()).isEqualTo("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(subscription.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(subscription.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(subscription.frequency()).isEqualTo(Subscription.Frequency.FIXED)
        assertThat(subscription.productVariantId()).isEqualTo("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(subscription.quantity()).isEqualTo(1L)
        assertThat(subscription.next()).isEqualTo("2025-02-01T19:36:19.000Z")
        assertThat(subscription.schedule())
            .isEqualTo(
                Subscription.Schedule.ofUnionMember1(
                    Subscription.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(Subscription.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
            )
    }
}
