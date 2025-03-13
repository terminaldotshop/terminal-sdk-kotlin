// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.subscription

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionGetParamsTest {

    @Test
    fun create() {
      SubscriptionGetParams.builder()
          .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = SubscriptionGetParams.builder()
          .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
          .build()
      assertThat(params).isNotNull
      // path param "id"
      assertThat(params.getPathParam(0)).isEqualTo("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
