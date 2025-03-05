// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.AppCreateParams
import shop.terminal.api.models.AppCreateResponse
import shop.terminal.api.models.AppDeleteParams
import shop.terminal.api.models.AppDeleteResponse
import shop.terminal.api.models.AppGetParams
import shop.terminal.api.models.AppGetResponse
import shop.terminal.api.models.AppListParams
import shop.terminal.api.models.AppListResponse

interface AppService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an app. */
    fun create(
        params: AppCreateParams = AppCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppCreateResponse

    /** Create an app. */
    fun create(requestOptions: RequestOptions): AppCreateResponse =
        create(AppCreateParams.none(), requestOptions)

    /** List the current user's registered apps. */
    fun list(
        params: AppListParams = AppListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppListResponse

    /** List the current user's registered apps. */
    fun list(requestOptions: RequestOptions): AppListResponse =
        list(AppListParams.none(), requestOptions)

    /** Delete the app with the given ID. */
    fun delete(
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppDeleteResponse

    /** Get the app with the given ID. */
    fun get(
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppGetResponse

    /** A view of [AppService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /app`, but is otherwise the same as
         * [AppService.create].
         */
        @MustBeClosed
        fun create(
            params: AppCreateParams = AppCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppCreateResponse>

        /**
         * Returns a raw HTTP response for `post /app`, but is otherwise the same as
         * [AppService.create].
         */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<AppCreateResponse> =
            create(AppCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /app`, but is otherwise the same as
         * [AppService.list].
         */
        @MustBeClosed
        fun list(
            params: AppListParams = AppListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppListResponse>

        /**
         * Returns a raw HTTP response for `get /app`, but is otherwise the same as
         * [AppService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AppListResponse> =
            list(AppListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /app/{id}`, but is otherwise the same as
         * [AppService.delete].
         */
        @MustBeClosed
        fun delete(
            params: AppDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppDeleteResponse>

        /**
         * Returns a raw HTTP response for `get /app/{id}`, but is otherwise the same as
         * [AppService.get].
         */
        @MustBeClosed
        fun get(
            params: AppGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppGetResponse>
    }
}
