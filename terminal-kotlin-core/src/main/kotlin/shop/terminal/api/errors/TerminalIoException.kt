package shop.terminal.api.errors

class TerminalIoException(message: String? = null, cause: Throwable? = null) :
    TerminalException(message, cause)
