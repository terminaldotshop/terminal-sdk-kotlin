// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

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
    @JsonProperty("schedule")
    @ExcludeMissing
    private val schedule: JsonField<Schedule> = JsonMissing.of(),
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

    /** Schedule of the subscription. */
    fun schedule(): Schedule? = schedule.getNullable("schedule")

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

    /** Schedule of the subscription. */
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
        frequency()
        productVariantId()
        quantity()
        next()
        schedule()?.validate()
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
        private var schedule: JsonField<Schedule> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscription: Subscription) = apply {
            id = subscription.id
            addressId = subscription.addressId
            cardId = subscription.cardId
            frequency = subscription.frequency
            productVariantId = subscription.productVariantId
            quantity = subscription.quantity
            next = subscription.next
            schedule = subscription.schedule
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

        /** Schedule of the subscription. */
        fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

        /** Schedule of the subscription. */
        fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

        /** Schedule of the subscription. */
        fun schedule(type: Schedule.Type) = schedule(Schedule.ofType(type))

        /** Schedule of the subscription. */
        fun schedule(unionMember1: Schedule.UnionMember1) =
            schedule(Schedule.ofUnionMember1(unionMember1))

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
                schedule,
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

    /** Schedule of the subscription. */
    @JsonDeserialize(using = Schedule.Deserializer::class)
    @JsonSerialize(using = Schedule.Serializer::class)
    class Schedule
    private constructor(
        private val type: Type? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        fun type(): Type? = type

        fun unionMember1(): UnionMember1? = unionMember1

        fun isType(): Boolean = type != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asType(): Type = type.getOrThrow("type")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                type != null -> visitor.visitType(type)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
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
                    override fun visitType(type: Type) {
                        type.validate()
                    }

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Schedule && type == other.type && unionMember1 == other.unionMember1 /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(type, unionMember1) /* spotless:on */

        override fun toString(): String =
            when {
                type != null -> "Schedule{type=$type}"
                unionMember1 != null -> "Schedule{unionMember1=$unionMember1}"
                _json != null -> "Schedule{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Schedule")
            }

        companion object {

            fun ofType(type: Type) = Schedule(type = type)

            fun ofUnionMember1(unionMember1: UnionMember1) = Schedule(unionMember1 = unionMember1)
        }

        /**
         * An interface that defines how to map each variant of [Schedule] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitType(type: Type): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

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

                tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                    ?.let {
                        return Schedule(type = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<UnionMember1>()) { it.validate() }
                    ?.let {
                        return Schedule(unionMember1 = it, _json = json)
                    }

                return Schedule(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Schedule>(Schedule::class) {

            override fun serialize(
                value: Schedule,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.type != null -> generator.writeObject(value.type)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Schedule")
                }
            }
        }

        @NoAutoDetect
        class Type
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<InnerType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): InnerType = type.getRequired("type")

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<InnerType> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [Type]. */
            class Builder internal constructor() {

                private var type: JsonField<InnerType>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(type: Type) = apply {
                    this.type = type.type
                    additionalProperties = type.additionalProperties.toMutableMap()
                }

                fun type(type: InnerType) = type(JsonField.of(type))

                fun type(type: JsonField<InnerType>) = apply { this.type = type }

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

                fun build(): Type =
                    Type(checkRequired("type", type), additionalProperties.toImmutable())
            }

            class InnerType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    fun of(value: String) = InnerType(JsonField.of(value))
                }

                /** An enum containing [InnerType]'s known values. */
                enum class Known {
                    FIXED,
                }

                /**
                 * An enum containing [InnerType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [InnerType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FIXED,
                    /**
                     * An enum member indicating that [InnerType] was instantiated with an unknown
                     * value.
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
                        else -> throw TerminalInvalidDataException("Unknown InnerType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InnerType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Type{type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UnionMember1
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

            fun interval(): Long = interval.getRequired("interval")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("interval") @ExcludeMissing fun _interval(): JsonField<Long> = interval

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                interval()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var interval: JsonField<Long>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember1: UnionMember1) = apply {
                    interval = unionMember1.interval
                    type = unionMember1.type
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun interval(interval: Long) = interval(JsonField.of(interval))

                fun interval(interval: JsonField<Long>) = apply { this.interval = interval }

                fun type(type: Type) = type(JsonField.of(type))

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

                fun build(): UnionMember1 =
                    UnionMember1(
                        checkRequired("interval", interval),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                    WEEKLY,
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

                fun asString(): String = _value().asStringOrThrow()

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

                return /* spotless:off */ other is UnionMember1 && interval == other.interval && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(interval, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{interval=$interval, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Subscription && id == other.id && addressId == other.addressId && cardId == other.cardId && frequency == other.frequency && productVariantId == other.productVariantId && quantity == other.quantity && next == other.next && schedule == other.schedule && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, addressId, cardId, frequency, productVariantId, quantity, next, schedule, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscription{id=$id, addressId=$addressId, cardId=$cardId, frequency=$frequency, productVariantId=$productVariantId, quantity=$quantity, next=$next, schedule=$schedule, additionalProperties=$additionalProperties}"
}
