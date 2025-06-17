// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

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
import shop.terminal.api.core.http.json
import shop.terminal.api.core.http.parseable
import shop.terminal.api.core.prepare
import shop.terminal.api.models.address.AddressCreateParams
import shop.terminal.api.models.address.AddressCreateResponse
import shop.terminal.api.models.address.AddressDeleteParams
import shop.terminal.api.models.address.AddressDeleteResponse
import shop.terminal.api.models.address.AddressGetParams
import shop.terminal.api.models.address.AddressGetResponse
import shop.terminal.api.models.address.AddressListParams
import shop.terminal.api.models.address.AddressListResponse

class AddressServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AddressService {

    private val withRawResponse: AddressService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AddressService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AddressService =
        AddressServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions,
    ): AddressCreateResponse =
        // post /address
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: AddressListParams,
        requestOptions: RequestOptions,
    ): AddressListResponse =
        // get /address
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions,
    ): AddressDeleteResponse =
        // delete /address/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun get(params: AddressGetParams, requestOptions: RequestOptions): AddressGetResponse =
        // get /address/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AddressService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AddressService.WithRawResponse =
            AddressServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<AddressCreateResponse> =
            jsonHandler<AddressCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddressCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("address")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AddressListResponse> =
            jsonHandler<AddressListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AddressListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddressListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("address")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val deleteHandler: Handler<AddressDeleteResponse> =
            jsonHandler<AddressDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddressDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("address", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<AddressGetResponse> =
            jsonHandler<AddressGetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun get(
            params: AddressGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddressGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("address", params._pathParam(0))
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
    }
}
