// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import shop.terminal.core.RequestOptions
import shop.terminal.models.AppCreateParams
import shop.terminal.models.AppCreateResponse
import shop.terminal.models.AppDeleteParams
import shop.terminal.models.AppDeleteResponse
import shop.terminal.models.AppGetParams
import shop.terminal.models.AppGetResponse
import shop.terminal.models.AppListParams
import shop.terminal.models.AppListResponse

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
