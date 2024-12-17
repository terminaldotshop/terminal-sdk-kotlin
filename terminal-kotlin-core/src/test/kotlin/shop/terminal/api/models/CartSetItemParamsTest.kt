// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartSetItemParamsTest {

    @Test
    fun createCartSetItemParams() {
        CartSetItemParams.builder()
            .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .quantity(2L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CartSetItemParams.builder()
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(2L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.productVariantId()).isEqualTo("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.quantity()).isEqualTo(2L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CartSetItemParams.builder()
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(2L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.productVariantId()).isEqualTo("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.quantity()).isEqualTo(2L)
    }
}
