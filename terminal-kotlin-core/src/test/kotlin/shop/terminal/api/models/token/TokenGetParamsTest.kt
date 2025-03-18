// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.token

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenGetParamsTest {

    @Test
    fun create() {
        TokenGetParams.builder().id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun pathParams() {
        val params = TokenGetParams.builder().id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        assertThat(params._pathParam(0)).isEqualTo("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
