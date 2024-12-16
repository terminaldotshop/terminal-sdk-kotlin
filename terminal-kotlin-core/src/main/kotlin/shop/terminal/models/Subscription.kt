// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import shop.terminal.core.Enum
import shop.terminal.core.ExcludeMissing
import shop.terminal.core.JsonField
import shop.terminal.core.JsonMissing
import shop.terminal.core.JsonValue
import shop.terminal.core.NoAutoDetect
import shop.terminal.core.toImmutable
import shop.terminal.errors.TerminalInvalidDataException

/** Subscription to a Terminal shop product. */
@JsonDeserialize(builder = Subscription.Builder::class)
@NoAutoDetect
class Subscription
private constructor(
    private val id: JsonField<String>,
    private val productVariantId: JsonField<String>,
    private val quantity: JsonField<Long>,
    private val addressId: JsonField<String>,
    private val cardId: JsonField<String>,
    private val frequency: JsonField<Frequency>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** ID of the product variant being subscribed to. */
    fun productVariantId(): String = productVariantId.getRequired("productVariantID")

    /** Quantity of the subscription. */
    fun quantity(): Long = quantity.getRequired("quantity")

    /** ID of the shipping address used for the subscription. */
    fun addressId(): String = addressId.getRequired("addressID")

    /** ID of the card used for the subscription. */
    fun cardId(): String = cardId.getRequired("cardID")

    /** Frequency of the subscription. */
    fun frequency(): Frequency = frequency.getRequired("frequency")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** ID of the product variant being subscribed to. */
    @JsonProperty("productVariantID") @ExcludeMissing fun _productVariantId() = productVariantId

    /** Quantity of the subscription. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    /** ID of the shipping address used for the subscription. */
    @JsonProperty("addressID") @ExcludeMissing fun _addressId() = addressId

    /** ID of the card used for the subscription. */
    @JsonProperty("cardID") @ExcludeMissing fun _cardId() = cardId

    /** Frequency of the subscription. */
    @JsonProperty("frequency") @ExcludeMissing fun _frequency() = frequency

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Subscription = apply {
        if (!validated) {
            id()
            productVariantId()
            quantity()
            addressId()
            cardId()
            frequency()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var productVariantId: JsonField<String> = JsonMissing.of()
        private var quantity: JsonField<Long> = JsonMissing.of()
        private var addressId: JsonField<String> = JsonMissing.of()
        private var cardId: JsonField<String> = JsonMissing.of()
        private var frequency: JsonField<Frequency> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscription: Subscription) = apply {
            this.id = subscription.id
            this.productVariantId = subscription.productVariantId
            this.quantity = subscription.quantity
            this.addressId = subscription.addressId
            this.cardId = subscription.cardId
            this.frequency = subscription.frequency
            additionalProperties(subscription.additionalProperties)
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** ID of the product variant being subscribed to. */
        fun productVariantId(productVariantId: String) =
            productVariantId(JsonField.of(productVariantId))

        /** ID of the product variant being subscribed to. */
        @JsonProperty("productVariantID")
        @ExcludeMissing
        fun productVariantId(productVariantId: JsonField<String>) = apply {
            this.productVariantId = productVariantId
        }

        /** Quantity of the subscription. */
        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

        /** Quantity of the subscription. */
        @JsonProperty("quantity")
        @ExcludeMissing
        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

        /** ID of the shipping address used for the subscription. */
        fun addressId(addressId: String) = addressId(JsonField.of(addressId))

        /** ID of the shipping address used for the subscription. */
        @JsonProperty("addressID")
        @ExcludeMissing
        fun addressId(addressId: JsonField<String>) = apply { this.addressId = addressId }

        /** ID of the card used for the subscription. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** ID of the card used for the subscription. */
        @JsonProperty("cardID")
        @ExcludeMissing
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** Frequency of the subscription. */
        fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

        /** Frequency of the subscription. */
        @JsonProperty("frequency")
        @ExcludeMissing
        fun frequency(frequency: JsonField<Frequency>) = apply { this.frequency = frequency }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Subscription =
            Subscription(
                id,
                productVariantId,
                quantity,
                addressId,
                cardId,
                frequency,
                additionalProperties.toImmutable(),
            )
    }

    class Frequency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val FIXED = of("fixed")

            val DAILY = of("daily")

            val WEEKLY = of("weekly")

            val MONTHLY = of("monthly")

            val YEARLY = of("yearly")

            fun of(value: String) = Frequency(JsonField.of(value))
        }

        enum class Known {
            FIXED,
            DAILY,
            WEEKLY,
            MONTHLY,
            YEARLY,
        }

        enum class Value {
            FIXED,
            DAILY,
            WEEKLY,
            MONTHLY,
            YEARLY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FIXED -> Value.FIXED
                DAILY -> Value.DAILY
                WEEKLY -> Value.WEEKLY
                MONTHLY -> Value.MONTHLY
                YEARLY -> Value.YEARLY
                else -> Value._UNKNOWN
            }

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

        return /* spotless:off */ other is Subscription && id == other.id && productVariantId == other.productVariantId && quantity == other.quantity && addressId == other.addressId && cardId == other.cardId && frequency == other.frequency && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, productVariantId, quantity, addressId, cardId, frequency, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscription{id=$id, productVariantId=$productVariantId, quantity=$quantity, addressId=$addressId, cardId=$cardId, frequency=$frequency, additionalProperties=$additionalProperties}"
}
