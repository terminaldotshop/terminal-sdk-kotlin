// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.ProductListParams
import shop.terminal.api.models.ProductListResponse

interface ProductServiceAsync {

    /** List all products for sale in the Terminal shop. */
    suspend fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListResponse

    /** List all products for sale in the Terminal shop. */
    suspend fun list(requestOptions: RequestOptions): ProductListResponse =
        list(ProductListParams.none(), requestOptions)
}
