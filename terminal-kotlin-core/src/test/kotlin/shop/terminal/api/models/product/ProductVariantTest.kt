// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.product

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductVariantTest {

    @Test
    fun create() {
        val productVariant =
            ProductVariant.builder()
                .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .name("12oz")
                .price(2200L)
                .build()

        assertThat(productVariant.id()).isEqualTo("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(productVariant.name()).isEqualTo("12oz")
        assertThat(productVariant.price()).isEqualTo(2200L)
    }
}
