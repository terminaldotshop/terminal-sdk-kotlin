// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartConvertParamsTest {

    @Test
    fun create() {
      CartConvertParams.builder()
          .recipientEmail("dev@stainless.com")
          .build()
    }

    @Test
    fun body() {
      val params = CartConvertParams.builder()
          .recipientEmail("dev@stainless.com")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.recipientEmail()).isEqualTo("dev@stainless.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = CartConvertParams.builder().build()

      val body = params._body()

      assertNotNull(body)
    }
}
