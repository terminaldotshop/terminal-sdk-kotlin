// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.subscription

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class SubscriptionUpdateResponseTest {

    @Test
    fun create() {
        val subscriptionUpdateResponse =
            SubscriptionUpdateResponse.builder()
                .data(
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

        assertThat(subscriptionUpdateResponse.data())
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
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionUpdateResponse =
            SubscriptionUpdateResponse.builder()
                .data(
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

        val roundtrippedSubscriptionUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionUpdateResponse),
                jacksonTypeRef<SubscriptionUpdateResponse>(),
            )

        assertThat(roundtrippedSubscriptionUpdateResponse).isEqualTo(subscriptionUpdateResponse)
    }
}
