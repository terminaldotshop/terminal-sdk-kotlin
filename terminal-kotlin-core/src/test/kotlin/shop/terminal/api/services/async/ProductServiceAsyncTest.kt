// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.product.ProductGetParams
import shop.terminal.api.models.product.ProductListParams

@ExtendWith(TestServerExtension::class)
class ProductServiceAsyncTest {

    @Test
    suspend fun list() {
      val client = TerminalOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val productServiceAsync = client.product()

      val product = productServiceAsync.list()

      product.validate()
    }

    @Test
    suspend fun get() {
      val client = TerminalOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val productServiceAsync = client.product()

      val product = productServiceAsync.get(ProductGetParams.builder()
          .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
          .build())

      product.validate()
    }
}
