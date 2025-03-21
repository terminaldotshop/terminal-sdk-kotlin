// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CartSetItemParamsTest {

    @Test
    fun create() {
        CartSetItemParams.builder()
            .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .quantity(2L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CartSetItemParams.builder()
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(2L)
                .build()

        val body = params._body()

        assertThat(body.productVariantId()).isEqualTo("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.quantity()).isEqualTo(2L)
    }
}
