package shop.terminal.api.errors

open class TerminalException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
