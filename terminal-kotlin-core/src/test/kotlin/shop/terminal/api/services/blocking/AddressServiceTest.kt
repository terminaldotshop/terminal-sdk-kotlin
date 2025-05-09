// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.address.AddressCreateParams

@ExtendWith(TestServerExtension::class)
internal class AddressServiceTest {

    @Test
    fun create() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addressService = client.address()

        val address =
            addressService.create(
                AddressCreateParams.builder()
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

        address.validate()
    }

    @Test
    fun list() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addressService = client.address()

        val addresses = addressService.list()

        addresses.validate()
    }

    @Test
    fun delete() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addressService = client.address()

        val address = addressService.delete("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")

        address.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addressService = client.address()

        val address = addressService.get("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")

        address.validate()
    }
}
