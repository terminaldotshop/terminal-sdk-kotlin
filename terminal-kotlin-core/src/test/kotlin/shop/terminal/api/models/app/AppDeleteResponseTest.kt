// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.app

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class AppDeleteResponseTest {

    @Test
    fun create() {
        val appDeleteResponse = AppDeleteResponse.builder().data(AppDeleteResponse.Data.OK).build()

        assertThat(appDeleteResponse.data()).isEqualTo(AppDeleteResponse.Data.OK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appDeleteResponse = AppDeleteResponse.builder().data(AppDeleteResponse.Data.OK).build()

        val roundtrippedAppDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appDeleteResponse),
                jacksonTypeRef<AppDeleteResponse>(),
            )

        assertThat(roundtrippedAppDeleteResponse).isEqualTo(appDeleteResponse)
    }
}
