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
import shop.terminal.api.models.CartConvertParams
import shop.terminal.api.models.CartConvertResponse
import shop.terminal.api.models.CartGetParams
import shop.terminal.api.models.CartGetResponse
import shop.terminal.api.models.CartSetAddressParams
import shop.terminal.api.models.CartSetAddressResponse
import shop.terminal.api.models.CartSetCardParams
import shop.terminal.api.models.CartSetCardResponse
import shop.terminal.api.models.CartSetItemParams
import shop.terminal.api.models.CartSetItemResponse

class CartServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CartServiceAsync {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val convertHandler: Handler<CartConvertResponse> =
        jsonHandler<CartConvertResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Convert the current user's cart to an order. */
    override suspend fun convert(
        params: CartConvertParams,
        requestOptions: RequestOptions
    ): CartConvertResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("cart", "convert")
                .apply { params._body()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { convertHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val getHandler: Handler<CartGetResponse> =
        jsonHandler<CartGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the current user's cart. */
    override suspend fun get(
        params: CartGetParams,
        requestOptions: RequestOptions
    ): CartGetResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("cart")
                .build()
                .prepareAsync(clientOptions, params)
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

    private val setAddressHandler: Handler<CartSetAddressResponse> =
        jsonHandler<CartSetAddressResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Set the shipping address for the current user's cart. */
    override suspend fun setAddress(
        params: CartSetAddressParams,
        requestOptions: RequestOptions
    ): CartSetAddressResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("cart", "address")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
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
    override suspend fun setCard(
        params: CartSetCardParams,
        requestOptions: RequestOptions
    ): CartSetCardResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("cart", "card")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
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
    override suspend fun setItem(
        params: CartSetItemParams,
        requestOptions: RequestOptions
    ): CartSetItemResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("cart", "item")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
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
