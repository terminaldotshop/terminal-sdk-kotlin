// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.order

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.JsonValue

class OrderCreateParamsTest {

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

        assertNotNull(body)
        assertThat(body.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.variants())
            .isEqualTo(
                OrderCreateParams.Variants.builder()
                    .putAdditionalProperty("var_XXXXXXXXXXXXXXXXXXXXXXXXX", JsonValue.from(1))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
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

        assertNotNull(body)
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
