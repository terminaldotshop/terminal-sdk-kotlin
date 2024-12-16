package shop.terminal.errors

class TerminalInvalidDataException(message: String? = null, cause: Throwable? = null) :
    TerminalException(message, cause)
