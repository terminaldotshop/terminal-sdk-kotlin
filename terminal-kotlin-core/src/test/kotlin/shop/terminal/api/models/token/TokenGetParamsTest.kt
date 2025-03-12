// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.token

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenGetParamsTest {

    @Test
    fun create() {
        TokenGetParams.builder().id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun getPathParam() {
        val params = TokenGetParams.builder().id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
