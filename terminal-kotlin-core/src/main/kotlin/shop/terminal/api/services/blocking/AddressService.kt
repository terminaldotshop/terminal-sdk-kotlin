// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.AddressCreateParams
import shop.terminal.api.models.AddressCreateResponse
import shop.terminal.api.models.AddressDeleteParams
import shop.terminal.api.models.AddressDeleteResponse
import shop.terminal.api.models.AddressListParams
import shop.terminal.api.models.AddressListResponse

interface AddressService {

    /** Create and add a shipping address to the current user. */
    fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AddressCreateResponse

    /** Get the shipping addresses associated with the current user. */
    fun list(
        params: AddressListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AddressListResponse

    /** Delete a shipping address from the current user. */
    fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AddressDeleteResponse
}
