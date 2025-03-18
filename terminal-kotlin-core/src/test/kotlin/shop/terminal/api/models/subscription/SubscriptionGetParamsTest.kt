// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.subscription

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionGetParamsTest {

    @Test
    fun create() {
        SubscriptionGetParams.builder().id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun pathParams() {
        val params = SubscriptionGetParams.builder().id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        assertThat(params._pathParam(0)).isEqualTo("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
