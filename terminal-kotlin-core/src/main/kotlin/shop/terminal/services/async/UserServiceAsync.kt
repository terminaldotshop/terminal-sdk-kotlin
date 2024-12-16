// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.async

import shop.terminal.core.RequestOptions
import shop.terminal.models.UserInitParams
import shop.terminal.models.UserInitResponse
import shop.terminal.models.UserMeParams
import shop.terminal.models.UserMeResponse
import shop.terminal.models.UserUpdateParams
import shop.terminal.models.UserUpdateResponse

interface UserServiceAsync {

    /** Update the current user. */
    suspend fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UserUpdateResponse

    /**
     * Get initial app data, including user, products, cart, addresses, cards, subscriptions, and
     * orders.
     */
    suspend fun init(
        params: UserInitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UserInitResponse

    /** Get the current user. */
    suspend fun me(
        params: UserMeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UserMeResponse
}
