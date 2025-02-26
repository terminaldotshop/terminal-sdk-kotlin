// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.AppCreateParams
import shop.terminal.api.models.AppCreateResponse
import shop.terminal.api.models.AppDeleteParams
import shop.terminal.api.models.AppDeleteResponse
import shop.terminal.api.models.AppGetParams
import shop.terminal.api.models.AppGetResponse
import shop.terminal.api.models.AppListParams
import shop.terminal.api.models.AppListResponse

interface AppServiceAsync {

    /** Create an app. */
    suspend fun create(
        params: AppCreateParams = AppCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppCreateResponse

    /** Create an app. */
    suspend fun create(requestOptions: RequestOptions): AppCreateResponse =
        create(AppCreateParams.none(), requestOptions)

    /** List the current user's registered apps. */
    suspend fun list(
        params: AppListParams = AppListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppListResponse

    /** List the current user's registered apps. */
    suspend fun list(requestOptions: RequestOptions): AppListResponse =
        list(AppListParams.none(), requestOptions)

    /** Delete the app with the given ID. */
    suspend fun delete(
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppDeleteResponse

    /** Get the app with the given ID. */
    suspend fun get(
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppGetResponse
}
