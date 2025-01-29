package shop.terminal.api.core

import shop.terminal.api.core.http.HttpRequest

internal fun HttpRequest.prepare(clientOptions: ClientOptions, params: Params): HttpRequest =
    toBuilder()
        .putAllQueryParams(clientOptions.queryParams)
        .replaceAllQueryParams(params._queryParams())
        .putAllHeaders(clientOptions.headers)
        .replaceAllHeaders(params._headers())
        .build()

internal suspend fun HttpRequest.prepareAsync(clientOptions: ClientOptions, params: Params) =
    // This async version exists to make it easier to add async specific preparation logic in the
    // future.
    prepare(clientOptions, params)
