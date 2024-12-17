// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.async

import shop.terminal.core.ClientOptions
import shop.terminal.core.RequestOptions
import shop.terminal.core.handlers.errorHandler
import shop.terminal.core.handlers.jsonHandler
import shop.terminal.core.handlers.withErrorHandler
import shop.terminal.core.http.HttpMethod
import shop.terminal.core.http.HttpRequest
import shop.terminal.core.http.HttpResponse.Handler
import shop.terminal.core.json
import shop.terminal.errors.TerminalError
import shop.terminal.models.TokenDeleteParams
import shop.terminal.models.TokenDeleteResponse
import shop.terminal.models.TokenGetParams
import shop.terminal.models.TokenGetResponse
import shop.terminal.models.TokenListParams
import shop.terminal.models.TokenListResponse

class TokenServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TokenServiceAsync {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<TokenListResponse> =
        jsonHandler<TokenListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List the current user's personal access tokens. */
    override suspend fun list(
        params: TokenListParams,
        requestOptions: RequestOptions
    ): TokenListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("token")
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

    private val deleteHandler: Handler<TokenDeleteResponse> =
        jsonHandler<TokenDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete the personal access token with the given ID. */
    override suspend fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions
    ): TokenDeleteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("token", params.getPathParam(0))
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

    private val getHandler: Handler<TokenGetResponse> =
        jsonHandler<TokenGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the personal token with the given ID. */
    override suspend fun get(
        params: TokenGetParams,
        requestOptions: RequestOptions
    ): TokenGetResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("token", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { getHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
