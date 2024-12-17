// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddressDeleteResponseTest {

    @Test
    fun createAddressDeleteResponse() {
        val addressDeleteResponse =
            AddressDeleteResponse.builder().data(AddressDeleteResponse.Data.OK).build()
        assertThat(addressDeleteResponse).isNotNull
        assertThat(addressDeleteResponse.data()).isEqualTo(AddressDeleteResponse.Data.OK)
    }
}
