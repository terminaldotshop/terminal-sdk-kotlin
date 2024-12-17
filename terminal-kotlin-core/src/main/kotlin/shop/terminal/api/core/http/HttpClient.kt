package shop.terminal.api.core.http

import java.lang.AutoCloseable
import shop.terminal.api.core.RequestOptions

interface HttpClient : AutoCloseable {

    fun execute(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    suspend fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse
}
