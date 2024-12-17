// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenTest {

    @Test
    fun createToken() {
        val token =
            Token.builder()
                .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .token("terminal_test_************XXXX")
                .time(Token.Time.builder().created("2024-06-29T19:36:19.000Z").build())
                .build()
        assertThat(token).isNotNull
        assertThat(token.id()).isEqualTo("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(token.token()).isEqualTo("terminal_test_************XXXX")
        assertThat(token.time())
            .isEqualTo(Token.Time.builder().created("2024-06-29T19:36:19.000Z").build())
    }
}
