// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.RequestOptions
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.handlers.errorHandler
import shop.terminal.api.core.handlers.jsonHandler
import shop.terminal.api.core.handlers.withErrorHandler
import shop.terminal.api.core.http.HttpMethod
import shop.terminal.api.core.http.HttpRequest
import shop.terminal.api.core.http.HttpResponse.Handler
import shop.terminal.api.core.http.HttpResponseFor
import shop.terminal.api.core.http.parseable
import shop.terminal.api.core.prepareAsync
import shop.terminal.api.models.product.ProductGetParams
import shop.terminal.api.models.product.ProductGetResponse
import shop.terminal.api.models.product.ProductListParams
import shop.terminal.api.models.product.ProductListResponse

class ProductServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductServiceAsync {

    private val withRawResponse: ProductServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProductServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProductServiceAsync =
        ProductServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun list(
        params: ProductListParams,
        requestOptions: RequestOptions,
    ): ProductListResponse =
        // get /product
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun get(
        params: ProductGetParams,
        requestOptions: RequestOptions,
    ): ProductGetResponse =
        // get /product/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ProductServiceAsync.WithRawResponse =
            ProductServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<ProductListResponse> =
            jsonHandler<ProductListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: ProductListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("product")
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

        private val getHandler: Handler<ProductGetResponse> =
            jsonHandler<ProductGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun get(
            params: ProductGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("product", params._pathParam(0))
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
