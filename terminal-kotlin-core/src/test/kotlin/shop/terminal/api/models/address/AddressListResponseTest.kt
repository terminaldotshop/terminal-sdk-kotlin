// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddressListResponseTest {

    @Test
    fun createAddressListResponse() {
        val addressListResponse =
            AddressListResponse.builder()
                .addData(
                    Address.builder()
                        .id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .city("Anytown")
                        .country("US")
                        .name("John Doe")
                        .street1("123 Main St")
                        .zip("12345")
                        .phone("5555555555")
                        .province("CA")
                        .street2("Apt 1")
                        .build()
                )
                .build()
        assertThat(addressListResponse).isNotNull
        assertThat(addressListResponse.data())
            .containsExactly(
                Address.builder()
                    .id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .city("Anytown")
                    .country("US")
                    .name("John Doe")
                    .street1("123 Main St")
                    .zip("12345")
                    .phone("5555555555")
                    .province("CA")
                    .street2("Apt 1")
                    .build()
            )
    }
}
