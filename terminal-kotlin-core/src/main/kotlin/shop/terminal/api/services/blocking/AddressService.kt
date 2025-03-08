// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.AddressCreateParams
import shop.terminal.api.models.AddressCreateResponse
import shop.terminal.api.models.AddressDeleteParams
import shop.terminal.api.models.AddressDeleteResponse
import shop.terminal.api.models.AddressGetParams
import shop.terminal.api.models.AddressGetResponse
import shop.terminal.api.models.AddressListParams
import shop.terminal.api.models.AddressListResponse

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
        params: AddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressDeleteResponse

    /** Get the shipping address with the given ID. */
    fun get(
        params: AddressGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressGetResponse

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
            params: AddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressDeleteResponse>

        /**
         * Returns a raw HTTP response for `get /address/{id}`, but is otherwise the same as
         * [AddressService.get].
         */
        @MustBeClosed
        fun get(
            params: AddressGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressGetResponse>
    }
}
