// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.product.ProductGetParams
import shop.terminal.api.models.product.ProductListParams

@ExtendWith(TestServerExtension::class)
class ProductServiceTest {

    @Test
    fun list() {
      val client = TerminalOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val productService = client.product()

      val product = productService.list()

      product.validate()
    }

    @Test
    fun get() {
      val client = TerminalOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val productService = client.product()

      val product = productService.get(ProductGetParams.builder()
          .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
          .build())

      product.validate()
    }
}
