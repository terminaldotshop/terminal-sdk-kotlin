// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.product

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class ProductGetResponseTest {

    @Test
    fun create() {
        val productGetResponse =
            ProductGetResponse.builder()
                .data(
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
                )
                .build()

        assertThat(productGetResponse.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productGetResponse =
            ProductGetResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedProductGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productGetResponse),
                jacksonTypeRef<ProductGetResponse>(),
            )

        assertThat(roundtrippedProductGetResponse).isEqualTo(productGetResponse)
    }
}
