// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.async

import shop.terminal.core.RequestOptions
import shop.terminal.models.TokenDeleteParams
import shop.terminal.models.TokenDeleteResponse
import shop.terminal.models.TokenGetParams
import shop.terminal.models.TokenGetResponse
import shop.terminal.models.TokenListParams
import shop.terminal.models.TokenListResponse

interface TokenServiceAsync {

    /** List the current user's personal access tokens. */
    suspend fun list(
        params: TokenListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenListResponse

    /** Delete the personal access token with the given ID. */
    suspend fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenDeleteResponse

    /** Get the personal token with the given ID. */
    suspend fun get(
        params: TokenGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenGetResponse
}
