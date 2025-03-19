// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressCreateResponseTest {

    @Test
    fun create() {
        val addressCreateResponse =
            AddressCreateResponse.builder().data("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        assertThat(addressCreateResponse.data()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }
}
