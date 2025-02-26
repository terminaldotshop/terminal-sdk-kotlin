// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.OrderCreateParams
import shop.terminal.api.models.OrderCreateResponse
import shop.terminal.api.models.OrderGetParams
import shop.terminal.api.models.OrderGetResponse
import shop.terminal.api.models.OrderListParams
import shop.terminal.api.models.OrderListResponse

interface OrderService {

    /** Create an order without a cart. The order will be placed immediately. */
    fun create(
        params: OrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderCreateResponse

    /** List the orders associated with the current user. */
    fun list(
        params: OrderListParams = OrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderListResponse

    /** List the orders associated with the current user. */
    fun list(requestOptions: RequestOptions): OrderListResponse =
        list(OrderListParams.none(), requestOptions)

    /** Get the order with the given ID. */
    fun get(
        params: OrderGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderGetResponse
}
