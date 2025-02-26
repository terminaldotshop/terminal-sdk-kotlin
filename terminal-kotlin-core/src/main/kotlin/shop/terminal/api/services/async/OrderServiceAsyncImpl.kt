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
import shop.terminal.api.core.json
import shop.terminal.api.core.prepareAsync
import shop.terminal.api.errors.TerminalError
import shop.terminal.api.models.OrderCreateParams
import shop.terminal.api.models.OrderCreateResponse
import shop.terminal.api.models.OrderGetParams
import shop.terminal.api.models.OrderGetResponse
import shop.terminal.api.models.OrderListParams
import shop.terminal.api.models.OrderListResponse

class OrderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OrderServiceAsync {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<OrderCreateResponse> =
        jsonHandler<OrderCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an order without a cart. The order will be placed immediately. */
    override suspend fun create(
        params: OrderCreateParams,
        requestOptions: RequestOptions,
    ): OrderCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("order")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<OrderListResponse> =
        jsonHandler<OrderListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List the orders associated with the current user. */
    override suspend fun list(
        params: OrderListParams,
        requestOptions: RequestOptions,
    ): OrderListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("order")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val getHandler: Handler<OrderGetResponse> =
        jsonHandler<OrderGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the order with the given ID. */
    override suspend fun get(
        params: OrderGetParams,
        requestOptions: RequestOptions,
    ): OrderGetResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("order", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { getHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
