// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.handlers.errorHandler
import shop.terminal.api.core.handlers.jsonHandler
import shop.terminal.api.core.handlers.withErrorHandler
import shop.terminal.api.core.http.HttpMethod
import shop.terminal.api.core.http.HttpRequest
import shop.terminal.api.core.http.HttpResponse.Handler
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.core.http.parseable
import shop.terminal.api.core.prepareAsync
import shop.terminal.api.errors.TerminalError
import shop.terminal.api.models.ViewInitParams
import shop.terminal.api.models.ViewInitResponse

class ViewServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ViewServiceAsync {

    private val withRawResponse: ViewServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ViewServiceAsync.WithRawResponse = withRawResponse

    override suspend fun init(
        params: ViewInitParams,
        requestOptions: RequestOptions,
    ): ViewInitResponse =
        // get /view/init
        withRawResponse().init(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ViewServiceAsync.WithRawResponse {

        private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

        private val initHandler: Handler<ViewInitResponse> =
            jsonHandler<ViewInitResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun init(
            params: ViewInitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ViewInitResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("view", "init")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { initHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
