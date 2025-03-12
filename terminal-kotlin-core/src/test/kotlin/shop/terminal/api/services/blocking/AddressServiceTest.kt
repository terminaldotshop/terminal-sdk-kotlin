// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.address.AddressCreateParams
import shop.terminal.api.models.address.AddressDeleteParams
import shop.terminal.api.models.address.AddressGetParams
import shop.terminal.api.models.address.AddressListParams

@ExtendWith(TestServerExtension::class)
class AddressServiceTest {

    @Test
    fun create() {
      val client = TerminalOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val addressService = client.address()

      val address = addressService.create(AddressCreateParams.builder()
          .city("Anytown")
          .country("US")
          .name("John Doe")
          .street1("123 Main St")
          .zip("12345")
          .phone("5555555555")
          .province("CA")
          .street2("Apt 1")
          .build())

      address.validate()
    }

    @Test
    fun list() {
      val client = TerminalOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val addressService = client.address()

      val address = addressService.list()

      address.validate()
    }

    @Test
    fun delete() {
      val client = TerminalOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val addressService = client.address()

      val address = addressService.delete(AddressDeleteParams.builder()
          .id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
          .build())

      address.validate()
    }

    @Test
    fun get() {
      val client = TerminalOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val addressService = client.address()

      val address = addressService.get(AddressGetParams.builder()
          .id("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
          .build())

      address.validate()
    }
}
