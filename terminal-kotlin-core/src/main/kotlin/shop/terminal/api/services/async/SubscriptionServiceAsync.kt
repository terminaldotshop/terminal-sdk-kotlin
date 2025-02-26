// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.SubscriptionCreateParams
import shop.terminal.api.models.SubscriptionCreateResponse
import shop.terminal.api.models.SubscriptionDeleteParams
import shop.terminal.api.models.SubscriptionDeleteResponse
import shop.terminal.api.models.SubscriptionListParams
import shop.terminal.api.models.SubscriptionListResponse

interface SubscriptionServiceAsync {

    /** Create a subscription for the current user. */
    suspend fun create(
        params: SubscriptionCreateParams = SubscriptionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionCreateResponse

    /** Create a subscription for the current user. */
    suspend fun create(requestOptions: RequestOptions): SubscriptionCreateResponse =
        create(SubscriptionCreateParams.none(), requestOptions)

    /** List the subscriptions associated with the current user. */
    suspend fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse

    /** List the subscriptions associated with the current user. */
    suspend fun list(requestOptions: RequestOptions): SubscriptionListResponse =
        list(SubscriptionListParams.none(), requestOptions)

    /** Cancel a subscription for the current user. */
    suspend fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionDeleteResponse
}
