// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class AddressCreateResponseTest {

    @Test
    fun create() {
        val addressCreateResponse =
            AddressCreateResponse.builder().data("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        assertThat(addressCreateResponse.data()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addressCreateResponse =
            AddressCreateResponse.builder().data("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        val roundtrippedAddressCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addressCreateResponse),
                jacksonTypeRef<AddressCreateResponse>(),
            )

        assertThat(roundtrippedAddressCreateResponse).isEqualTo(addressCreateResponse)
    }
}
