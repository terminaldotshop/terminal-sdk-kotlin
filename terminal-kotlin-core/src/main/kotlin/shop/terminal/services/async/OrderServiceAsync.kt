// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.async

import shop.terminal.core.RequestOptions
import shop.terminal.models.OrderCreateParams
import shop.terminal.models.OrderCreateResponse
import shop.terminal.models.OrderGetParams
import shop.terminal.models.OrderGetResponse
import shop.terminal.models.OrderListParams
import shop.terminal.models.OrderListResponse

interface OrderServiceAsync {

    /** Create an order from the current user's cart. */
    suspend fun create(
        params: OrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OrderCreateResponse

    /** List the orders associated with the current user. */
    suspend fun list(
        params: OrderListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OrderListResponse

    /** Get the order with the given ID. */
    suspend fun get(
        params: OrderGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OrderGetResponse
}
