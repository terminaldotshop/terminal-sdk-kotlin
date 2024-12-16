package shop.terminal.errors

import shop.terminal.core.http.Headers

class PermissionDeniedException(
    headers: Headers,
    body: String,
    error: TerminalError,
) : TerminalServiceException(403, headers, body, error)
