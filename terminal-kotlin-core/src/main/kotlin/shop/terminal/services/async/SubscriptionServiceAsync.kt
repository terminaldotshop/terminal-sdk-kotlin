// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.async

import shop.terminal.core.RequestOptions
import shop.terminal.models.SubscriptionCreateParams
import shop.terminal.models.SubscriptionCreateResponse
import shop.terminal.models.SubscriptionDeleteParams
import shop.terminal.models.SubscriptionDeleteResponse
import shop.terminal.models.SubscriptionListParams
import shop.terminal.models.SubscriptionListResponse

interface SubscriptionServiceAsync {

    /** Create a subscription for the current user. */
    suspend fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SubscriptionCreateResponse

    /** List the subscriptions associated with the current user. */
    suspend fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SubscriptionListResponse

    /** Cancel a subscription for the current user. */
    suspend fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SubscriptionDeleteResponse
}
