// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.subscription

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUpdateParamsTest {

    @Test
    fun create() {
        SubscriptionUpdateParams.builder()
            .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .schedule(
                SubscriptionUpdateParams.Schedule.Weekly.builder()
                    .interval(3L)
                    .type(SubscriptionUpdateParams.Schedule.Weekly.Type.WEEKLY)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = SubscriptionUpdateParams.builder().id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        assertThat(params._pathParam(0)).isEqualTo("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionUpdateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .schedule(
                    SubscriptionUpdateParams.Schedule.Weekly.builder()
                        .interval(3L)
                        .type(SubscriptionUpdateParams.Schedule.Weekly.Type.WEEKLY)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.schedule())
            .isEqualTo(
                SubscriptionUpdateParams.Schedule.ofWeekly(
                    SubscriptionUpdateParams.Schedule.Weekly.builder()
                        .interval(3L)
                        .type(SubscriptionUpdateParams.Schedule.Weekly.Type.WEEKLY)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubscriptionUpdateParams.builder().id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        val body = params._body()
    }
}
