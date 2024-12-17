// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.TokenCreateParams
import shop.terminal.api.models.TokenCreateResponse
import shop.terminal.api.models.TokenDeleteParams
import shop.terminal.api.models.TokenDeleteResponse
import shop.terminal.api.models.TokenGetParams
import shop.terminal.api.models.TokenGetResponse
import shop.terminal.api.models.TokenListParams
import shop.terminal.api.models.TokenListResponse

interface TokenService {

    /** Create a personal access token. */
    fun create(
        params: TokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenCreateResponse

    /** List the current user's personal access tokens. */
    fun list(
        params: TokenListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenListResponse

    /** Delete the personal access token with the given ID. */
    fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenDeleteResponse

    /** Get the personal access token with the given ID. */
    fun get(
        params: TokenGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenGetResponse
}
