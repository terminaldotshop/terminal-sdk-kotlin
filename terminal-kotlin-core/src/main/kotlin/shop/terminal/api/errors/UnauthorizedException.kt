package shop.terminal.api.errors

import shop.terminal.api.core.http.Headers

class UnauthorizedException(
    headers: Headers,
    body: String,
    error: TerminalError,
) : TerminalServiceException(401, headers, body, error)
