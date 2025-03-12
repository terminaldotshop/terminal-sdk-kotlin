// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.token

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenCreateResponseTest {

    @Test
    fun createTokenCreateResponse() {
      val tokenCreateResponse = TokenCreateResponse.builder()
          .data(TokenCreateResponse.Data.builder()
              .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
              .token("trm_test_******XXXX")
              .build())
          .build()
      assertThat(tokenCreateResponse).isNotNull
      assertThat(tokenCreateResponse.data()).isEqualTo(TokenCreateResponse.Data.builder()
          .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
          .token("trm_test_******XXXX")
          .build())
    }
}
