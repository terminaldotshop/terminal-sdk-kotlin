// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.cart.CartConvertParams
import shop.terminal.api.models.cart.CartConvertResponse
import shop.terminal.api.models.cart.CartGetParams
import shop.terminal.api.models.cart.CartGetResponse
import shop.terminal.api.models.cart.CartRedeemGiftCardParams
import shop.terminal.api.models.cart.CartRedeemGiftCardResponse
import shop.terminal.api.models.cart.CartRemoveGiftCardParams
import shop.terminal.api.models.cart.CartRemoveGiftCardResponse
import shop.terminal.api.models.cart.CartSetAddressParams
import shop.terminal.api.models.cart.CartSetAddressResponse
import shop.terminal.api.models.cart.CartSetCardParams
import shop.terminal.api.models.cart.CartSetCardResponse
import shop.terminal.api.models.cart.CartSetItemParams
import shop.terminal.api.models.cart.CartSetItemResponse

interface CartServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Convert the current user's cart to an order. */
    suspend fun convert(params: CartConvertParams = CartConvertParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CartConvertResponse

    /** @see [convert] */
    suspend fun convert(requestOptions: RequestOptions): CartConvertResponse = convert(CartConvertParams.none(), requestOptions)

    /** Get the current user's cart. */
    suspend fun get(params: CartGetParams = CartGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CartGetResponse

    /** @see [get] */
    suspend fun get(requestOptions: RequestOptions): CartGetResponse = get(CartGetParams.none(), requestOptions)

    /** Apply a gift card to the current user's cart. */
    suspend fun redeemGiftCard(params: CartRedeemGiftCardParams, requestOptions: RequestOptions = RequestOptions.none()): CartRedeemGiftCardResponse

    /** Remove the gift card from the current user's cart. */
    suspend fun removeGiftCard(params: CartRemoveGiftCardParams = CartRemoveGiftCardParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CartRemoveGiftCardResponse

    /** @see [removeGiftCard] */
    suspend fun removeGiftCard(requestOptions: RequestOptions): CartRemoveGiftCardResponse = removeGiftCard(CartRemoveGiftCardParams.none(), requestOptions)

    /** Set the shipping address for the current user's cart. */
    suspend fun setAddress(params: CartSetAddressParams, requestOptions: RequestOptions = RequestOptions.none()): CartSetAddressResponse

    /** Set the credit card for the current user's cart. */
    suspend fun setCard(params: CartSetCardParams, requestOptions: RequestOptions = RequestOptions.none()): CartSetCardResponse

    /** Add an item to the current user's cart. */
    suspend fun setItem(params: CartSetItemParams, requestOptions: RequestOptions = RequestOptions.none()): CartSetItemResponse

    /**
     * A view of [CartServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /cart/convert`, but is otherwise the same
         * as [CartServiceAsync.convert].
         */
        @MustBeClosed
        suspend fun convert(params: CartConvertParams = CartConvertParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CartConvertResponse>

        /** @see [convert] */
        @MustBeClosed
        suspend fun convert(requestOptions: RequestOptions): HttpResponseFor<CartConvertResponse> = convert(CartConvertParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cart`, but is otherwise the same as
         * [CartServiceAsync.get].
         */
        @MustBeClosed
        suspend fun get(params: CartGetParams = CartGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CartGetResponse>

        /** @see [get] */
        @MustBeClosed
        suspend fun get(requestOptions: RequestOptions): HttpResponseFor<CartGetResponse> = get(CartGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /cart/gift-card`, but is otherwise the same
         * as [CartServiceAsync.redeemGiftCard].
         */
        @MustBeClosed
        suspend fun redeemGiftCard(params: CartRedeemGiftCardParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CartRedeemGiftCardResponse>

        /**
         * Returns a raw HTTP response for `delete /cart/gift-card`, but is otherwise the
         * same as [CartServiceAsync.removeGiftCard].
         */
        @MustBeClosed
        suspend fun removeGiftCard(params: CartRemoveGiftCardParams = CartRemoveGiftCardParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CartRemoveGiftCardResponse>

        /** @see [removeGiftCard] */
        @MustBeClosed
        suspend fun removeGiftCard(requestOptions: RequestOptions): HttpResponseFor<CartRemoveGiftCardResponse> = removeGiftCard(CartRemoveGiftCardParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /cart/address`, but is otherwise the same
         * as [CartServiceAsync.setAddress].
         */
        @MustBeClosed
        suspend fun setAddress(params: CartSetAddressParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CartSetAddressResponse>

        /**
         * Returns a raw HTTP response for `put /cart/card`, but is otherwise the same as
         * [CartServiceAsync.setCard].
         */
        @MustBeClosed
        suspend fun setCard(params: CartSetCardParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CartSetCardResponse>

        /**
         * Returns a raw HTTP response for `put /cart/item`, but is otherwise the same as
         * [CartServiceAsync.setItem].
         */
        @MustBeClosed
        suspend fun setItem(params: CartSetItemParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CartSetItemResponse>
    }
}
