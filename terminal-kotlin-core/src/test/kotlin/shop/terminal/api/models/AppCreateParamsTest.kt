// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppCreateParamsTest {

    @Test
    fun create() {
        AppCreateParams.builder()
            .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
            .name("Example App")
            .redirectUri("https://example.com/callback")
            .build()
    }

    @Test
    fun body() {
        val params =
            AppCreateParams.builder()
                .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .name("Example App")
                .redirectUri("https://example.com/callback")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.name()).isEqualTo("Example App")
        assertThat(body.redirectUri()).isEqualTo("https://example.com/callback")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AppCreateParams.builder()
                .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .name("Example App")
                .redirectUri("https://example.com/callback")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(body.name()).isEqualTo("Example App")
        assertThat(body.redirectUri()).isEqualTo("https://example.com/callback")
    }
}
