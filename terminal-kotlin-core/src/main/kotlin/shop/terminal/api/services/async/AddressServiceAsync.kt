// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.address.AddressCreateParams
import shop.terminal.api.models.address.AddressCreateResponse
import shop.terminal.api.models.address.AddressDeleteParams
import shop.terminal.api.models.address.AddressDeleteResponse
import shop.terminal.api.models.address.AddressGetParams
import shop.terminal.api.models.address.AddressGetResponse
import shop.terminal.api.models.address.AddressListParams
import shop.terminal.api.models.address.AddressListResponse

interface AddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create and add a shipping address to the current user. */
    suspend fun create(params: AddressCreateParams, requestOptions: RequestOptions = RequestOptions.none()): AddressCreateResponse

    /** Get the shipping addresses associated with the current user. */
    suspend fun list(params: AddressListParams = AddressListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AddressListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): AddressListResponse = list(AddressListParams.none(), requestOptions)

    /** Delete a shipping address from the current user. */
    suspend fun delete(params: AddressDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): AddressDeleteResponse

    /** Get the shipping address with the given ID. */
    suspend fun get(params: AddressGetParams, requestOptions: RequestOptions = RequestOptions.none()): AddressGetResponse

    /**
     * A view of [AddressServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /address`, but is otherwise the same as
         * [AddressServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: AddressCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AddressCreateResponse>

        /**
         * Returns a raw HTTP response for `get /address`, but is otherwise the same as
         * [AddressServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: AddressListParams = AddressListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AddressListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AddressListResponse> = list(AddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /address/{id}`, but is otherwise the
         * same as [AddressServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(params: AddressDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AddressDeleteResponse>

        /**
         * Returns a raw HTTP response for `get /address/{id}`, but is otherwise the same
         * as [AddressServiceAsync.get].
         */
        @MustBeClosed
        suspend fun get(params: AddressGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AddressGetResponse>
    }
}
