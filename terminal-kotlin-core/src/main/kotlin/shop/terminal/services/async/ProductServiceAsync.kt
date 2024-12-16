// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.async

import shop.terminal.core.RequestOptions
import shop.terminal.models.ProductListParams
import shop.terminal.models.ProductListResponse

interface ProductServiceAsync {

    /** List all products for sale in the Terminal shop. */
    suspend fun list(
        params: ProductListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProductListResponse
}
