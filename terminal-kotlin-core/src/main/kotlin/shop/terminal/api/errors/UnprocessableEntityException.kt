package shop.terminal.api.errors

import shop.terminal.api.core.http.Headers

class UnprocessableEntityException(
    headers: Headers,
    body: String,
    error: TerminalError,
) : TerminalServiceException(422, headers, body, error)
