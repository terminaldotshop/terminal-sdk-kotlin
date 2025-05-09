// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

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

interface AddressService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create and add a shipping address to the current user. */
    fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressCreateResponse

    /** Get the shipping addresses associated with the current user. */
    fun list(
        params: AddressListParams = AddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressListResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AddressListResponse =
        list(AddressListParams.none(), requestOptions)

    /** Delete a shipping address from the current user. */
    fun delete(
        id: String,
        params: AddressDeleteParams = AddressDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressDeleteResponse

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): AddressDeleteResponse =
        delete(id, AddressDeleteParams.none(), requestOptions)

    /** Get the shipping address with the given ID. */
    fun get(
        id: String,
        params: AddressGetParams = AddressGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    fun get(
        params: AddressGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressGetResponse

    /** @see [get] */
    fun get(id: String, requestOptions: RequestOptions): AddressGetResponse =
        get(id, AddressGetParams.none(), requestOptions)

    /** A view of [AddressService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /address`, but is otherwise the same as
         * [AddressService.create].
         */
        @MustBeClosed
        fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressCreateResponse>

        /**
         * Returns a raw HTTP response for `get /address`, but is otherwise the same as
         * [AddressService.list].
         */
        @MustBeClosed
        fun list(
            params: AddressListParams = AddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AddressListResponse> =
            list(AddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /address/{id}`, but is otherwise the same as
         * [AddressService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: AddressDeleteParams = AddressDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddressDeleteResponse> =
            delete(id, AddressDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /address/{id}`, but is otherwise the same as
         * [AddressService.get].
         */
        @MustBeClosed
        fun get(
            id: String,
            params: AddressGetParams = AddressGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        @MustBeClosed
        fun get(
            params: AddressGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressGetResponse>

        /** @see [get] */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<AddressGetResponse> =
            get(id, AddressGetParams.none(), requestOptions)
    }
}
