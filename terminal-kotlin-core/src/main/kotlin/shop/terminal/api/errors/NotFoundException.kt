// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.errors

import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.http.Headers

class NotFoundException
private constructor(private val headers: Headers, private val body: JsonValue, cause: Throwable?) :
    TerminalServiceException("404: $body", cause) {

    override fun statusCode(): Int = 404

    override fun headers(): Headers = headers

    override fun body(): JsonValue = body

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NotFoundException].
         *
         * The following fields are required:
         * ```kotlin
         * .headers()
         * .body()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [NotFoundException]. */
    class Builder internal constructor() {

        private var headers: Headers? = null
        private var body: JsonValue? = null
        private var cause: Throwable? = null

        internal fun from(notFoundException: NotFoundException) = apply {
            headers = notFoundException.headers
            body = notFoundException.body
            cause = notFoundException.cause
        }

        fun headers(headers: Headers) = apply { this.headers = headers }

        fun body(body: JsonValue) = apply { this.body = body }

        fun cause(cause: Throwable?) = apply { this.cause = cause }

        /**
         * Returns an immutable instance of [NotFoundException].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .headers()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotFoundException =
            NotFoundException(checkRequired("headers", headers), checkRequired("body", body), cause)
    }
}
