// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.token

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class TokenTest {

    @Test
    fun create() {
        val token =
            Token.builder()
                .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .token("trm_test_******XXXX")
                .created("2024-06-29T19:36:19.000Z")
                .build()

        assertThat(token.id()).isEqualTo("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(token.token()).isEqualTo("trm_test_******XXXX")
        assertThat(token.created()).isEqualTo("2024-06-29T19:36:19.000Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val token =
            Token.builder()
                .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .token("trm_test_******XXXX")
                .created("2024-06-29T19:36:19.000Z")
                .build()

        val roundtrippedToken =
            jsonMapper.readValue(jsonMapper.writeValueAsString(token), jacksonTypeRef<Token>())

        assertThat(roundtrippedToken).isEqualTo(token)
    }
}
