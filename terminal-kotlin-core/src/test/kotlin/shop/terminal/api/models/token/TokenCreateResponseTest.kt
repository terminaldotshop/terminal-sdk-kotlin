// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.token

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class TokenCreateResponseTest {

    @Test
    fun create() {
        val tokenCreateResponse =
            TokenCreateResponse.builder()
                .data(
                    TokenCreateResponse.Data.builder()
                        .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .token("trm_test_******XXXX")
                        .build()
                )
                .build()

        assertThat(tokenCreateResponse.data())
            .isEqualTo(
                TokenCreateResponse.Data.builder()
                    .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .token("trm_test_******XXXX")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenCreateResponse =
            TokenCreateResponse.builder()
                .data(
                    TokenCreateResponse.Data.builder()
                        .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .token("trm_test_******XXXX")
                        .build()
                )
                .build()

        val roundtrippedTokenCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenCreateResponse),
                jacksonTypeRef<TokenCreateResponse>(),
            )

        assertThat(roundtrippedTokenCreateResponse).isEqualTo(tokenCreateResponse)
    }
}
