// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.async

import shop.terminal.core.RequestOptions
import shop.terminal.models.ViewInitParams
import shop.terminal.models.ViewInitResponse

interface ViewServiceAsync {

    /**
     * Get initial app data, including user, products, cart, addresses, cards, subscriptions, and
     * orders.
     */
    suspend fun init(
        params: ViewInitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ViewInitResponse
}
