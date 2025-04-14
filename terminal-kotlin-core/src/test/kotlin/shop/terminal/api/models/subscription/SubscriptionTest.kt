// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.subscription

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class SubscriptionTest {

    @Test
    fun create() {
        val subscription =
            Subscription.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .created("2024-06-29T19:36:19.000Z")
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

        assertThat(subscription.id()).isEqualTo("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(subscription.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(subscription.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(subscription.created()).isEqualTo("2024-06-29T19:36:19.000Z")
        assertThat(subscription.productVariantId()).isEqualTo("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(subscription.quantity()).isEqualTo(1L)
        assertThat(subscription.next()).isEqualTo("2025-02-01T19:36:19.000Z")
        assertThat(subscription.schedule())
            .isEqualTo(
                Subscription.Schedule.ofWeekly(
                    Subscription.Schedule.Weekly.builder()
                        .interval(3L)
                        .type(Subscription.Schedule.Weekly.Type.WEEKLY)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscription =
            Subscription.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .created("2024-06-29T19:36:19.000Z")
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

        val roundtrippedSubscription =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscription),
                jacksonTypeRef<Subscription>(),
            )

        assertThat(roundtrippedSubscription).isEqualTo(subscription)
    }
}
