// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartSetAddressParamsTest {

    @Test
    fun create() {
        CartSetAddressParams.builder().addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun body() {
        val params =
            CartSetAddressParams.builder().addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CartSetAddressParams.builder().addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.addressId()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }
}
