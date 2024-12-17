// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppListResponseTest {

    @Test
    fun createAppListResponse() {
        val appListResponse =
            AppListResponse.builder()
                .data(
                    listOf(
                        App.builder()
                            .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .name("Example App")
                            .redirectUri("https://example.com/callback")
                            .build()
                    )
                )
                .build()
        assertThat(appListResponse).isNotNull
        assertThat(appListResponse.data())
            .containsExactly(
                App.builder()
                    .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .name("Example App")
                    .redirectUri("https://example.com/callback")
                    .build()
            )
    }
}
