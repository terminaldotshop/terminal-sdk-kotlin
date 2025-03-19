// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.subscription

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateResponseTest {

    @Test
    fun create() {
        val subscriptionCreateResponse =
            SubscriptionCreateResponse.builder().data(SubscriptionCreateResponse.Data.OK).build()

        assertThat(subscriptionCreateResponse.data()).isEqualTo(SubscriptionCreateResponse.Data.OK)
    }
}
