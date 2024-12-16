// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.async

import shop.terminal.core.RequestOptions
import shop.terminal.models.EmailCreateParams
import shop.terminal.models.EmailCreateResponse

interface EmailServiceAsync {

    /** Subscribe to email updates from Terminal. */
    suspend fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EmailCreateResponse
}
