// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.product

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductGetParamsTest {

    @Test
    fun create() {
        ProductGetParams.builder().id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun pathParams() {
        val params = ProductGetParams.builder().id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        assertThat(params._pathParam(0)).isEqualTo("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
