package shop.terminal.errors

import shop.terminal.core.http.Headers

class UnprocessableEntityException(
    headers: Headers,
    body: String,
    error: TerminalError,
) : TerminalServiceException(422, headers, body, error)
