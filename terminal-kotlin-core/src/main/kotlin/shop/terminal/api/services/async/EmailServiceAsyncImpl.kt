// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

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
import shop.terminal.api.core.prepareAsync
import shop.terminal.api.models.email.EmailCreateParams
import shop.terminal.api.models.email.EmailCreateResponse

class EmailServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailServiceAsync {

    private val withRawResponse: EmailServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EmailServiceAsync =
        EmailServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions,
    ): EmailCreateResponse =
        // post /email
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EmailServiceAsync.WithRawResponse =
            EmailServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<EmailCreateResponse> =
            jsonHandler<EmailCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
