// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.checkRequired
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
import shop.terminal.api.models.token.TokenCreateParams
import shop.terminal.api.models.token.TokenCreateResponse
import shop.terminal.api.models.token.TokenDeleteParams
import shop.terminal.api.models.token.TokenDeleteResponse
import shop.terminal.api.models.token.TokenGetParams
import shop.terminal.api.models.token.TokenGetResponse
import shop.terminal.api.models.token.TokenListParams
import shop.terminal.api.models.token.TokenListResponse

class TokenServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TokenService {

    private val withRawResponse: TokenService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TokenService.WithRawResponse = withRawResponse

    override fun create(
        params: TokenCreateParams,
        requestOptions: RequestOptions,
    ): TokenCreateResponse =
        // post /token
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: TokenListParams, requestOptions: RequestOptions): TokenListResponse =
        // get /token
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions,
    ): TokenDeleteResponse =
        // delete /token/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun get(params: TokenGetParams, requestOptions: RequestOptions): TokenGetResponse =
        // get /token/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TokenService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<TokenCreateResponse> =
            jsonHandler<TokenCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: TokenCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("token")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
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

        private val listHandler: Handler<TokenListResponse> =
            jsonHandler<TokenListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: TokenListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("token")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<TokenDeleteResponse> =
            jsonHandler<TokenDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: TokenDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("token", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<TokenGetResponse> =
            jsonHandler<TokenGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun get(
            params: TokenGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("token", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
