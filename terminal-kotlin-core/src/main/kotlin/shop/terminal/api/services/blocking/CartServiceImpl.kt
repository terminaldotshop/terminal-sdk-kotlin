// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

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
import shop.terminal.api.core.prepare
import shop.terminal.api.errors.TerminalError
import shop.terminal.api.models.cart.CartConvertParams
import shop.terminal.api.models.cart.CartConvertResponse
import shop.terminal.api.models.cart.CartGetParams
import shop.terminal.api.models.cart.CartGetResponse
import shop.terminal.api.models.cart.CartRedeemGiftCardParams
import shop.terminal.api.models.cart.CartRedeemGiftCardResponse
import shop.terminal.api.models.cart.CartRemoveGiftCardParams
import shop.terminal.api.models.cart.CartRemoveGiftCardResponse
import shop.terminal.api.models.cart.CartSetAddressParams
import shop.terminal.api.models.cart.CartSetAddressResponse
import shop.terminal.api.models.cart.CartSetCardParams
import shop.terminal.api.models.cart.CartSetCardResponse
import shop.terminal.api.models.cart.CartSetItemParams
import shop.terminal.api.models.cart.CartSetItemResponse

class CartServiceImpl internal constructor(private val clientOptions: ClientOptions) : CartService {

    private val withRawResponse: CartService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CartService.WithRawResponse = withRawResponse

    override fun convert(
        params: CartConvertParams,
        requestOptions: RequestOptions,
    ): CartConvertResponse =
        // post /cart/convert
        withRawResponse().convert(params, requestOptions).parse()

    override fun get(params: CartGetParams, requestOptions: RequestOptions): CartGetResponse =
        // get /cart
        withRawResponse().get(params, requestOptions).parse()

    override fun redeemGiftCard(
        params: CartRedeemGiftCardParams,
        requestOptions: RequestOptions,
    ): CartRedeemGiftCardResponse =
        // put /cart/gift-card
        withRawResponse().redeemGiftCard(params, requestOptions).parse()

    override fun removeGiftCard(
        params: CartRemoveGiftCardParams,
        requestOptions: RequestOptions,
    ): CartRemoveGiftCardResponse =
        // delete /cart/gift-card
        withRawResponse().removeGiftCard(params, requestOptions).parse()

    override fun setAddress(
        params: CartSetAddressParams,
        requestOptions: RequestOptions,
    ): CartSetAddressResponse =
        // put /cart/address
        withRawResponse().setAddress(params, requestOptions).parse()

    override fun setCard(
        params: CartSetCardParams,
        requestOptions: RequestOptions,
    ): CartSetCardResponse =
        // put /cart/card
        withRawResponse().setCard(params, requestOptions).parse()

    override fun setItem(
        params: CartSetItemParams,
        requestOptions: RequestOptions,
    ): CartSetItemResponse =
        // put /cart/item
        withRawResponse().setItem(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CartService.WithRawResponse {

        private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

        private val convertHandler: Handler<CartConvertResponse> =
            jsonHandler<CartConvertResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun convert(
            params: CartConvertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CartConvertResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("cart", "convert")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { convertHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<CartGetResponse> =
            jsonHandler<CartGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun get(
            params: CartGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CartGetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("cart")
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

        private val redeemGiftCardHandler: Handler<CartRedeemGiftCardResponse> =
            jsonHandler<CartRedeemGiftCardResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun redeemGiftCard(
            params: CartRedeemGiftCardParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CartRedeemGiftCardResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("cart", "gift-card")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { redeemGiftCardHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val removeGiftCardHandler: Handler<CartRemoveGiftCardResponse> =
            jsonHandler<CartRemoveGiftCardResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun removeGiftCard(
            params: CartRemoveGiftCardParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CartRemoveGiftCardResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("cart", "gift-card")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { removeGiftCardHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setAddressHandler: Handler<CartSetAddressResponse> =
            jsonHandler<CartSetAddressResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun setAddress(
            params: CartSetAddressParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CartSetAddressResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("cart", "address")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { setAddressHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setCardHandler: Handler<CartSetCardResponse> =
            jsonHandler<CartSetCardResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun setCard(
            params: CartSetCardParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CartSetCardResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("cart", "card")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { setCardHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setItemHandler: Handler<CartSetItemResponse> =
            jsonHandler<CartSetItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun setItem(
            params: CartSetItemParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CartSetItemResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("cart", "item")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { setItemHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
