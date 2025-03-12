// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.view.ViewInitParams

@ExtendWith(TestServerExtension::class)
class ViewServiceAsyncTest {

    @Test
    suspend fun init() {
      val client = TerminalOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .bearerToken("My Bearer Token")
          .build()
      val viewServiceAsync = client.view()

      val response = viewServiceAsync.init()

      response.validate()
    }
}
