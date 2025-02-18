// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.ViewInitParams
import shop.terminal.api.models.ViewInitResponse

interface ViewServiceAsync {

    /**
     * Get initial app data, including user, products, cart, addresses, cards, subscriptions, and
     * orders.
     */
    suspend fun init(
        params: ViewInitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ViewInitResponse
}
