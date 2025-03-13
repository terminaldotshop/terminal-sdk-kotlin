// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.product.ProductGetParams
import shop.terminal.api.models.product.ProductGetResponse
import shop.terminal.api.models.product.ProductListParams
import shop.terminal.api.models.product.ProductListResponse

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

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ProductListResponse =
        list(ProductListParams.none(), requestOptions)

    /** Get a product by ID from the Terminal shop. */
    fun get(
        params: ProductGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductGetResponse

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

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProductListResponse> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /product/{id}`, but is otherwise the same as
         * [ProductService.get].
         */
        @MustBeClosed
        fun get(
            params: ProductGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductGetResponse>
    }
}
