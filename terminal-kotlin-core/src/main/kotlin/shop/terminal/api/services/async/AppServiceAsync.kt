// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.app.AppCreateParams
import shop.terminal.api.models.app.AppCreateResponse
import shop.terminal.api.models.app.AppDeleteParams
import shop.terminal.api.models.app.AppDeleteResponse
import shop.terminal.api.models.app.AppGetParams
import shop.terminal.api.models.app.AppGetResponse
import shop.terminal.api.models.app.AppListParams
import shop.terminal.api.models.app.AppListResponse

interface AppServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AppServiceAsync

    /** Create an app. */
    suspend fun create(
        params: AppCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppCreateResponse

    /** List the current user's registered apps. */
    suspend fun list(
        params: AppListParams = AppListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): AppListResponse =
        list(AppListParams.none(), requestOptions)

    /** Delete the app with the given ID. */
    suspend fun delete(
        id: String,
        params: AppDeleteParams = AppDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppDeleteResponse

    /** @see [delete] */
    suspend fun delete(id: String, requestOptions: RequestOptions): AppDeleteResponse =
        delete(id, AppDeleteParams.none(), requestOptions)

    /** Get the app with the given ID. */
    suspend fun get(
        id: String,
        params: AppGetParams = AppGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see [get] */
    suspend fun get(
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppGetResponse

    /** @see [get] */
    suspend fun get(id: String, requestOptions: RequestOptions): AppGetResponse =
        get(id, AppGetParams.none(), requestOptions)

    /** A view of [AppServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AppServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /app`, but is otherwise the same as
         * [AppServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AppCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppCreateResponse>

        /**
         * Returns a raw HTTP response for `get /app`, but is otherwise the same as
         * [AppServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AppListParams = AppListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AppListResponse> =
            list(AppListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /app/{id}`, but is otherwise the same as
         * [AppServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: AppDeleteParams = AppDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: AppDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AppDeleteResponse> = delete(id, AppDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /app/{id}`, but is otherwise the same as
         * [AppServiceAsync.get].
         */
        @MustBeClosed
        suspend fun get(
            id: String,
            params: AppGetParams = AppGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppGetResponse> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see [get] */
        @MustBeClosed
        suspend fun get(
            params: AppGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppGetResponse>

        /** @see [get] */
        @MustBeClosed
        suspend fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AppGetResponse> = get(id, AppGetParams.none(), requestOptions)
    }
}
