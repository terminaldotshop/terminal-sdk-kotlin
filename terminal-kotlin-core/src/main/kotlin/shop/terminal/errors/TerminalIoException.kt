package shop.terminal.errors

class TerminalIoException(message: String? = null, cause: Throwable? = null) :
    TerminalException(message, cause)
