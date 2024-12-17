// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartSetAddressParamsTest {

    @Test
    fun createCartSetAddressParams() {
        CartSetAddressParams.builder().addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun getBody() {
        val params =
            CartSetAddressParams.builder().addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CartSetAddressParams.builder().addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }
}
