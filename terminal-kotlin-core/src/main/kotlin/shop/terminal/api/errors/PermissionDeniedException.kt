package shop.terminal.api.errors

import shop.terminal.api.core.http.Headers

class PermissionDeniedException(
        headers: Headers,
        body: String,
        error: TerminalError,
) : TerminalServiceException(403, headers, body, error)
