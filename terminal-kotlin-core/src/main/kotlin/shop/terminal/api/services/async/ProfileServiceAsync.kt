// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.models.profile.ProfileMeParams
import shop.terminal.api.models.profile.ProfileMeResponse
import shop.terminal.api.models.profile.ProfileUpdateParams
import shop.terminal.api.models.profile.ProfileUpdateResponse

interface ProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update the current user's profile. */
    suspend fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileUpdateResponse

    /** Get the current user's profile. */
    suspend fun me(
        params: ProfileMeParams = ProfileMeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileMeResponse

    /** @see [me] */
    suspend fun me(requestOptions: RequestOptions): ProfileMeResponse =
        me(ProfileMeParams.none(), requestOptions)

    /**
     * A view of [ProfileServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /profile`, but is otherwise the same as
         * [ProfileServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: ProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /profile`, but is otherwise the same as
         * [ProfileServiceAsync.me].
         */
        @MustBeClosed
        suspend fun me(
            params: ProfileMeParams = ProfileMeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileMeResponse>

        /** @see [me] */
        @MustBeClosed
        suspend fun me(requestOptions: RequestOptions): HttpResponseFor<ProfileMeResponse> =
            me(ProfileMeParams.none(), requestOptions)
    }
}
