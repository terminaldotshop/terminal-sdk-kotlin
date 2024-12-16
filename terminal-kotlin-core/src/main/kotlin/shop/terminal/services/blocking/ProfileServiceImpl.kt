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
import shop.terminal.models.ProfileMeParams
import shop.terminal.models.ProfileMeResponse
import shop.terminal.models.ProfileUpdateParams
import shop.terminal.models.ProfileUpdateResponse

class ProfileServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ProfileService {

    private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<ProfileUpdateResponse> =
        jsonHandler<ProfileUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the current user's profile. */
    override fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions
    ): ProfileUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("profile")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val meHandler: Handler<ProfileMeResponse> =
        jsonHandler<ProfileMeResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the current user's profile. */
    override fun me(params: ProfileMeParams, requestOptions: RequestOptions): ProfileMeResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("profile")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { meHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
