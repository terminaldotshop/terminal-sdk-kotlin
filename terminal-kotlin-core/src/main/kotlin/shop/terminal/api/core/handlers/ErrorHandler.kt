@file:JvmName("ErrorHandler")

package shop.terminal.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import java.io.ByteArrayInputStream
import java.io.InputStream
import shop.terminal.api.core.http.Headers
import shop.terminal.api.core.http.HttpResponse
import shop.terminal.api.core.http.HttpResponse.Handler
import shop.terminal.api.errors.BadRequestException
import shop.terminal.api.errors.InternalServerException
import shop.terminal.api.errors.NotFoundException
import shop.terminal.api.errors.PermissionDeniedException
import shop.terminal.api.errors.RateLimitException
import shop.terminal.api.errors.TerminalError
import shop.terminal.api.errors.UnauthorizedException
import shop.terminal.api.errors.UnexpectedStatusCodeException
import shop.terminal.api.errors.UnprocessableEntityException

internal fun errorHandler(jsonMapper: JsonMapper): Handler<TerminalError> {
    val handler = jsonHandler<TerminalError>(jsonMapper)

    return object : Handler<TerminalError> {
        override fun handle(response: HttpResponse): TerminalError =
            try {
                handler.handle(response)
            } catch (e: Exception) {
                TerminalError.builder().build()
            }
    }
}

internal fun <T> Handler<T>.withErrorHandler(errorHandler: Handler<TerminalError>): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> {
                    return this@withErrorHandler.handle(response)
                }
                400 -> {
                    val buffered = response.buffered()
                    throw BadRequestException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                401 -> {
                    val buffered = response.buffered()
                    throw UnauthorizedException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                403 -> {
                    val buffered = response.buffered()
                    throw PermissionDeniedException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                404 -> {
                    val buffered = response.buffered()
                    throw NotFoundException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                422 -> {
                    val buffered = response.buffered()
                    throw UnprocessableEntityException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                429 -> {
                    val buffered = response.buffered()
                    throw RateLimitException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                in 500..599 -> {
                    val buffered = response.buffered()
                    throw InternalServerException(
                        statusCode,
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                else -> {
                    val buffered = response.buffered()
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
            }
        }
    }

private fun HttpResponse.buffered(): HttpResponse {
    val body = body().readBytes()

    return object : HttpResponse {
        override fun statusCode(): Int = this@buffered.statusCode()

        override fun headers(): Headers = this@buffered.headers()

        override fun body(): InputStream = ByteArrayInputStream(body)

        override fun close() = this@buffered.close()
    }
}
