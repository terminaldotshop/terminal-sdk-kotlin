// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import shop.terminal.core.RequestOptions
import shop.terminal.models.ProfileMeParams
import shop.terminal.models.ProfileMeResponse
import shop.terminal.models.ProfileUpdateParams
import shop.terminal.models.ProfileUpdateResponse

interface ProfileService {

    /** Update the current user's profile. */
    fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProfileUpdateResponse

    /** Get the current user's profile. */
    fun me(
        params: ProfileMeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProfileMeResponse
}
