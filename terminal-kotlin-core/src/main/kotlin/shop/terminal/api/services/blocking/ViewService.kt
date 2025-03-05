// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.ViewInitParams
import shop.terminal.api.models.ViewInitResponse

interface ViewService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get initial app data, including user, products, cart, addresses, cards, subscriptions, and
     * orders.
     */
    fun init(
        params: ViewInitParams = ViewInitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ViewInitResponse

    /**
     * Get initial app data, including user, products, cart, addresses, cards, subscriptions, and
     * orders.
     */
    fun init(requestOptions: RequestOptions): ViewInitResponse =
        init(ViewInitParams.none(), requestOptions)

    /** A view of [ViewService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /view/init`, but is otherwise the same as
         * [ViewService.init].
         */
        @MustBeClosed
        fun init(
            params: ViewInitParams = ViewInitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ViewInitResponse>

        /**
         * Returns a raw HTTP response for `get /view/init`, but is otherwise the same as
         * [ViewService.init].
         */
        @MustBeClosed
        fun init(requestOptions: RequestOptions): HttpResponseFor<ViewInitResponse> =
            init(ViewInitParams.none(), requestOptions)
    }
}
