// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppGetResponseTest {

    @Test
    fun createAppGetResponse() {
        val appGetResponse =
            AppGetResponse.builder()
                .data(
                    App.builder()
                        .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .name("Example App")
                        .redirectUri("https://example.com/callback")
                        .build()
                )
                .build()
        assertThat(appGetResponse).isNotNull
        assertThat(appGetResponse.data())
            .isEqualTo(
                App.builder()
                    .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .name("Example App")
                    .redirectUri("https://example.com/callback")
                    .build()
            )
    }
}
