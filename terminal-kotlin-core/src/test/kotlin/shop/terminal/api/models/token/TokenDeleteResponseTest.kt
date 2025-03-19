// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.token

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenDeleteResponseTest {

    @Test
    fun create() {
        val tokenDeleteResponse =
            TokenDeleteResponse.builder().data(TokenDeleteResponse.Data.OK).build()

        assertThat(tokenDeleteResponse.data()).isEqualTo(TokenDeleteResponse.Data.OK)
    }
}
