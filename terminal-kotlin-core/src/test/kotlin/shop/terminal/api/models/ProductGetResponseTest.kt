// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductGetResponseTest {

    @Test
    fun createProductGetResponse() {
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
                                .marketNa(true)
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(productGetResponse).isNotNull
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
                            .marketNa(true)
                            .build()
                    )
                    .build()
            )
    }
}
