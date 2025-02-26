// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.CardCollectParams
import shop.terminal.api.models.CardCollectResponse
import shop.terminal.api.models.CardCreateParams
import shop.terminal.api.models.CardCreateResponse
import shop.terminal.api.models.CardDeleteParams
import shop.terminal.api.models.CardDeleteResponse
import shop.terminal.api.models.CardListParams
import shop.terminal.api.models.CardListResponse

interface CardService {

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

    /** List the credit cards associated with the current user. */
    fun list(requestOptions: RequestOptions): CardListResponse =
        list(CardListParams.none(), requestOptions)

    /** Delete a credit card associated with the current user. */
    fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDeleteResponse

    /** Create a temporary URL for collecting credit card information for the current user. */
    fun collect(
        params: CardCollectParams = CardCollectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardCollectResponse

    /** Create a temporary URL for collecting credit card information for the current user. */
    fun collect(requestOptions: RequestOptions): CardCollectResponse =
        collect(CardCollectParams.none(), requestOptions)
}
