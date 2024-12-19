// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import java.time.Clock
import shop.terminal.api.core.http.Headers
import shop.terminal.api.core.http.HttpClient
import shop.terminal.api.core.http.PhantomReachableClosingHttpClient
import shop.terminal.api.core.http.QueryParams
import shop.terminal.api.core.http.RetryingHttpClient

class ClientOptions
private constructor(
    private val originalHttpClient: HttpClient,
    val httpClient: HttpClient,
    val jsonMapper: JsonMapper,
    val clock: Clock,
    val baseUrl: String,
    val headers: Headers,
    val queryParams: QueryParams,
    val responseValidation: Boolean,
    val maxRetries: Int,
    val bearerToken: String,
) {

    fun toBuilder() = Builder().from(this)

    companion object {

        const val PRODUCTION_URL = "https://api.terminal.shop/"

        const val SANDBOX_URL = "https://sandbox.terminal.shop/"

        fun builder() = Builder()

        fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    class Builder {

        private var httpClient: HttpClient? = null
        private var jsonMapper: JsonMapper = jsonMapper()
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String = PRODUCTION_URL
        private var headers: Headers.Builder = Headers.builder()
        private var queryParams: QueryParams.Builder = QueryParams.builder()
        private var responseValidation: Boolean = false
        private var maxRetries: Int = 2
        private var bearerToken: String? = null

        internal fun from(clientOptions: ClientOptions) = apply {
            httpClient = clientOptions.originalHttpClient
            jsonMapper = clientOptions.jsonMapper
            clock = clientOptions.clock
            baseUrl = clientOptions.baseUrl
            headers = clientOptions.headers.toBuilder()
            queryParams = clientOptions.queryParams.toBuilder()
            responseValidation = clientOptions.responseValidation
            maxRetries = clientOptions.maxRetries
            bearerToken = clientOptions.bearerToken
        }

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun baseUrl(baseUrl: String) = apply { this.baseUrl = baseUrl }

        fun headers(headers: Headers) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply { headers.put(name, values) }

        fun putAllHeaders(headers: Headers) = apply { this.headers.putAll(headers) }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.putAll(headers)
        }

        fun replaceHeaders(name: String, value: String) = apply { headers.replace(name, value) }

        fun replaceHeaders(name: String, values: Iterable<String>) = apply {
            headers.replace(name, values)
        }

        fun replaceAllHeaders(headers: Headers) = apply { this.headers.replaceAll(headers) }

        fun replaceAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.replaceAll(headers)
        }

        fun removeHeaders(name: String) = apply { headers.remove(name) }

        fun removeAllHeaders(names: Set<String>) = apply { headers.removeAll(names) }

        fun queryParams(queryParams: QueryParams) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply { queryParams.put(key, value) }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.put(key, values)
        }

        fun putAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun replaceQueryParams(key: String, value: String) = apply {
            queryParams.replace(key, value)
        }

        fun replaceQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.replace(key, values)
        }

        fun replaceAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun replaceAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun removeQueryParams(key: String) = apply { queryParams.remove(key) }

        fun removeAllQueryParams(keys: Set<String>) = apply { queryParams.removeAll(keys) }

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun bearerToken(bearerToken: String) = apply { this.bearerToken = bearerToken }

        fun fromEnv() = apply { System.getenv("TERMINAL_BEARER_TOKEN")?.let { bearerToken(it) } }

        fun build(): ClientOptions {
            checkNotNull(httpClient) { "`httpClient` is required but was not set" }
            checkNotNull(bearerToken) { "`bearerToken` is required but was not set" }

            val headers = Headers.builder()
            val queryParams = QueryParams.builder()
            headers.put("X-Stainless-Lang", "kotlin")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime", "JRE")
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            bearerToken?.let {
                if (!it.isEmpty()) {
                    headers.put("Authorization", "Bearer $it")
                }
            }
            headers.replaceAll(this.headers.build())
            queryParams.replaceAll(this.queryParams.build())

            return ClientOptions(
                httpClient!!,
                PhantomReachableClosingHttpClient(
                    RetryingHttpClient.builder()
                        .httpClient(httpClient!!)
                        .clock(clock)
                        .maxRetries(maxRetries)
                        .build()
                ),
                jsonMapper,
                clock,
                baseUrl,
                headers.build(),
                queryParams.build(),
                responseValidation,
                maxRetries,
                bearerToken!!,
            )
        }
    }
}