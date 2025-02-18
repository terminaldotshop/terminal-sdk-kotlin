// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.CardCollectParams
import shop.terminal.api.models.CardCollectResponse
import shop.terminal.api.models.CardCreateParams
import shop.terminal.api.models.CardCreateResponse
import shop.terminal.api.models.CardDeleteParams
import shop.terminal.api.models.CardDeleteResponse
import shop.terminal.api.models.CardListParams
import shop.terminal.api.models.CardListResponse

interface CardServiceAsync {

    /** Attach a credit card (tokenized via Stripe) to the current user. */
    suspend fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardCreateResponse

    /** List the credit cards associated with the current user. */
    suspend fun list(
        params: CardListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListResponse

    /** Delete a credit card associated with the current user. */
    suspend fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDeleteResponse

    /** Create a temporary URL for collecting credit card information for the current user. */
    suspend fun collect(
        params: CardCollectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardCollectResponse
}
