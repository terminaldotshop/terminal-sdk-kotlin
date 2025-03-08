// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.ViewInitParams
import shop.terminal.api.models.ViewInitResponse

interface ViewServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get initial app data, including user, products, cart, addresses, cards, subscriptions, and
     * orders.
     */
    suspend fun init(
        params: ViewInitParams = ViewInitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ViewInitResponse

    /** @see [init] */
    suspend fun init(requestOptions: RequestOptions): ViewInitResponse =
        init(ViewInitParams.none(), requestOptions)

    /** A view of [ViewServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /view/init`, but is otherwise the same as
         * [ViewServiceAsync.init].
         */
        @MustBeClosed
        suspend fun init(
            params: ViewInitParams = ViewInitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ViewInitResponse>

        /** @see [init] */
        @MustBeClosed
        suspend fun init(requestOptions: RequestOptions): HttpResponseFor<ViewInitResponse> =
            init(ViewInitParams.none(), requestOptions)
    }
}
