// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.app

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppListResponseTest {

    @Test
    fun create() {
        val appListResponse =
            AppListResponse.builder()
                .addData(
                    App.builder()
                        .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .name("Example App")
                        .redirectUri("https://example.com/callback")
                        .secret("sec_******XXXX")
                        .build()
                )
                .build()

        assertThat(appListResponse.data())
            .containsExactly(
                App.builder()
                    .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .name("Example App")
                    .redirectUri("https://example.com/callback")
                    .secret("sec_******XXXX")
                    .build()
            )
    }
}
