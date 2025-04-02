// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.app

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val app =
            App.builder()
                .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .name("Example App")
                .redirectUri("https://example.com/callback")
                .secret("sec_******XXXX")
                .build()

        val roundtrippedApp =
            jsonMapper.readValue(jsonMapper.writeValueAsString(app), jacksonTypeRef<App>())

        assertThat(roundtrippedApp).isEqualTo(app)
    }
}
