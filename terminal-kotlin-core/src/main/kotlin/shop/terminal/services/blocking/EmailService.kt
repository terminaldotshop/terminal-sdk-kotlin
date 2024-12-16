// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import shop.terminal.core.RequestOptions
import shop.terminal.models.EmailCreateParams
import shop.terminal.models.EmailCreateResponse

interface EmailService {

    /** Subscribe to email updates from Terminal. */
    fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EmailCreateResponse
}
