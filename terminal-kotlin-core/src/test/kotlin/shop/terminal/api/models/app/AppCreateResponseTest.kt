// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.app

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class AppCreateResponseTest {

    @Test
    fun create() {
        val appCreateResponse =
            AppCreateResponse.builder()
                .data(
                    AppCreateResponse.Data.builder()
                        .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .secret("sec_******XXXX")
                        .build()
                )
                .build()

        assertThat(appCreateResponse.data())
            .isEqualTo(
                AppCreateResponse.Data.builder()
                    .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .secret("sec_******XXXX")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appCreateResponse =
            AppCreateResponse.builder()
                .data(
                    AppCreateResponse.Data.builder()
                        .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .secret("sec_******XXXX")
                        .build()
                )
                .build()

        val roundtrippedAppCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appCreateResponse),
                jacksonTypeRef<AppCreateResponse>(),
            )

        assertThat(roundtrippedAppCreateResponse).isEqualTo(appCreateResponse)
    }
}
