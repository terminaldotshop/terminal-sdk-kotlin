// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppDeleteParamsTest {

    @Test
    fun create() {
        AppDeleteParams.builder().id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun getPathParam() {
        val params = AppDeleteParams.builder().id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
