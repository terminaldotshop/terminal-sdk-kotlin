// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressGetParamsTest {

    @Test
    fun create() {
        AddressGetParams.builder().id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun pathParams() {
        val params = AddressGetParams.builder().id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        assertThat(params._pathParam(0)).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
