@file:JvmName("StringHandler")

package shop.terminal.core.handlers

import shop.terminal.core.http.HttpResponse
import shop.terminal.core.http.HttpResponse.Handler

internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
