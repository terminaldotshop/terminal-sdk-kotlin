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
    fun getPathParam() {
        val params = OrderGetParams.builder().id("ord_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
