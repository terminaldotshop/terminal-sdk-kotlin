// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.ProductListParams
import shop.terminal.api.models.ProductListResponse

interface ProductServiceAsync {

    /** List all products for sale in the Terminal shop. */
    suspend fun list(
        params: ProductListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListResponse
}
