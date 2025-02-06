// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import shop.terminal.api.core.Enum
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.NoAutoDetect
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable
import shop.terminal.api.errors.TerminalInvalidDataException

/** Subscription to a Terminal shop product. */
@NoAutoDetect
class Subscription
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("addressID")
    @ExcludeMissing
    private val addressId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("cardID")
    @ExcludeMissing
    private val cardId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("frequency")
    @ExcludeMissing
    private val frequency: JsonField<Frequency> = JsonMissing.of(),
    @JsonProperty("productVariantID")
    @ExcludeMissing
    private val productVariantId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("next") @ExcludeMissing private val next: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** ID of the shipping address used for the subscription. */
    fun addressId(): String = addressId.getRequired("addressID")

    /** ID of the card used for the subscription. */
    fun cardId(): String = cardId.getRequired("cardID")

    /** Frequency of the subscription. */
    fun frequency(): Frequency = frequency.getRequired("frequency")

    /** ID of the product variant being subscribed to. */
    fun productVariantId(): String = productVariantId.getRequired("productVariantID")

    /** Quantity of the subscription. */
    fun quantity(): Long = quantity.getRequired("quantity")

    /** Next shipment and billing date for the subscription. */
    fun next(): String? = next.getNullable("next")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** ID of the shipping address used for the subscription. */
    @JsonProperty("addressID") @ExcludeMissing fun _addressId(): JsonField<String> = addressId

    /** ID of the card used for the subscription. */
    @JsonProperty("cardID") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

    /** Frequency of the subscription. */
    @JsonProperty("frequency") @ExcludeMissing fun _frequency(): JsonField<Frequency> = frequency

    /** ID of the product variant being subscribed to. */
    @JsonProperty("productVariantID")
    @ExcludeMissing
    fun _productVariantId(): JsonField<String> = productVariantId

    /** Quantity of the subscription. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

    /** Next shipment and billing date for the subscription. */
    @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Subscription = apply {
        if (validated) {
            return@apply
        }

        id()
        addressId()
        cardId()
        frequency()
        productVariantId()
        quantity()
        next()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [Subscription]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var addressId: JsonField<String>? = null
        private var cardId: JsonField<String>? = null
        private var frequency: JsonField<Frequency>? = null
        private var productVariantId: JsonField<String>? = null
        private var quantity: JsonField<Long>? = null
        private var next: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscription: Subscription) = apply {
            id = subscription.id
            addressId = subscription.addressId
            cardId = subscription.cardId
            frequency = subscription.frequency
            productVariantId = subscription.productVariantId
            quantity = subscription.quantity
            next = subscription.next
            additionalProperties = subscription.additionalProperties.toMutableMap()
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ID of the shipping address used for the subscription. */
        fun addressId(addressId: String) = addressId(JsonField.of(addressId))

        /** ID of the shipping address used for the subscription. */
        fun addressId(addressId: JsonField<String>) = apply { this.addressId = addressId }

        /** ID of the card used for the subscription. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** ID of the card used for the subscription. */
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** Frequency of the subscription. */
        fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

        /** Frequency of the subscription. */
        fun frequency(frequency: JsonField<Frequency>) = apply { this.frequency = frequency }

        /** ID of the product variant being subscribed to. */
        fun productVariantId(productVariantId: String) =
            productVariantId(JsonField.of(productVariantId))

        /** ID of the product variant being subscribed to. */
        fun productVariantId(productVariantId: JsonField<String>) = apply {
            this.productVariantId = productVariantId
        }

        /** Quantity of the subscription. */
        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

        /** Quantity of the subscription. */
        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

        /** Next shipment and billing date for the subscription. */
        fun next(next: String) = next(JsonField.of(next))

        /** Next shipment and billing date for the subscription. */
        fun next(next: JsonField<String>) = apply { this.next = next }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): Subscription =
            Subscription(
                checkRequired("id", id),
                checkRequired("addressId", addressId),
                checkRequired("cardId", cardId),
                checkRequired("frequency", frequency),
                checkRequired("productVariantId", productVariantId),
                checkRequired("quantity", quantity),
                next,
                additionalProperties.toImmutable(),
            )
    }

    /** Frequency of the subscription. */
    class Frequency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val FIXED = of("fixed")

            val DAILY = of("daily")

            val WEEKLY = of("weekly")

            val MONTHLY = of("monthly")

            val YEARLY = of("yearly")

            fun of(value: String) = Frequency(JsonField.of(value))
        }

        /** An enum containing [Frequency]'s known values. */
        enum class Known {
            FIXED,
            DAILY,
            WEEKLY,
            MONTHLY,
            YEARLY,
        }

        /**
         * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Frequency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIXED,
            DAILY,
            WEEKLY,
            MONTHLY,
            YEARLY,
            /**
             * An enum member indicating that [Frequency] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FIXED -> Value.FIXED
                DAILY -> Value.DAILY
                WEEKLY -> Value.WEEKLY
                MONTHLY -> Value.MONTHLY
                YEARLY -> Value.YEARLY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TerminalInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                FIXED -> Known.FIXED
                DAILY -> Known.DAILY
                WEEKLY -> Known.WEEKLY
                MONTHLY -> Known.MONTHLY
                YEARLY -> Known.YEARLY
                else -> throw TerminalInvalidDataException("Unknown Frequency: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Subscription && id == other.id && addressId == other.addressId && cardId == other.cardId && frequency == other.frequency && productVariantId == other.productVariantId && quantity == other.quantity && next == other.next && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, addressId, cardId, frequency, productVariantId, quantity, next, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscription{id=$id, addressId=$addressId, cardId=$cardId, frequency=$frequency, productVariantId=$productVariantId, quantity=$quantity, next=$next, additionalProperties=$additionalProperties}"
}
