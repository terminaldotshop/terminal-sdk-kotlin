// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.order

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderGetParamsTest {

    @Test
    fun create() {
        OrderGetParams.builder().id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun pathParams() {
        val params = OrderGetParams.builder().id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        assertThat(params._pathParam(0)).isEqualTo("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
