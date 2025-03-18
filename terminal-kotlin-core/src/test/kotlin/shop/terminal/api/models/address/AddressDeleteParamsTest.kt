// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressDeleteParamsTest {

    @Test
    fun create() {
        AddressDeleteParams.builder().id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun getPathParam() {
        val params = AddressDeleteParams.builder().id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
