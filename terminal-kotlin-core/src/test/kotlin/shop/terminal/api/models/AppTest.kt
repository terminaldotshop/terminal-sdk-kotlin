// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppTest {

    @Test
    fun createApp() {
        val app =
            App.builder()
                .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .name("Example App")
                .redirectUri("https://example.com/callback")
                .build()
        assertThat(app).isNotNull
        assertThat(app.id()).isEqualTo("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(app.name()).isEqualTo("Example App")
        assertThat(app.redirectUri()).isEqualTo("https://example.com/callback")
    }
}
