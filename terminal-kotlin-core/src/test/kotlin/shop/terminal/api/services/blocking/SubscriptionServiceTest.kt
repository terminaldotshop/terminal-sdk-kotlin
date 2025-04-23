// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.subscription.Subscription
import shop.terminal.api.models.subscription.SubscriptionCreateParams
import shop.terminal.api.models.subscription.SubscriptionDeleteParams
import shop.terminal.api.models.subscription.SubscriptionGetParams
import shop.terminal.api.models.subscription.SubscriptionUpdateParams

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceTest {

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
                            .created("2024-06-29T19:36:19.000Z")
                            .price(2200L)
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
    fun update() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscription()

        val subscription =
            subscriptionService.update(
                SubscriptionUpdateParams.builder()
                    .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .schedule(
                        SubscriptionUpdateParams.Schedule.Weekly.builder()
                            .interval(3L)
                            .type(SubscriptionUpdateParams.Schedule.Weekly.Type.WEEKLY)
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

        val subscriptions = subscriptionService.list()

        subscriptions.validate()
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
