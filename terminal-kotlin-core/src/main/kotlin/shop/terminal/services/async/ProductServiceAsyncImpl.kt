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
import shop.terminal.errors.TerminalError
import shop.terminal.models.ProductListParams
import shop.terminal.models.ProductListResponse

class ProductServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ProductServiceAsync {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ProductListResponse> =
        jsonHandler<ProductListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all products for sale in the Terminal shop. */
    override suspend fun list(
        params: ProductListParams,
        requestOptions: RequestOptions
    ): ProductListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("products")
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
}
