package shop.terminal.api.errors

import shop.terminal.api.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: TerminalError) :
    TerminalServiceException(429, headers, body, error)
