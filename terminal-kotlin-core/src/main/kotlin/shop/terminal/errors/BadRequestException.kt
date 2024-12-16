package shop.terminal.errors

import shop.terminal.core.http.Headers

class BadRequestException(
    headers: Headers,
    body: String,
    error: TerminalError,
) : TerminalServiceException(400, headers, body, error)
