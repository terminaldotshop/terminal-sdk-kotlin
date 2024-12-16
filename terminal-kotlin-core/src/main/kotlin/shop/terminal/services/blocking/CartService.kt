// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import shop.terminal.core.RequestOptions
import shop.terminal.models.CartConvertParams
import shop.terminal.models.CartConvertResponse
import shop.terminal.models.CartGetParams
import shop.terminal.models.CartGetResponse
import shop.terminal.models.CartSetAddressParams
import shop.terminal.models.CartSetAddressResponse
import shop.terminal.models.CartSetCardParams
import shop.terminal.models.CartSetCardResponse
import shop.terminal.models.CartSetItemParams
import shop.terminal.models.CartSetItemResponse

interface CartService {

    /** Convert the current user's cart to an order. */
    fun convert(
        params: CartConvertParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CartConvertResponse

    /** Get the current user's cart. */
    fun get(
        params: CartGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CartGetResponse

    /** Set the shipping address for the current user's cart. */
    fun setAddress(
        params: CartSetAddressParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CartSetAddressResponse

    /** Set the credit card for the current user's cart. */
    fun setCard(
        params: CartSetCardParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CartSetCardResponse

    /** Add an item to the current user's cart. */
    fun setItem(
        params: CartSetItemParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CartSetItemResponse
}
