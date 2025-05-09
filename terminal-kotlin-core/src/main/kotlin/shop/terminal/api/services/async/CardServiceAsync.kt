// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.card.CardCollectParams
import shop.terminal.api.models.card.CardCollectResponse
import shop.terminal.api.models.card.CardCreateParams
import shop.terminal.api.models.card.CardCreateResponse
import shop.terminal.api.models.card.CardDeleteParams
import shop.terminal.api.models.card.CardDeleteResponse
import shop.terminal.api.models.card.CardGetParams
import shop.terminal.api.models.card.CardGetResponse
import shop.terminal.api.models.card.CardListParams
import shop.terminal.api.models.card.CardListResponse

interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Attach a credit card (tokenized via Stripe) to the current user. */
    suspend fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardCreateResponse

    /** List the credit cards associated with the current user. */
    suspend fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): CardListResponse =
        list(CardListParams.none(), requestOptions)

    /** Delete a credit card associated with the current user. */
    suspend fun delete(
        id: String,
        params: CardDeleteParams = CardDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDeleteResponse

    /** @see [delete] */
    suspend fun delete(id: String, requestOptions: RequestOptions): CardDeleteResponse =
        delete(id, CardDeleteParams.none(), requestOptions)

    /** Create a temporary URL for collecting credit card information for the current user. */
    suspend fun collect(
        params: CardCollectParams = CardCollectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardCollectResponse

    /** @see [collect] */
    suspend fun collect(requestOptions: RequestOptions): CardCollectResponse =
        collect(CardCollectParams.none(), requestOptions)

    /** Get a credit card by ID associated with the current user. */
    suspend fun get(
        id: String,
        params: CardGetParams = CardGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    suspend fun get(
        params: CardGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardGetResponse

    /** @see [get] */
    suspend fun get(id: String, requestOptions: RequestOptions): CardGetResponse =
        get(id, CardGetParams.none(), requestOptions)

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /card`, but is otherwise the same as
         * [CardServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardCreateResponse>

        /**
         * Returns a raw HTTP response for `get /card`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CardListResponse> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /card/{id}`, but is otherwise the same as
         * [CardServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: CardDeleteParams = CardDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: CardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDeleteResponse> = delete(id, CardDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /card/collect`, but is otherwise the same as
         * [CardServiceAsync.collect].
         */
        @MustBeClosed
        suspend fun collect(
            params: CardCollectParams = CardCollectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardCollectResponse>

        /** @see [collect] */
        @MustBeClosed
        suspend fun collect(requestOptions: RequestOptions): HttpResponseFor<CardCollectResponse> =
            collect(CardCollectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card/{id}`, but is otherwise the same as
         * [CardServiceAsync.get].
         */
        @MustBeClosed
        suspend fun get(
            id: String,
            params: CardGetParams = CardGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        @MustBeClosed
        suspend fun get(
            params: CardGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardGetResponse>

        /** @see [get] */
        @MustBeClosed
        suspend fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardGetResponse> = get(id, CardGetParams.none(), requestOptions)
    }
}
