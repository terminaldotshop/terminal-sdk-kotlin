// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TokenGetResponseTest {

    @Test
    fun createTokenGetResponse() {
        val tokenGetResponse =
            TokenGetResponse.builder()
                .data(
                    Token.builder()
                        .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .token("terminal_test_************XXXX")
                        .time(Token.Time.builder().created("2024-06-29T19:36:19.000Z").build())
                        .build()
                )
                .build()
        assertThat(tokenGetResponse).isNotNull
        assertThat(tokenGetResponse.data())
            .isEqualTo(
                Token.builder()
                    .id("pat_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .token("terminal_test_************XXXX")
                    .time(Token.Time.builder().created("2024-06-29T19:36:19.000Z").build())
                    .build()
            )
    }
}