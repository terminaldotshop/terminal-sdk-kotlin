// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.subscription

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class SubscriptionDeleteResponseTest {

    @Test
    fun create() {
        val subscriptionDeleteResponse =
            SubscriptionDeleteResponse.builder().data(SubscriptionDeleteResponse.Data.OK).build()

        assertThat(subscriptionDeleteResponse.data()).isEqualTo(SubscriptionDeleteResponse.Data.OK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionDeleteResponse =
            SubscriptionDeleteResponse.builder().data(SubscriptionDeleteResponse.Data.OK).build()

        val roundtrippedSubscriptionDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionDeleteResponse),
                jacksonTypeRef<SubscriptionDeleteResponse>(),
            )

        assertThat(roundtrippedSubscriptionDeleteResponse).isEqualTo(subscriptionDeleteResponse)
    }
}
