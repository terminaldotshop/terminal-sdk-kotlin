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
import shop.terminal.api.models.profile.ProfileMeParams
import shop.terminal.api.models.profile.ProfileMeResponse
import shop.terminal.api.models.profile.ProfileUpdateParams
import shop.terminal.api.models.profile.ProfileUpdateResponse

class ProfileServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ProfileService {

    private val withRawResponse: ProfileService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): ProfileService.WithRawResponse = withRawResponse

    override fun update(params: ProfileUpdateParams, requestOptions: RequestOptions): ProfileUpdateResponse =
        // put /profile
        withRawResponse().update(params, requestOptions).parse()

    override fun me(params: ProfileMeParams, requestOptions: RequestOptions): ProfileMeResponse =
        // get /profile
        withRawResponse().me(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ProfileService.WithRawResponse {

        private val errorHandler: Handler<TerminalError> = errorHandler(clientOptions.jsonMapper)

        private val updateHandler: Handler<ProfileUpdateResponse> = jsonHandler<ProfileUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(params: ProfileUpdateParams, requestOptions: RequestOptions): HttpResponseFor<ProfileUpdateResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .addPathSegments("profile")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  updateHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val meHandler: Handler<ProfileMeResponse> = jsonHandler<ProfileMeResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun me(params: ProfileMeParams, requestOptions: RequestOptions): HttpResponseFor<ProfileMeResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("profile")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  meHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }
    }
}
