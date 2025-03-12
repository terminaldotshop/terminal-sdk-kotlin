// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

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

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a subscription for the current user. */
    fun create(
        params: SubscriptionCreateParams = SubscriptionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionCreateResponse

    /** @see [create] */
    fun create(requestOptions: RequestOptions): SubscriptionCreateResponse =
        create(SubscriptionCreateParams.none(), requestOptions)

    /** List the subscriptions associated with the current user. */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): SubscriptionListResponse =
        list(SubscriptionListParams.none(), requestOptions)

    /** Cancel a subscription for the current user. */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionDeleteResponse

    /** Get the subscription with the given ID. */
    fun get(
        params: SubscriptionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionGetResponse

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /subscription`, but is otherwise the same as
         * [SubscriptionService.create].
         */
        @MustBeClosed
        fun create(
            params: SubscriptionCreateParams = SubscriptionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<SubscriptionCreateResponse> =
            create(SubscriptionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /subscription`, but is otherwise the same as
         * [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SubscriptionListResponse> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /subscription/{id}`, but is otherwise the same as
         * [SubscriptionService.delete].
         */
        @MustBeClosed
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionDeleteResponse>

        /**
         * Returns a raw HTTP response for `get /subscription/{id}`, but is otherwise the same as
         * [SubscriptionService.get].
         */
        @MustBeClosed
        fun get(
            params: SubscriptionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionGetResponse>
    }
}
