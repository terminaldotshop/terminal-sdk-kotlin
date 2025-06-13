// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.view.ViewInitParams
import shop.terminal.api.models.view.ViewInitResponse

interface ViewService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ViewService

    /**
     * Get initial app data, including user, products, cart, addresses, cards, subscriptions, and
     * orders.
     */
    fun init(
        params: ViewInitParams = ViewInitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ViewInitResponse

    /** @see [init] */
    fun init(requestOptions: RequestOptions): ViewInitResponse =
        init(ViewInitParams.none(), requestOptions)

    /** A view of [ViewService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ViewService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /view/init`, but is otherwise the same as
         * [ViewService.init].
         */
        @MustBeClosed
        fun init(
            params: ViewInitParams = ViewInitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ViewInitResponse>

        /** @see [init] */
        @MustBeClosed
        fun init(requestOptions: RequestOptions): HttpResponseFor<ViewInitResponse> =
            init(ViewInitParams.none(), requestOptions)
    }
}
