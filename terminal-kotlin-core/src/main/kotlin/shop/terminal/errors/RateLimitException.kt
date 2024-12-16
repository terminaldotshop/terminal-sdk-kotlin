package shop.terminal.errors

import shop.terminal.core.http.Headers

class RateLimitException(
    headers: Headers,
    body: String,
    error: TerminalError,
) : TerminalServiceException(429, headers, body, error)
