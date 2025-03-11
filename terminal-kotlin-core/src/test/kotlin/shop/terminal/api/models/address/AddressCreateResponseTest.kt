// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddressCreateResponseTest {

    @Test
    fun createAddressCreateResponse() {
        val addressCreateResponse =
            AddressCreateResponse.builder().data("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        assertThat(addressCreateResponse).isNotNull
        assertThat(addressCreateResponse.data()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }
}
