// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppCreateParamsTest {

    @Test
    fun create() {
        AppCreateParams.builder()
            .app(
                App.builder()
                    .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .name("Example App")
                    .redirectUri("https://example.com/callback")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AppCreateParams.builder()
                .app(
                    App.builder()
                        .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .name("Example App")
                        .redirectUri("https://example.com/callback")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                App.builder()
                    .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .name("Example App")
                    .redirectUri("https://example.com/callback")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AppCreateParams.builder()
                .app(
                    App.builder()
                        .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .name("Example App")
                        .redirectUri("https://example.com/callback")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                App.builder()
                    .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .name("Example App")
                    .redirectUri("https://example.com/callback")
                    .build()
            )
    }
}
