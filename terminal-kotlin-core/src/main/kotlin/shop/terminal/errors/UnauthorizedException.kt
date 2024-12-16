package shop.terminal.errors

import shop.terminal.core.http.Headers

class UnauthorizedException(
    headers: Headers,
    body: String,
    error: TerminalError,
) : TerminalServiceException(401, headers, body, error)
