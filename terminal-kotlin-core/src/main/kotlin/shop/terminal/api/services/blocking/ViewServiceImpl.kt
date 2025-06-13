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
import shop.terminal.api.core.http.parseable
import shop.terminal.api.core.prepare
import shop.terminal.api.models.view.ViewInitParams
import shop.terminal.api.models.view.ViewInitResponse

class ViewServiceImpl internal constructor(private val clientOptions: ClientOptions) : ViewService {

    private val withRawResponse: ViewService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ViewService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ViewService =
        ViewServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun init(params: ViewInitParams, requestOptions: RequestOptions): ViewInitResponse =
        // get /view/init
        withRawResponse().init(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ViewService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ViewService.WithRawResponse =
            ViewServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val initHandler: Handler<ViewInitResponse> =
            jsonHandler<ViewInitResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun init(
            params: ViewInitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ViewInitResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("view", "init")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
