// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.handlers.errorHandler
import shop.terminal.api.core.handlers.jsonHandler
import shop.terminal.api.core.handlers.withErrorHandler
import shop.terminal.api.core.http.HttpMethod
import shop.terminal.api.core.http.HttpRequest
import shop.terminal.api.core.http.HttpResponse.Handler
import shop.terminal.api.core.json
import shop.terminal.api.core.prepare
import shop.terminal.api.errors.TerminalError
import shop.terminal.api.models.EmailCreateParams
import shop.terminal.api.models.EmailCreateResponse

class EmailServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : EmailService {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<EmailCreateResponse> =
        jsonHandler<EmailCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Subscribe to email updates from Terminal. */
    override fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions
    ): EmailCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("email")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
