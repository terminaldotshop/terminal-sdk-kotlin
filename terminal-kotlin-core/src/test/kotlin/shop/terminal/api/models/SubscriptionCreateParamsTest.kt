// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionCreateParamsTest {

    @Test
    fun createSubscriptionCreateParams() {
        SubscriptionCreateParams.builder()
            .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .frequency(SubscriptionCreateParams.Frequency.FIXED)
            .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .quantity(1L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.frequency()).isEqualTo(SubscriptionCreateParams.Frequency.FIXED)
        assertThat(body.productVariantId()).isEqualTo("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.quantity()).isEqualTo(1L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.frequency()).isEqualTo(SubscriptionCreateParams.Frequency.FIXED)
        assertThat(body.productVariantId()).isEqualTo("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.quantity()).isEqualTo(1L)
    }
}
