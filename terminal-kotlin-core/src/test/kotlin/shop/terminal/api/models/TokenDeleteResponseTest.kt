// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenDeleteResponseTest {

    @Test
    fun createTokenDeleteResponse() {
        val tokenDeleteResponse =
            TokenDeleteResponse.builder().data(TokenDeleteResponse.Data.OK).build()
        assertThat(tokenDeleteResponse).isNotNull
        assertThat(tokenDeleteResponse.data()).isEqualTo(TokenDeleteResponse.Data.OK)
    }
}
