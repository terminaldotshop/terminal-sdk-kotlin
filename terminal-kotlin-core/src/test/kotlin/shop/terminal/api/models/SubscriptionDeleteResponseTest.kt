// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionDeleteResponseTest {

    @Test
    fun createSubscriptionDeleteResponse() {
        val subscriptionDeleteResponse =
            SubscriptionDeleteResponse.builder().data(SubscriptionDeleteResponse.Data.OK).build()
        assertThat(subscriptionDeleteResponse).isNotNull
        assertThat(subscriptionDeleteResponse.data()).isEqualTo(SubscriptionDeleteResponse.Data.OK)
    }
}
