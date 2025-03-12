// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.product

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductGetParamsTest {

    @Test
    fun create() {
      ProductGetParams.builder()
          .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = ProductGetParams.builder()
          .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
          .build()
      assertThat(params).isNotNull
      // path param "id"
      assertThat(params.getPathParam(0)).isEqualTo("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
