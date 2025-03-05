// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.ProductListParams
import shop.terminal.api.models.ProductListResponse

interface ProductService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List all products for sale in the Terminal shop. */
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListResponse

    /** List all products for sale in the Terminal shop. */
    fun list(requestOptions: RequestOptions): ProductListResponse =
        list(ProductListParams.none(), requestOptions)

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /product`, but is otherwise the same as
         * [ProductService.list].
         */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductListResponse>

        /**
         * Returns a raw HTTP response for `get /product`, but is otherwise the same as
         * [ProductService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProductListResponse> =
            list(ProductListParams.none(), requestOptions)
    }
}
