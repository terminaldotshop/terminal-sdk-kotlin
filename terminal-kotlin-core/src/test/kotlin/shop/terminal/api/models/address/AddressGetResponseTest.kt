// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class AddressGetResponseTest {

    @Test
    fun create() {
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedAddressGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addressGetResponse),
                jacksonTypeRef<AddressGetResponse>(),
            )

        assertThat(roundtrippedAddressGetResponse).isEqualTo(addressGetResponse)
    }
}
