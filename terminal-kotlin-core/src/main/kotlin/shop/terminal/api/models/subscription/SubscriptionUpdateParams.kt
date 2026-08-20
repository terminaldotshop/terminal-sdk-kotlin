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
import shop.terminal.api.core.Params
import shop.terminal.api.core.allMaxBy
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.getOrThrow
import shop.terminal.api.core.http.Headers
import shop.terminal.api.core.http.QueryParams
import shop.terminal.api.errors.TerminalInvalidDataException

/** Update card, address, or interval for an existing subscription. */
class SubscriptionUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** ID of the subscription to update. */
    fun id(): String? = id

    /**
     * New shipping address ID for the subscription.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addressId(): String? = body.addressId()

    /**
     * New payment method ID for the subscription.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardId(): String? = body.cardId()

    /**
     * New schedule for the subscription.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun schedule(): Schedule? = body.schedule()

    /**
     * Returns the raw JSON value of [addressId].
     *
     * Unlike [addressId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addressId(): JsonField<String> = body._addressId()

    /**
     * Returns the raw JSON value of [cardId].
     *
     * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cardId(): JsonField<String> = body._cardId()

    /**
     * Returns the raw JSON value of [schedule].
     *
     * Unlike [schedule], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _schedule(): JsonField<Schedule> = body._schedule()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SubscriptionUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SubscriptionUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionUpdateParams: SubscriptionUpdateParams) = apply {
            id = subscriptionUpdateParams.id
            body = subscriptionUpdateParams.body.toBuilder()
            additionalHeaders = subscriptionUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionUpdateParams.additionalQueryParams.toBuilder()
        }

        /** ID of the subscription to update. */
        fun id(id: String?) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [addressId]
         * - [cardId]
         * - [schedule]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** New shipping address ID for the subscription. */
        fun addressId(addressId: String) = apply { body.addressId(addressId) }

        /**
         * Sets [Builder.addressId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addressId(addressId: JsonField<String>) = apply { body.addressId(addressId) }

        /** New payment method ID for the subscription. */
        fun cardId(cardId: String) = apply { body.cardId(cardId) }

        /**
         * Sets [Builder.cardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cardId(cardId: JsonField<String>) = apply { body.cardId(cardId) }

        /** New schedule for the subscription. */
        fun schedule(schedule: Schedule) = apply { body.schedule(schedule) }

        /**
         * Sets [Builder.schedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schedule] with a well-typed [Schedule] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun schedule(schedule: JsonField<Schedule>) = apply { body.schedule(schedule) }

        /** Alias for calling [schedule] with `Schedule.ofFixed()`. */
        fun scheduleFixed() = apply { body.scheduleFixed() }

        /** Alias for calling [schedule] with `Schedule.ofWeekly(weekly)`. */
        fun schedule(weekly: Schedule.Weekly) = apply { body.schedule(weekly) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SubscriptionUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionUpdateParams =
            SubscriptionUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addressId: JsonField<String>,
        private val cardId: JsonField<String>,
        private val schedule: JsonField<Schedule>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("addressID")
            @ExcludeMissing
            addressId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cardID") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("schedule")
            @ExcludeMissing
            schedule: JsonField<Schedule> = JsonMissing.of(),
        ) : this(addressId, cardId, schedule, mutableMapOf())

        /**
         * New shipping address ID for the subscription.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun addressId(): String? = addressId.getNullable("addressID")

        /**
         * New payment method ID for the subscription.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardId(): String? = cardId.getNullable("cardID")

        /**
         * New schedule for the subscription.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun schedule(): Schedule? = schedule.getNullable("schedule")

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var addressId: JsonField<String> = JsonMissing.of()
            private var cardId: JsonField<String> = JsonMissing.of()
            private var schedule: JsonField<Schedule> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                addressId = body.addressId
                cardId = body.cardId
                schedule = body.schedule
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** New shipping address ID for the subscription. */
            fun addressId(addressId: String) = addressId(JsonField.of(addressId))

            /**
             * Sets [Builder.addressId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addressId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addressId(addressId: JsonField<String>) = apply { this.addressId = addressId }

            /** New payment method ID for the subscription. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /**
             * Sets [Builder.cardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** New schedule for the subscription. */
            fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

            /**
             * Sets [Builder.schedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.schedule] with a well-typed [Schedule] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(addressId, cardId, schedule, additionalProperties.toMutableMap())
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            addressId()
            cardId()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (addressId.asKnown() == null) 0 else 1) +
                (if (cardId.asKnown() == null) 0 else 1) +
                (schedule.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                addressId == other.addressId &&
                cardId == other.cardId &&
                schedule == other.schedule &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(addressId, cardId, schedule, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{addressId=$addressId, cardId=$cardId, schedule=$schedule, additionalProperties=$additionalProperties}"
    }

    /** New schedule for the subscription. */
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

        return other is SubscriptionUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
