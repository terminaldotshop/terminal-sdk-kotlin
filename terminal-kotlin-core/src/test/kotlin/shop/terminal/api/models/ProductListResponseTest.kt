// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.JsonValue

class ProductListResponseTest {

    @Test
    fun createProductListResponse() {
        val productListResponse =
            ProductListResponse.builder()
                .addData(
                    Product.builder()
                        .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .description(
                            "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                        )
                        .addFilter(Product.Filter.EU)
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
                                .putAdditionalProperty("featured", JsonValue.from("true"))
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(productListResponse).isNotNull
        assertThat(productListResponse.data())
            .containsExactly(
                Product.builder()
                    .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .description(
                        "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                    )
                    .addFilter(Product.Filter.EU)
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
                            .putAdditionalProperty("featured", JsonValue.from("true"))
                            .build()
                    )
                    .build()
            )
    }
}
