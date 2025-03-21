// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.order

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.JsonValue

internal class OrderCreateParamsTest {

    @Test
    fun create() {
        OrderCreateParams.builder()
            .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .variants(
                OrderCreateParams.Variants.builder()
                    .putAdditionalProperty("var_XXXXXXXXXXXXXXXXXXXXXXXXX", JsonValue.from(1))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            OrderCreateParams.builder()
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .variants(
                    OrderCreateParams.Variants.builder()
                        .putAdditionalProperty("var_XXXXXXXXXXXXXXXXXXXXXXXXX", JsonValue.from(1))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.variants())
            .isEqualTo(
                OrderCreateParams.Variants.builder()
                    .putAdditionalProperty("var_XXXXXXXXXXXXXXXXXXXXXXXXX", JsonValue.from(1))
                    .build()
            )
    }
}
