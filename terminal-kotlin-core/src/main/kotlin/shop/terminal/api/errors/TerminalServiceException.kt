// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.errors

import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.http.Headers

abstract class TerminalServiceException
protected constructor(message: String, cause: Throwable? = null) :
    TerminalException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
