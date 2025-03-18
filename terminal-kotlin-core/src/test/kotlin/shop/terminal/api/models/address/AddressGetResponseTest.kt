// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressGetResponseTest {

    @Test
    fun createAddressGetResponse() {
        val addressGetResponse =
            AddressGetResponse.builder()
                .data(
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
        assertThat(addressGetResponse).isNotNull
        assertThat(addressGetResponse.data())
            .isEqualTo(
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
