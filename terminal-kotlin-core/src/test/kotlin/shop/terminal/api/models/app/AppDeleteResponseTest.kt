// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.app

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppDeleteResponseTest {

    @Test
    fun create() {
        val appDeleteResponse = AppDeleteResponse.builder().data(AppDeleteResponse.Data.OK).build()

        assertThat(appDeleteResponse.data()).isEqualTo(AppDeleteResponse.Data.OK)
    }
}
