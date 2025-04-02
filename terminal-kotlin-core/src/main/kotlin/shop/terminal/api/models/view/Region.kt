// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.view

import com.fasterxml.jackson.annotation.JsonCreator
import shop.terminal.api.core.Enum
import shop.terminal.api.core.JsonField
import shop.terminal.api.errors.TerminalInvalidDataException

/** A Terminal shop user's region. */
class Region @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val EU = of("eu")

        val NA = of("na")

        fun of(value: String) = Region(JsonField.of(value))
    }

    /** An enum containing [Region]'s known values. */
    enum class Known {
        EU,
        NA,
    }

    /**
     * An enum containing [Region]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [Region] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        EU,
        NA,
        /** An enum member indicating that [Region] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            EU -> Value.EU
            NA -> Value.NA
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws TerminalInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            EU -> Known.EU
            NA -> Known.NA
            else -> throw TerminalInvalidDataException("Unknown Region: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws TerminalInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw TerminalInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    fun validate(): Region = apply {
        if (validated) {
            return@apply
        }

        known()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: TerminalInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Region && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
