// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

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
import shop.terminal.models.AddressCreateParams
import shop.terminal.models.AddressCreateResponse
import shop.terminal.models.AddressDeleteParams
import shop.terminal.models.AddressDeleteResponse
import shop.terminal.models.AddressListParams
import shop.terminal.models.AddressListResponse

class AddressServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AddressService {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AddressCreateResponse> =
        jsonHandler<AddressCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create and add a shipping address to the current user. */
    override fun create(
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun list(
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun delete(
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
