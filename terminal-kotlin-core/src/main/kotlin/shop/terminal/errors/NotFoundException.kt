package shop.terminal.errors

import shop.terminal.core.http.Headers

class NotFoundException(
    headers: Headers,
    body: String,
    error: TerminalError,
) : TerminalServiceException(404, headers, body, error)
