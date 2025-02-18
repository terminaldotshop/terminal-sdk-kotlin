// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.OrderGetParams
import shop.terminal.api.models.OrderGetResponse
import shop.terminal.api.models.OrderListParams
import shop.terminal.api.models.OrderListResponse

interface OrderService {

    /** List the orders associated with the current user. */
    fun list(
        params: OrderListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderListResponse

    /** Get the order with the given ID. */
    fun get(
        params: OrderGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderGetResponse
}
