// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.AppCreateParams
import shop.terminal.api.models.AppCreateResponse
import shop.terminal.api.models.AppDeleteParams
import shop.terminal.api.models.AppDeleteResponse
import shop.terminal.api.models.AppGetParams
import shop.terminal.api.models.AppGetResponse
import shop.terminal.api.models.AppListParams
import shop.terminal.api.models.AppListResponse

interface AppService {

    /** Create an app. */
    fun create(
        params: AppCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AppCreateResponse

    /** List the current user's registered apps. */
    fun list(
        params: AppListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AppListResponse

    /** Delete the app with the given ID. */
    fun delete(
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AppDeleteResponse

    /** Get the app with the given ID. */
    fun get(
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AppGetResponse
}
