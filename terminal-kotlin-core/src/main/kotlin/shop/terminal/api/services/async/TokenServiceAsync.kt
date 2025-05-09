// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.token.TokenCreateParams
import shop.terminal.api.models.token.TokenCreateResponse
import shop.terminal.api.models.token.TokenDeleteParams
import shop.terminal.api.models.token.TokenDeleteResponse
import shop.terminal.api.models.token.TokenGetParams
import shop.terminal.api.models.token.TokenGetResponse
import shop.terminal.api.models.token.TokenListParams
import shop.terminal.api.models.token.TokenListResponse

interface TokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a personal access token. */
    suspend fun create(
        params: TokenCreateParams = TokenCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): TokenCreateResponse =
        create(TokenCreateParams.none(), requestOptions)

    /** List the current user's personal access tokens. */
    suspend fun list(
        params: TokenListParams = TokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): TokenListResponse =
        list(TokenListParams.none(), requestOptions)

    /** Delete the personal access token with the given ID. */
    suspend fun delete(
        id: String,
        params: TokenDeleteParams = TokenDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenDeleteResponse

    /** @see [delete] */
    suspend fun delete(id: String, requestOptions: RequestOptions): TokenDeleteResponse =
        delete(id, TokenDeleteParams.none(), requestOptions)

    /** Get the personal access token with the given ID. */
    suspend fun get(
        id: String,
        params: TokenGetParams = TokenGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    suspend fun get(
        params: TokenGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenGetResponse

    /** @see [get] */
    suspend fun get(id: String, requestOptions: RequestOptions): TokenGetResponse =
        get(id, TokenGetParams.none(), requestOptions)

    /** A view of [TokenServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /token`, but is otherwise the same as
         * [TokenServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: TokenCreateParams = TokenCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<TokenCreateResponse> =
            create(TokenCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /token`, but is otherwise the same as
         * [TokenServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TokenListParams = TokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<TokenListResponse> =
            list(TokenListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /token/{id}`, but is otherwise the same as
         * [TokenServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: TokenDeleteParams = TokenDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: TokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenDeleteResponse> =
            delete(id, TokenDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /token/{id}`, but is otherwise the same as
         * [TokenServiceAsync.get].
         */
        @MustBeClosed
        suspend fun get(
            id: String,
            params: TokenGetParams = TokenGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        @MustBeClosed
        suspend fun get(
            params: TokenGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenGetResponse>

        /** @see [get] */
        @MustBeClosed
        suspend fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenGetResponse> = get(id, TokenGetParams.none(), requestOptions)
    }
}
