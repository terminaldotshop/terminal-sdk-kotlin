// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.token

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class TokenDeleteResponseTest {

    @Test
    fun create() {
        val tokenDeleteResponse =
            TokenDeleteResponse.builder().data(TokenDeleteResponse.Data.OK).build()

        assertThat(tokenDeleteResponse.data()).isEqualTo(TokenDeleteResponse.Data.OK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenDeleteResponse =
            TokenDeleteResponse.builder().data(TokenDeleteResponse.Data.OK).build()

        val roundtrippedTokenDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenDeleteResponse),
                jacksonTypeRef<TokenDeleteResponse>(),
            )

        assertThat(roundtrippedTokenDeleteResponse).isEqualTo(tokenDeleteResponse)
    }
}
