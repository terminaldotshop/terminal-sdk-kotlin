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
import shop.terminal.api.core.http.json
import shop.terminal.api.core.http.parseable
import shop.terminal.api.core.prepareAsync
import shop.terminal.api.errors.TerminalError
import shop.terminal.api.models.card.CardCollectParams
import shop.terminal.api.models.card.CardCollectResponse
import shop.terminal.api.models.card.CardCreateParams
import shop.terminal.api.models.card.CardCreateResponse
import shop.terminal.api.models.card.CardDeleteParams
import shop.terminal.api.models.card.CardDeleteResponse
import shop.terminal.api.models.card.CardGetParams
import shop.terminal.api.models.card.CardGetResponse
import shop.terminal.api.models.card.CardListParams
import shop.terminal.api.models.card.CardListResponse

class CardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardServiceAsync {

    private val withRawResponse: CardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions,
    ): CardCreateResponse =
        // post /card
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: CardListParams,
        requestOptions: RequestOptions,
    ): CardListResponse =
        // get /card
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions,
    ): CardDeleteResponse =
        // delete /card/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun collect(
        params: CardCollectParams,
        requestOptions: RequestOptions,
    ): CardCollectResponse =
        // post /card/collect
        withRawResponse().collect(params, requestOptions).parse()

    override suspend fun get(
        params: CardGetParams,
        requestOptions: RequestOptions,
    ): CardGetResponse =
        // get /card/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CardCreateResponse> =
            jsonHandler<CardCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("card")
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

        private val listHandler: Handler<CardListResponse> =
            jsonHandler<CardListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(
            params: CardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("card")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val deleteHandler: Handler<CardDeleteResponse> =
            jsonHandler<CardDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun delete(
            params: CardDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("card", params.getPathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val collectHandler: Handler<CardCollectResponse> =
            jsonHandler<CardCollectResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun collect(
            params: CardCollectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardCollectResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("card", "collect")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { collectHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<CardGetResponse> =
            jsonHandler<CardGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun get(
            params: CardGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardGetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("card", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
