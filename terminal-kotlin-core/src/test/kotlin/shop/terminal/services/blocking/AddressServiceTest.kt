// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.TestServerExtension
import shop.terminal.client.okhttp.TerminalOkHttpClient
import shop.terminal.models.AddressCreateParams
import shop.terminal.models.AddressDeleteParams
import shop.terminal.models.AddressListParams

@ExtendWith(TestServerExtension::class)
class AddressServiceTest {

    @Test
    fun callCreate() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addressService = client.address()
        val addressCreateResponse =
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
        println(addressCreateResponse)
        addressCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addressService = client.address()
        val addressListResponse = addressService.list(AddressListParams.builder().build())
        println(addressListResponse)
        addressListResponse.validate()
    }

    @Test
    fun callDelete() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addressService = client.address()
        val addressDeleteResponse =
            addressService.delete(
                AddressDeleteParams.builder().id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )
        println(addressDeleteResponse)
        addressDeleteResponse.validate()
    }
}
