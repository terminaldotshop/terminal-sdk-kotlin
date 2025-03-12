// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.subscription.SubscriptionCreateParams
import shop.terminal.api.models.subscription.SubscriptionCreateResponse
import shop.terminal.api.models.subscription.SubscriptionDeleteParams
import shop.terminal.api.models.subscription.SubscriptionDeleteResponse
import shop.terminal.api.models.subscription.SubscriptionGetParams
import shop.terminal.api.models.subscription.SubscriptionGetResponse
import shop.terminal.api.models.subscription.SubscriptionListParams
import shop.terminal.api.models.subscription.SubscriptionListResponse

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a subscription for the current user. */
    suspend fun create(params: SubscriptionCreateParams = SubscriptionCreateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SubscriptionCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): SubscriptionCreateResponse = create(SubscriptionCreateParams.none(), requestOptions)

    /** List the subscriptions associated with the current user. */
    suspend fun list(params: SubscriptionListParams = SubscriptionListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): SubscriptionListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): SubscriptionListResponse = list(SubscriptionListParams.none(), requestOptions)

    /** Cancel a subscription for the current user. */
    suspend fun delete(params: SubscriptionDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): SubscriptionDeleteResponse

    /** Get the subscription with the given ID. */
    suspend fun get(params: SubscriptionGetParams, requestOptions: RequestOptions = RequestOptions.none()): SubscriptionGetResponse

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /subscription`, but is otherwise the same
         * as [SubscriptionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: SubscriptionCreateParams = SubscriptionCreateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SubscriptionCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<SubscriptionCreateResponse> = create(SubscriptionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /subscription`, but is otherwise the same
         * as [SubscriptionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: SubscriptionListParams = SubscriptionListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SubscriptionListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<SubscriptionListResponse> = list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /subscription/{id}`, but is otherwise
         * the same as [SubscriptionServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(params: SubscriptionDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SubscriptionDeleteResponse>

        /**
         * Returns a raw HTTP response for `get /subscription/{id}`, but is otherwise the
         * same as [SubscriptionServiceAsync.get].
         */
        @MustBeClosed
        suspend fun get(params: SubscriptionGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SubscriptionGetResponse>
    }
}
