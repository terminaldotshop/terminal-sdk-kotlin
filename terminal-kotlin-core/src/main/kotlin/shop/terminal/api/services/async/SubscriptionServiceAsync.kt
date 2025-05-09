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
import shop.terminal.api.models.subscription.SubscriptionUpdateParams
import shop.terminal.api.models.subscription.SubscriptionUpdateResponse

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a subscription for the current user. */
    suspend fun create(
        params: SubscriptionCreateParams = SubscriptionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): SubscriptionCreateResponse =
        create(SubscriptionCreateParams.none(), requestOptions)

    /** Update card, address, or interval for an existing subscription. */
    suspend fun update(
        id: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionUpdateResponse

    /** @see [update] */
    suspend fun update(id: String, requestOptions: RequestOptions): SubscriptionUpdateResponse =
        update(id, SubscriptionUpdateParams.none(), requestOptions)

    /** List the subscriptions associated with the current user. */
    suspend fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): SubscriptionListResponse =
        list(SubscriptionListParams.none(), requestOptions)

    /** Cancel a subscription for the current user. */
    suspend fun delete(
        id: String,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionDeleteResponse

    /** @see [delete] */
    suspend fun delete(id: String, requestOptions: RequestOptions): SubscriptionDeleteResponse =
        delete(id, SubscriptionDeleteParams.none(), requestOptions)

    /** Get the subscription with the given ID. */
    suspend fun get(
        id: String,
        params: SubscriptionGetParams = SubscriptionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    suspend fun get(
        params: SubscriptionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionGetResponse

    /** @see [get] */
    suspend fun get(id: String, requestOptions: RequestOptions): SubscriptionGetResponse =
        get(id, SubscriptionGetParams.none(), requestOptions)

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /subscription`, but is otherwise the same as
         * [SubscriptionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: SubscriptionCreateParams = SubscriptionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<SubscriptionCreateResponse> =
            create(SubscriptionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /subscription/{id}`, but is otherwise the same as
         * [SubscriptionServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionUpdateResponse> =
            update(id, SubscriptionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /subscription`, but is otherwise the same as
         * [SubscriptionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<SubscriptionListResponse> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /subscription/{id}`, but is otherwise the same as
         * [SubscriptionServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionDeleteResponse> =
            delete(id, SubscriptionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /subscription/{id}`, but is otherwise the same as
         * [SubscriptionServiceAsync.get].
         */
        @MustBeClosed
        suspend fun get(
            id: String,
            params: SubscriptionGetParams = SubscriptionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        @MustBeClosed
        suspend fun get(
            params: SubscriptionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionGetResponse>

        /** @see [get] */
        @MustBeClosed
        suspend fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionGetResponse> =
            get(id, SubscriptionGetParams.none(), requestOptions)
    }
}
