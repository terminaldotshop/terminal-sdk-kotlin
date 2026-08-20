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
import java.util.Collections
import java.util.Objects
import shop.terminal.api.core.BaseDeserializer
import shop.terminal.api.core.BaseSerializer
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.allMaxBy
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.getOrThrow
import shop.terminal.api.errors.TerminalInvalidDataException

/** Subscription to a Terminal shop product. */
class Subscription
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val addressId: JsonField<String>,
    private val cardId: JsonField<String>,
    private val created: JsonField<String>,
    private val price: JsonField<Long>,
    private val productVariantId: JsonField<String>,
    private val quantity: JsonField<Long>,
    private val next: JsonField<String>,
    private val schedule: JsonField<Schedule>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("addressID") @ExcludeMissing addressId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardID") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created") @ExcludeMissing created: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("productVariantID")
        @ExcludeMissing
        productVariantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
        @JsonProperty("schedule") @ExcludeMissing schedule: JsonField<Schedule> = JsonMissing.of(),
    ) : this(
        id,
        addressId,
        cardId,
        created,
        price,
        productVariantId,
        quantity,
        next,
        schedule,
        mutableMapOf(),
    )

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
     * Date the subscription was created.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): String = created.getRequired("created")

    /**
     * Price of the subscription in cents (USD).
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun price(): Long = price.getRequired("price")

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
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<String> = created

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Long> = price

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

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

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
         * .created()
         * .price()
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
        private var created: JsonField<String>? = null
        private var price: JsonField<Long>? = null
        private var productVariantId: JsonField<String>? = null
        private var quantity: JsonField<Long>? = null
        private var next: JsonField<String> = JsonMissing.of()
        private var schedule: JsonField<Schedule> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscription: Subscription) = apply {
            id = subscription.id
            addressId = subscription.addressId
            cardId = subscription.cardId
            created = subscription.created
            price = subscription.price
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

        /** Date the subscription was created. */
        fun created(created: String) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<String>) = apply { this.created = created }

        /** Price of the subscription in cents (USD). */
        fun price(price: Long) = price(JsonField.of(price))

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Long>) = apply { this.price = price }

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

        /** Alias for calling [schedule] with `Schedule.ofFixed()`. */
        fun scheduleFixed() = schedule(Schedule.ofFixed())

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
         * .created()
         * .price()
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
                checkRequired("created", created),
                checkRequired("price", price),
                checkRequired("productVariantId", productVariantId),
                checkRequired("quantity", quantity),
                next,
                schedule,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TerminalInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Subscription = apply {
        if (validated) {
            return@apply
        }

        id()
        addressId()
        cardId()
        created()
        price()
        productVariantId()
        quantity()
        next()
        schedule()?.validate()
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
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (addressId.asKnown() == null) 0 else 1) +
            (if (cardId.asKnown() == null) 0 else 1) +
            (if (created.asKnown() == null) 0 else 1) +
            (if (price.asKnown() == null) 0 else 1) +
            (if (productVariantId.asKnown() == null) 0 else 1) +
            (if (quantity.asKnown() == null) 0 else 1) +
            (if (next.asKnown() == null) 0 else 1) +
            (schedule.asKnown()?.validity() ?: 0)

    /** Schedule of the subscription. */
    @JsonDeserialize(using = Schedule.Deserializer::class)
    @JsonSerialize(using = Schedule.Serializer::class)
    class Schedule
    private constructor(
        private val fixed: JsonValue? = null,
        private val weekly: Weekly? = null,
        private val _json: JsonValue? = null,
    ) {

        fun fixed(): JsonValue? = fixed

        fun weekly(): Weekly? = weekly

        fun isFixed(): Boolean = fixed != null

        fun isWeekly(): Boolean = weekly != null

        fun asFixed(): JsonValue = fixed.getOrThrow("fixed")

        fun asWeekly(): Weekly = weekly.getOrThrow("weekly")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import shop.terminal.api.core.JsonValue
         *
         * val result: String? = schedule.accept(object : Schedule.Visitor<String?> {
         *     override fun visitFixed(fixed: JsonValue): String? = fixed.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws TerminalInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                fixed != null -> visitor.visitFixed(fixed)
                weekly != null -> visitor.visitWeekly(weekly)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TerminalInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Schedule = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitFixed(fixed: JsonValue) {
                        fixed.let {
                            if (it != JsonValue.from(mapOf("type" to "fixed"))) {
                                throw TerminalInvalidDataException(
                                    "'fixed' is invalid, received $it"
                                )
                            }
                        }
                    }

                    override fun visitWeekly(weekly: Weekly) {
                        weekly.validate()
                    }
                }
            )
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitFixed(fixed: JsonValue) =
                        fixed.let { if (it == JsonValue.from(mapOf("type" to "fixed"))) 1 else 0 }

                    override fun visitWeekly(weekly: Weekly) = weekly.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Schedule && fixed == other.fixed && weekly == other.weekly
        }

        override fun hashCode(): Int = Objects.hash(fixed, weekly)

        override fun toString(): String =
            when {
                fixed != null -> "Schedule{fixed=$fixed}"
                weekly != null -> "Schedule{weekly=$weekly}"
                _json != null -> "Schedule{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Schedule")
            }

        companion object {

            fun ofFixed() = Schedule(fixed = JsonValue.from(mapOf("type" to "fixed")))

            fun ofWeekly(weekly: Weekly) = Schedule(weekly = weekly)
        }

        /**
         * An interface that defines how to map each variant of [Schedule] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitFixed(fixed: JsonValue): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                ?.let { Schedule(fixed = it, _json = json) }
                                ?.takeIf { it.isValid() },
                            tryDeserialize(node, jacksonTypeRef<Weekly>())?.let {
                                Schedule(weekly = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Schedule(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
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

        class Weekly
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val interval: JsonField<Long>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("interval")
                @ExcludeMissing
                interval: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(interval, type, mutableMapOf())

            /**
             * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun interval(): Long = interval.getRequired("interval")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("weekly")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [interval].
             *
             * Unlike [interval], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("interval") @ExcludeMissing fun _interval(): JsonField<Long> = interval

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Weekly].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .interval()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Weekly]. */
            class Builder internal constructor() {

                private var interval: JsonField<Long>? = null
                private var type: JsonValue = JsonValue.from("weekly")
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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("weekly")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Weekly =
                    Weekly(
                        checkRequired("interval", interval),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TerminalInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Weekly = apply {
                if (validated) {
                    return@apply
                }

                interval()
                _type().let {
                    if (it != JsonValue.from("weekly")) {
                        throw TerminalInvalidDataException("'type' is invalid, received $it")
                    }
                }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (interval.asKnown() == null) 0 else 1) +
                    type.let { if (it == JsonValue.from("weekly")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Weekly &&
                    interval == other.interval &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(interval, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Weekly{interval=$interval, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Subscription &&
            id == other.id &&
            addressId == other.addressId &&
            cardId == other.cardId &&
            created == other.created &&
            price == other.price &&
            productVariantId == other.productVariantId &&
            quantity == other.quantity &&
            next == other.next &&
            schedule == other.schedule &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            addressId,
            cardId,
            created,
            price,
            productVariantId,
            quantity,
            next,
            schedule,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscription{id=$id, addressId=$addressId, cardId=$cardId, created=$created, price=$price, productVariantId=$productVariantId, quantity=$quantity, next=$next, schedule=$schedule, additionalProperties=$additionalProperties}"
}
