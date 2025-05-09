// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.order.OrderCreateParams
import shop.terminal.api.models.order.OrderCreateResponse
import shop.terminal.api.models.order.OrderGetParams
import shop.terminal.api.models.order.OrderGetResponse
import shop.terminal.api.models.order.OrderListParams
import shop.terminal.api.models.order.OrderListResponse

interface OrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an order without a cart. The order will be placed immediately. */
    suspend fun create(
        params: OrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderCreateResponse

    /** List the orders associated with the current user. */
    suspend fun list(
        params: OrderListParams = OrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): OrderListResponse =
        list(OrderListParams.none(), requestOptions)

    /** Get the order with the given ID. */
    suspend fun get(
        id: String,
        params: OrderGetParams = OrderGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    suspend fun get(
        params: OrderGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderGetResponse

    /** @see [get] */
    suspend fun get(id: String, requestOptions: RequestOptions): OrderGetResponse =
        get(id, OrderGetParams.none(), requestOptions)

    /** A view of [OrderServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /order`, but is otherwise the same as
         * [OrderServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: OrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderCreateResponse>

        /**
         * Returns a raw HTTP response for `get /order`, but is otherwise the same as
         * [OrderServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: OrderListParams = OrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<OrderListResponse> =
            list(OrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /order/{id}`, but is otherwise the same as
         * [OrderServiceAsync.get].
         */
        @MustBeClosed
        suspend fun get(
            id: String,
            params: OrderGetParams = OrderGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        @MustBeClosed
        suspend fun get(
            params: OrderGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderGetResponse>

        /** @see [get] */
        @MustBeClosed
        suspend fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrderGetResponse> = get(id, OrderGetParams.none(), requestOptions)
    }
}
