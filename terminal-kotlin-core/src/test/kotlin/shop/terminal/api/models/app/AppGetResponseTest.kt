// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.app

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class AppGetResponseTest {

    @Test
    fun create() {
        val appGetResponse =
            AppGetResponse.builder()
                .data(
                    App.builder()
                        .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .name("Example App")
                        .redirectUri("https://example.com/callback")
                        .secret("sec_******XXXX")
                        .build()
                )
                .build()

        assertThat(appGetResponse.data())
            .isEqualTo(
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
        val appGetResponse =
            AppGetResponse.builder()
                .data(
                    App.builder()
                        .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .name("Example App")
                        .redirectUri("https://example.com/callback")
                        .secret("sec_******XXXX")
                        .build()
                )
                .build()

        val roundtrippedAppGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appGetResponse),
                jacksonTypeRef<AppGetResponse>(),
            )

        assertThat(roundtrippedAppGetResponse).isEqualTo(appGetResponse)
    }
}
