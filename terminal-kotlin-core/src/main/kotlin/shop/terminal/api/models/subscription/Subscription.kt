// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.subscription

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import shop.terminal.api.core.BaseDeserializer
import shop.terminal.api.core.BaseSerializer
import shop.terminal.api.core.Enum
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.NoAutoDetect
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.getOrThrow
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
    @JsonProperty("productVariantID")
    @ExcludeMissing
    private val productVariantId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("next") @ExcludeMissing private val next: JsonField<String> = JsonMissing.of(),
    @JsonProperty("schedule")
    @ExcludeMissing
    private val schedule: JsonField<Schedule> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Unique object identifier. The format and length of IDs may change over time.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * ID of the shipping address used for the subscription.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun addressId(): String = addressId.getRequired("addressID")

    /**
     * ID of the card used for the subscription.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardId(): String = cardId.getRequired("cardID")

    /**
     * ID of the product variant being subscribed to.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productVariantId(): String = productVariantId.getRequired("productVariantID")

    /**
     * Quantity of the subscription.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Long = quantity.getRequired("quantity")

    /**
     * Next shipment and billing date for the subscription.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun next(): String? = next.getNullable("next")

    /**
     * Schedule of the subscription.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun schedule(): Schedule? = schedule.getNullable("schedule")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [addressId].
     *
     * Unlike [addressId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addressID") @ExcludeMissing fun _addressId(): JsonField<String> = addressId

    /**
     * Returns the raw JSON value of [cardId].
     *
     * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cardID") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

    /**
     * Returns the raw JSON value of [productVariantId].
     *
     * Unlike [productVariantId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("productVariantID")
    @ExcludeMissing
    fun _productVariantId(): JsonField<String> = productVariantId

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

    /**
     * Returns the raw JSON value of [next].
     *
     * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

    /**
     * Returns the raw JSON value of [schedule].
     *
     * Unlike [schedule], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schedule") @ExcludeMissing fun _schedule(): JsonField<Schedule> = schedule

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
        productVariantId()
        quantity()
        next()
        schedule()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Subscription].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .addressId()
         * .cardId()
         * .productVariantId()
         * .quantity()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Subscription]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var addressId: JsonField<String>? = null
        private var cardId: JsonField<String>? = null
        private var productVariantId: JsonField<String>? = null
        private var quantity: JsonField<Long>? = null
        private var next: JsonField<String> = JsonMissing.of()
        private var schedule: JsonField<Schedule> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscription: Subscription) = apply {
            id = subscription.id
            addressId = subscription.addressId
            cardId = subscription.cardId
            productVariantId = subscription.productVariantId
            quantity = subscription.quantity
            next = subscription.next
            schedule = subscription.schedule
            additionalProperties = subscription.additionalProperties.toMutableMap()
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ID of the shipping address used for the subscription. */
        fun addressId(addressId: String) = addressId(JsonField.of(addressId))

        /**
         * Sets [Builder.addressId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addressId(addressId: JsonField<String>) = apply { this.addressId = addressId }

        /** ID of the card used for the subscription. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /**
         * Sets [Builder.cardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** ID of the product variant being subscribed to. */
        fun productVariantId(productVariantId: String) =
            productVariantId(JsonField.of(productVariantId))

        /**
         * Sets [Builder.productVariantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productVariantId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productVariantId(productVariantId: JsonField<String>) = apply {
            this.productVariantId = productVariantId
        }

        /** Quantity of the subscription. */
        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

        /** Next shipment and billing date for the subscription. */
        fun next(next: String) = next(JsonField.of(next))

        /**
         * Sets [Builder.next] to an arbitrary JSON value.
         *
         * You should usually call [Builder.next] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun next(next: JsonField<String>) = apply { this.next = next }

        /** Schedule of the subscription. */
        fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

        /**
         * Sets [Builder.schedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schedule] with a well-typed [Schedule] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

        /** Alias for calling [schedule] with `Schedule.ofFixed(fixed)`. */
        fun schedule(fixed: Schedule.Fixed) = schedule(Schedule.ofFixed(fixed))

        /** Alias for calling [schedule] with `Schedule.ofWeekly(weekly)`. */
        fun schedule(weekly: Schedule.Weekly) = schedule(Schedule.ofWeekly(weekly))

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

        /**
         * Returns an immutable instance of [Subscription].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .addressId()
         * .cardId()
         * .productVariantId()
         * .quantity()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Subscription =
            Subscription(
                checkRequired("id", id),
                checkRequired("addressId", addressId),
                checkRequired("cardId", cardId),
                checkRequired("productVariantId", productVariantId),
                checkRequired("quantity", quantity),
                next,
                schedule,
                additionalProperties.toImmutable(),
            )
    }

    /** Schedule of the subscription. */
    @JsonDeserialize(using = Schedule.Deserializer::class)
    @JsonSerialize(using = Schedule.Serializer::class)
    class Schedule
    private constructor(
        private val fixed: Fixed? = null,
        private val weekly: Weekly? = null,
        private val _json: JsonValue? = null,
    ) {

        fun fixed(): Fixed? = fixed

        fun weekly(): Weekly? = weekly

        fun isFixed(): Boolean = fixed != null

        fun isWeekly(): Boolean = weekly != null

        fun asFixed(): Fixed = fixed.getOrThrow("fixed")

        fun asWeekly(): Weekly = weekly.getOrThrow("weekly")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                fixed != null -> visitor.visitFixed(fixed)
                weekly != null -> visitor.visitWeekly(weekly)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Schedule = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitFixed(fixed: Fixed) {
                        fixed.validate()
                    }

                    override fun visitWeekly(weekly: Weekly) {
                        weekly.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Schedule && fixed == other.fixed && weekly == other.weekly /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(fixed, weekly) /* spotless:on */

        override fun toString(): String =
            when {
                fixed != null -> "Schedule{fixed=$fixed}"
                weekly != null -> "Schedule{weekly=$weekly}"
                _json != null -> "Schedule{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Schedule")
            }

        companion object {

            fun ofFixed(fixed: Fixed) = Schedule(fixed = fixed)

            fun ofWeekly(weekly: Weekly) = Schedule(weekly = weekly)
        }

        /**
         * An interface that defines how to map each variant of [Schedule] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitFixed(fixed: Fixed): T

            fun visitWeekly(weekly: Weekly): T

            /**
             * Maps an unknown variant of [Schedule] to a value of type [T].
             *
             * An instance of [Schedule] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TerminalInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TerminalInvalidDataException("Unknown Schedule: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Schedule>(Schedule::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Schedule {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<Fixed>()) { it.validate() }
                    ?.let {
                        return Schedule(fixed = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Weekly>()) { it.validate() }
                    ?.let {
                        return Schedule(weekly = it, _json = json)
                    }

                return Schedule(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Schedule>(Schedule::class) {

            override fun serialize(
                value: Schedule,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.fixed != null -> generator.writeObject(value.fixed)
                    value.weekly != null -> generator.writeObject(value.weekly)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Schedule")
                }
            }
        }

        @NoAutoDetect
        class Fixed
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Fixed = apply {
                if (validated) {
                    return@apply
                }

                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Fixed].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Fixed]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(fixed: Fixed) = apply {
                    type = fixed.type
                    additionalProperties = fixed.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Fixed].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Fixed =
                    Fixed(checkRequired("type", type), additionalProperties.toImmutable())
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val FIXED = of("fixed")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    FIXED
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FIXED,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FIXED -> Value.FIXED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TerminalInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FIXED -> Known.FIXED
                        else -> throw TerminalInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TerminalInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw TerminalInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Fixed && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Fixed{type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Weekly
        @JsonCreator
        private constructor(
            @JsonProperty("interval")
            @ExcludeMissing
            private val interval: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun interval(): Long = interval.getRequired("interval")

            /**
             * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [interval].
             *
             * Unlike [interval], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("interval") @ExcludeMissing fun _interval(): JsonField<Long> = interval

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Weekly = apply {
                if (validated) {
                    return@apply
                }

                interval()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Weekly].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .interval()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Weekly]. */
            class Builder internal constructor() {

                private var interval: JsonField<Long>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(weekly: Weekly) = apply {
                    interval = weekly.interval
                    type = weekly.type
                    additionalProperties = weekly.additionalProperties.toMutableMap()
                }

                fun interval(interval: Long) = interval(JsonField.of(interval))

                /**
                 * Sets [Builder.interval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.interval] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun interval(interval: JsonField<Long>) = apply { this.interval = interval }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Weekly].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .interval()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Weekly =
                    Weekly(
                        checkRequired("interval", interval),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val WEEKLY = of("weekly")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    WEEKLY
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    WEEKLY,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        WEEKLY -> Value.WEEKLY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TerminalInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        WEEKLY -> Known.WEEKLY
                        else -> throw TerminalInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TerminalInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw TerminalInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Weekly && interval == other.interval && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(interval, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Weekly{interval=$interval, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Subscription && id == other.id && addressId == other.addressId && cardId == other.cardId && productVariantId == other.productVariantId && quantity == other.quantity && next == other.next && schedule == other.schedule && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, addressId, cardId, productVariantId, quantity, next, schedule, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscription{id=$id, addressId=$addressId, cardId=$cardId, productVariantId=$productVariantId, quantity=$quantity, next=$next, schedule=$schedule, additionalProperties=$additionalProperties}"
}
