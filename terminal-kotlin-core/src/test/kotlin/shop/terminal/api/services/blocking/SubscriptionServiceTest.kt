// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.Subscription
import shop.terminal.api.models.SubscriptionCreateParams
import shop.terminal.api.models.SubscriptionDeleteParams
import shop.terminal.api.models.SubscriptionGetParams

@ExtendWith(TestServerExtension::class)
class SubscriptionServiceTest {

    @Test
    fun create() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscription()

        val subscription =
            subscriptionService.create(
                SubscriptionCreateParams.builder()
                    .subscription(
                        Subscription.builder()
                            .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .quantity(1L)
                            .next("2025-02-01T19:36:19.000Z")
                            .schedule(
                                Subscription.Schedule.Weekly.builder()
                                    .interval(3L)
                                    .type(Subscription.Schedule.Weekly.Type.WEEKLY)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        subscription.validate()
    }

    @Test
    fun list() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscription()

        val subscription = subscriptionService.list()

        subscription.validate()
    }

    @Test
    fun delete() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscription()

        val subscription =
            subscriptionService.delete(
                SubscriptionDeleteParams.builder().id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        subscription.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscription()

        val subscription =
            subscriptionService.get(
                SubscriptionGetParams.builder().id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        subscription.validate()
    }
}
