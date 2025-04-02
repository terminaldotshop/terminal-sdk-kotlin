// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class AddressDeleteResponseTest {

    @Test
    fun create() {
        val addressDeleteResponse =
            AddressDeleteResponse.builder().data(AddressDeleteResponse.Data.OK).build()

        assertThat(addressDeleteResponse.data()).isEqualTo(AddressDeleteResponse.Data.OK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addressDeleteResponse =
            AddressDeleteResponse.builder().data(AddressDeleteResponse.Data.OK).build()

        val roundtrippedAddressDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addressDeleteResponse),
                jacksonTypeRef<AddressDeleteResponse>(),
            )

        assertThat(roundtrippedAddressDeleteResponse).isEqualTo(addressDeleteResponse)
    }
}
