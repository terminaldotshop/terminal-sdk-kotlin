// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.async

import shop.terminal.core.RequestOptions
import shop.terminal.models.AddressCreateParams
import shop.terminal.models.AddressCreateResponse
import shop.terminal.models.AddressDeleteParams
import shop.terminal.models.AddressDeleteResponse
import shop.terminal.models.AddressListParams
import shop.terminal.models.AddressListResponse

interface AddressServiceAsync {

    /** Create and add a shipping address to the current user. */
    suspend fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AddressCreateResponse

    /** Get the shipping addresses associated with the current user. */
    suspend fun list(
        params: AddressListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AddressListResponse

    /** Delete a shipping address from the current user. */
    suspend fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AddressDeleteResponse
}
