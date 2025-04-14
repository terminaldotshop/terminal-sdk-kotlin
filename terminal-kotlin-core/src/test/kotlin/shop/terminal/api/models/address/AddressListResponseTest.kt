// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class AddressListResponseTest {

    @Test
    fun create() {
        val addressListResponse =
            AddressListResponse.builder()
                .addData(
                    Address.builder()
                        .id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .city("Anytown")
                        .country("US")
                        .created("2024-06-29T19:36:19.000Z")
                        .name("John Doe")
                        .street1("123 Main St")
                        .zip("12345")
                        .phone("5555555555")
                        .province("CA")
                        .street2("Apt 1")
                        .build()
                )
                .build()

        assertThat(addressListResponse.data())
            .containsExactly(
                Address.builder()
                    .id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .city("Anytown")
                    .country("US")
                    .created("2024-06-29T19:36:19.000Z")
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
        val addressListResponse =
            AddressListResponse.builder()
                .addData(
                    Address.builder()
                        .id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .city("Anytown")
                        .country("US")
                        .created("2024-06-29T19:36:19.000Z")
                        .name("John Doe")
                        .street1("123 Main St")
                        .zip("12345")
                        .phone("5555555555")
                        .province("CA")
                        .street2("Apt 1")
                        .build()
                )
                .build()

        val roundtrippedAddressListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addressListResponse),
                jacksonTypeRef<AddressListResponse>(),
            )

        assertThat(roundtrippedAddressListResponse).isEqualTo(addressListResponse)
    }
}
