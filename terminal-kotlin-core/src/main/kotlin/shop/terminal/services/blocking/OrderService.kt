// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import shop.terminal.core.RequestOptions
import shop.terminal.models.OrderCreateParams
import shop.terminal.models.OrderCreateResponse
import shop.terminal.models.OrderGetParams
import shop.terminal.models.OrderGetResponse
import shop.terminal.models.OrderListParams
import shop.terminal.models.OrderListResponse

interface OrderService {

    /** Create an order from the current user's cart. */
    fun create(
        params: OrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OrderCreateResponse

    /** List the orders associated with the current user. */
    fun list(
        params: OrderListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OrderListResponse

    /** Get the order with the given ID. */
    fun get(
        params: OrderGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OrderGetResponse
}
