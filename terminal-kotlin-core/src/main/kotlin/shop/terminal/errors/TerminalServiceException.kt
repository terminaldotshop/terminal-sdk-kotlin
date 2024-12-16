package shop.terminal.errors

import shop.terminal.core.http.Headers

abstract class TerminalServiceException(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: TerminalError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : TerminalException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): TerminalError = error
}
