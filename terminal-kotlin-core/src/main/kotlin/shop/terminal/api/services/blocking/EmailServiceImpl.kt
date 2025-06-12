// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.handlers.errorHandler
import shop.terminal.api.core.handlers.jsonHandler
import shop.terminal.api.core.handlers.withErrorHandler
import shop.terminal.api.core.http.HttpMethod
import shop.terminal.api.core.http.HttpRequest
import shop.terminal.api.core.http.HttpResponse.Handler
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.core.http.json
import shop.terminal.api.core.http.parseable
import shop.terminal.api.core.prepare
import shop.terminal.api.models.email.EmailCreateParams
import shop.terminal.api.models.email.EmailCreateResponse

class EmailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailService {

    private val withRawResponse: EmailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmailService.WithRawResponse = withRawResponse

    override fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions,
    ): EmailCreateResponse =
        // post /email
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<EmailCreateResponse> =
            jsonHandler<EmailCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: EmailCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
