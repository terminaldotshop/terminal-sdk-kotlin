// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import shop.terminal.core.RequestOptions
import shop.terminal.models.UserInitParams
import shop.terminal.models.UserInitResponse
import shop.terminal.models.UserMeParams
import shop.terminal.models.UserMeResponse
import shop.terminal.models.UserUpdateParams
import shop.terminal.models.UserUpdateResponse

interface UserService {

    /** Update the current user. */
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UserUpdateResponse

    /**
     * Get initial app data, including user, products, cart, addresses, cards, subscriptions, and
     * orders.
     */
    fun init(
        params: UserInitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UserInitResponse

    /** Get the current user. */
    fun me(
        params: UserMeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): UserMeResponse
}
