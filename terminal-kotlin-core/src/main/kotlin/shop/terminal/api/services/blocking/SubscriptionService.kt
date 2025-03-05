// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.SubscriptionCreateParams
import shop.terminal.api.models.SubscriptionCreateResponse
import shop.terminal.api.models.SubscriptionDeleteParams
import shop.terminal.api.models.SubscriptionDeleteResponse
import shop.terminal.api.models.SubscriptionListParams
import shop.terminal.api.models.SubscriptionListResponse

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

    /** Create a subscription for the current user. */
    fun create(requestOptions: RequestOptions): SubscriptionCreateResponse =
        create(SubscriptionCreateParams.none(), requestOptions)

    /** List the subscriptions associated with the current user. */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse

    /** List the subscriptions associated with the current user. */
    fun list(requestOptions: RequestOptions): SubscriptionListResponse =
        list(SubscriptionListParams.none(), requestOptions)

    /** Cancel a subscription for the current user. */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionDeleteResponse

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

        /**
         * Returns a raw HTTP response for `post /subscription`, but is otherwise the same as
         * [SubscriptionService.create].
         */
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

        /**
         * Returns a raw HTTP response for `get /subscription`, but is otherwise the same as
         * [SubscriptionService.list].
         */
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
    }
}
