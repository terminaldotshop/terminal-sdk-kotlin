package shop.terminal.api.errors

import shop.terminal.api.core.http.Headers

class NotFoundException(
    headers: Headers,
    body: String,
    error: TerminalError,
) : TerminalServiceException(404, headers, body, error)
