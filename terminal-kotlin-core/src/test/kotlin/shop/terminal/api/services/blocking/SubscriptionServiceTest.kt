// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.SubscriptionCreateParams
import shop.terminal.api.models.SubscriptionDeleteParams
import shop.terminal.api.models.SubscriptionListParams

@ExtendWith(TestServerExtension::class)
class SubscriptionServiceTest {

    @Test
    fun callCreate() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscription()
        val subscriptionCreateResponse =
            subscriptionService.create(
                SubscriptionCreateParams.builder()
                    .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .frequency(SubscriptionCreateParams.Frequency.FIXED)
                    .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .quantity(1L)
                    .next("2025-02-01T19:36:19.000Z")
                    .schedule(
                        SubscriptionCreateParams.Schedule.Weekly.builder()
                            .interval(3L)
                            .type(SubscriptionCreateParams.Schedule.Weekly.Type.WEEKLY)
                            .build()
                    )
                    .build()
            )
        println(subscriptionCreateResponse)
        subscriptionCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscription()
        val subscriptionListResponse =
            subscriptionService.list(SubscriptionListParams.builder().build())
        println(subscriptionListResponse)
        subscriptionListResponse.validate()
    }

    @Test
    fun callDelete() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscription()
        val subscriptionDeleteResponse =
            subscriptionService.delete(
                SubscriptionDeleteParams.builder().id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )
        println(subscriptionDeleteResponse)
        subscriptionDeleteResponse.validate()
    }
}
