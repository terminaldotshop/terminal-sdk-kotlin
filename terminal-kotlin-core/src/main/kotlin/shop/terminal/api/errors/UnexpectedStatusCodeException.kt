package shop.terminal.api.errors

import shop.terminal.api.core.http.Headers

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: TerminalError,
) : TerminalServiceException(statusCode, headers, body, error)
