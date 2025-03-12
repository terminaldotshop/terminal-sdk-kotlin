@file:JvmName("JsonHandler")

package shop.terminal.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import shop.terminal.api.core.enhanceJacksonException
import shop.terminal.api.core.http.HttpResponse
import shop.terminal.api.core.http.HttpResponse.Handler
import shop.terminal.api.errors.TerminalException

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw enhanceJacksonException("Error reading response", e)
            }
        }
    }
