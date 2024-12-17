// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import shop.terminal.api.core.RequestOptions
import shop.terminal.api.models.ProfileMeParams
import shop.terminal.api.models.ProfileMeResponse
import shop.terminal.api.models.ProfileUpdateParams
import shop.terminal.api.models.ProfileUpdateResponse

interface ProfileServiceAsync {

    /** Update the current user's profile. */
    suspend fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProfileUpdateResponse

    /** Get the current user's profile. */
    suspend fun me(
        params: ProfileMeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProfileMeResponse
}
