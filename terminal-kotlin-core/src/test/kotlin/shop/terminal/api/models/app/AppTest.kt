// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.app

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppTest {

    @Test
    fun create() {
        val app =
            App.builder()
                .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .name("Example App")
                .redirectUri("https://example.com/callback")
                .secret("sec_******XXXX")
                .build()

        assertThat(app.id()).isEqualTo("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(app.name()).isEqualTo("Example App")
        assertThat(app.redirectUri()).isEqualTo("https://example.com/callback")
        assertThat(app.secret()).isEqualTo("sec_******XXXX")
    }
}
