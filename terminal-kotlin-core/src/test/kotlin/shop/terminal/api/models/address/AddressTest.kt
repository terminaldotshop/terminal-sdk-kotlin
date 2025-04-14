// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class AddressTest {

    @Test
    fun create() {
        val address =
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

        assertThat(address.id()).isEqualTo("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(address.city()).isEqualTo("Anytown")
        assertThat(address.country()).isEqualTo("US")
        assertThat(address.created()).isEqualTo("2024-06-29T19:36:19.000Z")
        assertThat(address.name()).isEqualTo("John Doe")
        assertThat(address.street1()).isEqualTo("123 Main St")
        assertThat(address.zip()).isEqualTo("12345")
        assertThat(address.phone()).isEqualTo("5555555555")
        assertThat(address.province()).isEqualTo("CA")
        assertThat(address.street2()).isEqualTo("Apt 1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val address =
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

        val roundtrippedAddress =
            jsonMapper.readValue(jsonMapper.writeValueAsString(address), jacksonTypeRef<Address>())

        assertThat(roundtrippedAddress).isEqualTo(address)
    }
}
