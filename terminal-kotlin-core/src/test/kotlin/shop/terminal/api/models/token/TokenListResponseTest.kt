// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.token

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class TokenListResponseTest {

    @Test
    fun create() {
        val tokenListResponse =
            TokenListResponse.builder()
                .addData(
                    Token.builder()
                        .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .token("trm_test_******XXXX")
                        .created("2024-06-29T19:36:19.000Z")
                        .build()
                )
                .build()

        assertThat(tokenListResponse.data())
            .containsExactly(
                Token.builder()
                    .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .token("trm_test_******XXXX")
                    .created("2024-06-29T19:36:19.000Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenListResponse =
            TokenListResponse.builder()
                .addData(
                    Token.builder()
                        .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .token("trm_test_******XXXX")
                        .created("2024-06-29T19:36:19.000Z")
                        .build()
                )
                .build()

        val roundtrippedTokenListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenListResponse),
                jacksonTypeRef<TokenListResponse>(),
            )

        assertThat(roundtrippedTokenListResponse).isEqualTo(tokenListResponse)
    }
}
