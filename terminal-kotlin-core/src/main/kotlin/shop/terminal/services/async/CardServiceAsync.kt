// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.async

import shop.terminal.core.RequestOptions
import shop.terminal.models.CardCreateParams
import shop.terminal.models.CardCreateResponse
import shop.terminal.models.CardDeleteParams
import shop.terminal.models.CardDeleteResponse
import shop.terminal.models.CardListParams
import shop.terminal.models.CardListResponse

interface CardServiceAsync {

    /** Attach a credit card (tokenized via Stripe) to the current user. */
    suspend fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardCreateResponse

    /** List the credit cards associated with the current user. */
    suspend fun list(
        params: CardListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardListResponse

    /** Delete a credit card associated with the current user. */
    suspend fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardDeleteResponse
}
