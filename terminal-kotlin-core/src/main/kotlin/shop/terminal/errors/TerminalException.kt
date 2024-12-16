package shop.terminal.errors

open class TerminalException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
