// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.AddressCreateParams
import shop.terminal.api.models.AddressCreateResponse
import shop.terminal.api.models.AddressDeleteParams
import shop.terminal.api.models.AddressDeleteResponse
import shop.terminal.api.models.AddressListParams
import shop.terminal.api.models.AddressListResponse

interface AddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create and add a shipping address to the current user. */
    suspend fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressCreateResponse

    /** Get the shipping addresses associated with the current user. */
    suspend fun list(
        params: AddressListParams = AddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressListResponse

    /** Get the shipping addresses associated with the current user. */
    suspend fun list(requestOptions: RequestOptions): AddressListResponse =
        list(AddressListParams.none(), requestOptions)

    /** Delete a shipping address from the current user. */
    suspend fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressDeleteResponse

    /**
     * A view of [AddressServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /address`, but is otherwise the same as
         * [AddressServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressCreateResponse>

        /**
         * Returns a raw HTTP response for `get /address`, but is otherwise the same as
         * [AddressServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AddressListParams = AddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressListResponse>

        /**
         * Returns a raw HTTP response for `get /address`, but is otherwise the same as
         * [AddressServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AddressListResponse> =
            list(AddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /address/{id}`, but is otherwise the same as
         * [AddressServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressDeleteResponse>
    }
}
