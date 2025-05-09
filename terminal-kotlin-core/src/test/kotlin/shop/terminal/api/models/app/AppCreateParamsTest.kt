// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.app

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppCreateParamsTest {

    @Test
    fun create() {
        AppCreateParams.builder()
            .name("Example App")
            .redirectUri("https://example.com/callback")
            .build()
    }

    @Test
    fun body() {
        val params =
            AppCreateParams.builder()
                .name("Example App")
                .redirectUri("https://example.com/callback")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Example App")
        assertThat(body.redirectUri()).isEqualTo("https://example.com/callback")
    }
}
