// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressDeleteResponseTest {

    @Test
    fun create() {
        val addressDeleteResponse =
            AddressDeleteResponse.builder().data(AddressDeleteResponse.Data.OK).build()

        assertThat(addressDeleteResponse.data()).isEqualTo(AddressDeleteResponse.Data.OK)
    }
}
