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
import shop.terminal.api.errors.TerminalError
import shop.terminal.api.models.SubscriptionCreateParams
import shop.terminal.api.models.SubscriptionCreateResponse
import shop.terminal.api.models.SubscriptionDeleteParams
import shop.terminal.api.models.SubscriptionDeleteResponse
import shop.terminal.api.models.SubscriptionListParams
import shop.terminal.api.models.SubscriptionListResponse

class SubscriptionServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : SubscriptionServiceAsync {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<SubscriptionCreateResponse> =
        jsonHandler<SubscriptionCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a subscription for the current user. */
    override suspend fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions
    ): SubscriptionCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("subscription")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<SubscriptionListResponse> =
        jsonHandler<SubscriptionListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the subscriptions associated with the current user. */
    override suspend fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions
    ): SubscriptionListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("subscription")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val deleteHandler: Handler<SubscriptionDeleteResponse> =
        jsonHandler<SubscriptionDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Cancel a subscription for the current user. */
    override suspend fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions
    ): SubscriptionDeleteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("subscription", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { deleteHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
