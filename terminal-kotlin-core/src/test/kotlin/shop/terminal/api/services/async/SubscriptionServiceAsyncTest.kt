// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.subscription.Subscription
import shop.terminal.api.models.subscription.SubscriptionCreateParams
import shop.terminal.api.models.subscription.SubscriptionUpdateParams

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscription()

        val subscription =
            subscriptionServiceAsync.create(
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
    suspend fun update() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscription()

        val subscription =
            subscriptionServiceAsync.update(
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
    suspend fun list() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscription()

        val subscriptions = subscriptionServiceAsync.list()

        subscriptions.validate()
    }

    @Test
    suspend fun delete() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscription()

        val subscription = subscriptionServiceAsync.delete("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")

        subscription.validate()
    }

    @Test
    suspend fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscription()

        val subscription = subscriptionServiceAsync.get("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")

        subscription.validate()
    }
}
