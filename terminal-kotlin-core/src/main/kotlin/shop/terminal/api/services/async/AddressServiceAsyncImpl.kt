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
import shop.terminal.api.models.AddressCreateParams
import shop.terminal.api.models.AddressCreateResponse
import shop.terminal.api.models.AddressDeleteParams
import shop.terminal.api.models.AddressDeleteResponse
import shop.terminal.api.models.AddressListParams
import shop.terminal.api.models.AddressListResponse

class AddressServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : AddressServiceAsync {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AddressCreateResponse> =
        jsonHandler<AddressCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create and add a shipping address to the current user. */
    override suspend fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions
    ): AddressCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("address")
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

    private val listHandler: Handler<AddressListResponse> =
        jsonHandler<AddressListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the shipping addresses associated with the current user. */
    override suspend fun list(
        params: AddressListParams,
        requestOptions: RequestOptions
    ): AddressListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("address")
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

    private val deleteHandler: Handler<AddressDeleteResponse> =
        jsonHandler<AddressDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a shipping address from the current user. */
    override suspend fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions
    ): AddressDeleteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("address", params.getPathParam(0))
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
