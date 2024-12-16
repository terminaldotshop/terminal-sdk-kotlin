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
import shop.terminal.models.CartListParams
import shop.terminal.models.CartListResponse
import shop.terminal.models.CartSetAddressParams
import shop.terminal.models.CartSetAddressResponse
import shop.terminal.models.CartSetCardParams
import shop.terminal.models.CartSetCardResponse
import shop.terminal.models.CartSetItemParams
import shop.terminal.models.CartSetItemResponse

class CartServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CartService {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CartListResponse> =
        jsonHandler<CartListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the current user's cart. */
    override fun list(params: CartListParams, requestOptions: RequestOptions): CartListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("cart")
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

    private val setAddressHandler: Handler<CartSetAddressResponse> =
        jsonHandler<CartSetAddressResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Set the shipping address for the current user's cart. */
    override fun setAddress(
        params: CartSetAddressParams,
        requestOptions: RequestOptions
    ): CartSetAddressResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("cart", "address")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { setAddressHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val setCardHandler: Handler<CartSetCardResponse> =
        jsonHandler<CartSetCardResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Set the credit card for the current user's cart. */
    override fun setCard(
        params: CartSetCardParams,
        requestOptions: RequestOptions
    ): CartSetCardResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("cart", "card")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { setCardHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val setItemHandler: Handler<CartSetItemResponse> =
        jsonHandler<CartSetItemResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Add an item to the current user's cart. */
    override fun setItem(
        params: CartSetItemParams,
        requestOptions: RequestOptions
    ): CartSetItemResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("cart", "item")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { setItemHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
