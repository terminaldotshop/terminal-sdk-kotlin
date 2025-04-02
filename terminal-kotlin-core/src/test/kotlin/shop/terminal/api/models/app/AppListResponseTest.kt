// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.app

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedAppListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appListResponse),
                jacksonTypeRef<AppListResponse>(),
            )

        assertThat(roundtrippedAppListResponse).isEqualTo(appListResponse)
    }
}
