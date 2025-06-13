// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.ClientOptions
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

interface CardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardService

    /** Attach a credit card (tokenized via Stripe) to the current user. */
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardCreateResponse

    /** List the credit cards associated with the current user. */
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CardListResponse =
        list(CardListParams.none(), requestOptions)

    /** Delete a credit card associated with the current user. */
    fun delete(
        id: String,
        params: CardDeleteParams = CardDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDeleteResponse

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CardDeleteResponse =
        delete(id, CardDeleteParams.none(), requestOptions)

    /** Create a temporary URL for collecting credit card information for the current user. */
    fun collect(
        params: CardCollectParams = CardCollectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardCollectResponse

    /** @see [collect] */
    fun collect(requestOptions: RequestOptions): CardCollectResponse =
        collect(CardCollectParams.none(), requestOptions)

    /** Get a credit card by ID associated with the current user. */
    fun get(
        id: String,
        params: CardGetParams = CardGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    fun get(
        params: CardGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardGetResponse

    /** @see [get] */
    fun get(id: String, requestOptions: RequestOptions): CardGetResponse =
        get(id, CardGetParams.none(), requestOptions)

    /** A view of [CardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card`, but is otherwise the same as
         * [CardService.create].
         */
        @MustBeClosed
        fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardCreateResponse>

        /**
         * Returns a raw HTTP response for `get /card`, but is otherwise the same as
         * [CardService.list].
         */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardListResponse> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /card/{id}`, but is otherwise the same as
         * [CardService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: CardDeleteParams = CardDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDeleteResponse> = delete(id, CardDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /card/collect`, but is otherwise the same as
         * [CardService.collect].
         */
        @MustBeClosed
        fun collect(
            params: CardCollectParams = CardCollectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardCollectResponse>

        /** @see [collect] */
        @MustBeClosed
        fun collect(requestOptions: RequestOptions): HttpResponseFor<CardCollectResponse> =
            collect(CardCollectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card/{id}`, but is otherwise the same as
         * [CardService.get].
         */
        @MustBeClosed
        fun get(
            id: String,
            params: CardGetParams = CardGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        @MustBeClosed
        fun get(
            params: CardGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardGetResponse>

        /** @see [get] */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<CardGetResponse> =
            get(id, CardGetParams.none(), requestOptions)
    }
}
