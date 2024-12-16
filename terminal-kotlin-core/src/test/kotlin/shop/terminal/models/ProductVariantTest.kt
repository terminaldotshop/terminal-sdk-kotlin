// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductVariantTest {

    @Test
    fun createProductVariant() {
        val productVariant =
            ProductVariant.builder()
                .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .name("12oz")
                .price(2200L)
                .build()
        assertThat(productVariant).isNotNull
        assertThat(productVariant.id()).isEqualTo("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(productVariant.name()).isEqualTo("12oz")
        assertThat(productVariant.price()).isEqualTo(2200L)
    }
}
