// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDeleteParamsTest {

    @Test
    fun createCardDeleteParams() {
        CardDeleteParams.builder().id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun getPathParam() {
        val params = CardDeleteParams.builder().id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}