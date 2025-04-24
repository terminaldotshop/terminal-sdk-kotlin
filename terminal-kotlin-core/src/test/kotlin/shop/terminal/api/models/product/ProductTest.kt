// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.product

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class ProductTest {

    @Test
    fun create() {
        val product =
            Product.builder()
                .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .description(
                    "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                )
                .name("[object Object]")
                .addVariant(
                    ProductVariant.builder()
                        .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .name("12oz")
                        .price(2200L)
                        .description("A detailed description of this variant")
                        .tags(
                            ProductVariant.Tags.builder()
                                .app("app")
                                .marketEu(true)
                                .marketGlobal(true)
                                .marketNa(true)
                                .build()
                        )
                        .build()
                )
                .order(100L)
                .subscription(Product.Subscription.ALLOWED)
                .tags(
                    Product.Tags.builder()
                        .app("app")
                        .color("color")
                        .featured(true)
                        .marketEu(true)
                        .marketGlobal(true)
                        .marketNa(true)
                        .build()
                )
                .build()

        assertThat(product.id()).isEqualTo("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(product.description())
            .isEqualTo(
                "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
            )
        assertThat(product.name()).isEqualTo("[object Object]")
        assertThat(product.variants())
            .containsExactly(
                ProductVariant.builder()
                    .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .name("12oz")
                    .price(2200L)
                    .description("A detailed description of this variant")
                    .tags(
                        ProductVariant.Tags.builder()
                            .app("app")
                            .marketEu(true)
                            .marketGlobal(true)
                            .marketNa(true)
                            .build()
                    )
                    .build()
            )
        assertThat(product.order()).isEqualTo(100L)
        assertThat(product.subscription()).isEqualTo(Product.Subscription.ALLOWED)
        assertThat(product.tags())
            .isEqualTo(
                Product.Tags.builder()
                    .app("app")
                    .color("color")
                    .featured(true)
                    .marketEu(true)
                    .marketGlobal(true)
                    .marketNa(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val product =
            Product.builder()
                .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .description(
                    "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                )
                .name("[object Object]")
                .addVariant(
                    ProductVariant.builder()
                        .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .name("12oz")
                        .price(2200L)
                        .description("A detailed description of this variant")
                        .tags(
                            ProductVariant.Tags.builder()
                                .app("app")
                                .marketEu(true)
                                .marketGlobal(true)
                                .marketNa(true)
                                .build()
                        )
                        .build()
                )
                .order(100L)
                .subscription(Product.Subscription.ALLOWED)
                .tags(
                    Product.Tags.builder()
                        .app("app")
                        .color("color")
                        .featured(true)
                        .marketEu(true)
                        .marketGlobal(true)
                        .marketNa(true)
                        .build()
                )
                .build()

        val roundtrippedProduct =
            jsonMapper.readValue(jsonMapper.writeValueAsString(product), jacksonTypeRef<Product>())

        assertThat(roundtrippedProduct).isEqualTo(product)
    }
}
