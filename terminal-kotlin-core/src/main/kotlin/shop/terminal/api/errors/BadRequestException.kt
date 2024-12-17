package shop.terminal.api.errors

import shop.terminal.api.core.http.Headers

class BadRequestException(
    headers: Headers,
    body: String,
    error: TerminalError,
) : TerminalServiceException(400, headers, body, error)
