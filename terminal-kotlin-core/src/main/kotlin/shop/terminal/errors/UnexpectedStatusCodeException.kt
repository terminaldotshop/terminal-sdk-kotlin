package shop.terminal.errors

import shop.terminal.core.http.Headers

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: TerminalError,
) : TerminalServiceException(statusCode, headers, body, error)
