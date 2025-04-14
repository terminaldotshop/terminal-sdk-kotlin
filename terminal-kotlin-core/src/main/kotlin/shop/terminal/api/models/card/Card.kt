// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.checkRequired
import shop.terminal.api.errors.TerminalInvalidDataException

/** Credit card used for payments in the Terminal shop. */
class Card
private constructor(
    private val id: JsonField<String>,
    private val brand: JsonField<String>,
    private val created: JsonField<String>,
    private val expiration: JsonField<Expiration>,
    private val last4: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("brand") @ExcludeMissing brand: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created") @ExcludeMissing created: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiration")
        @ExcludeMissing
        expiration: JsonField<Expiration> = JsonMissing.of(),
        @JsonProperty("last4") @ExcludeMissing last4: JsonField<String> = JsonMissing.of(),
    ) : this(id, brand, created, expiration, last4, mutableMapOf())

    /**
     * Unique object identifier. The format and length of IDs may change over time.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Brand of the card.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brand(): String = brand.getRequired("brand")

    /**
     * Date the card was created.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): String = created.getRequired("created")

    /**
     * Expiration of the card.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiration(): Expiration = expiration.getRequired("expiration")

    /**
     * Last four digits of the card.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun last4(): String = last4.getRequired("last4")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [brand].
     *
     * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<String> = brand

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<String> = created

    /**
     * Returns the raw JSON value of [expiration].
     *
     * Unlike [expiration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiration")
    @ExcludeMissing
    fun _expiration(): JsonField<Expiration> = expiration

    /**
     * Returns the raw JSON value of [last4].
     *
     * Unlike [last4], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last4") @ExcludeMissing fun _last4(): JsonField<String> = last4

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
         * Returns a mutable builder for constructing an instance of [Card].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .brand()
         * .created()
         * .expiration()
         * .last4()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Card]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var brand: JsonField<String>? = null
        private var created: JsonField<String>? = null
        private var expiration: JsonField<Expiration>? = null
        private var last4: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(card: Card) = apply {
            id = card.id
            brand = card.brand
            created = card.created
            expiration = card.expiration
            last4 = card.last4
            additionalProperties = card.additionalProperties.toMutableMap()
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

        /** Brand of the card. */
        fun brand(brand: String) = brand(JsonField.of(brand))

        /**
         * Sets [Builder.brand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brand] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brand(brand: JsonField<String>) = apply { this.brand = brand }

        /** Date the card was created. */
        fun created(created: String) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<String>) = apply { this.created = created }

        /** Expiration of the card. */
        fun expiration(expiration: Expiration) = expiration(JsonField.of(expiration))

        /**
         * Sets [Builder.expiration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiration] with a well-typed [Expiration] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiration(expiration: JsonField<Expiration>) = apply { this.expiration = expiration }

        /** Last four digits of the card. */
        fun last4(last4: String) = last4(JsonField.of(last4))

        /**
         * Sets [Builder.last4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.last4] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun last4(last4: JsonField<String>) = apply { this.last4 = last4 }

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
         * Returns an immutable instance of [Card].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .brand()
         * .created()
         * .expiration()
         * .last4()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Card =
            Card(
                checkRequired("id", id),
                checkRequired("brand", brand),
                checkRequired("created", created),
                checkRequired("expiration", expiration),
                checkRequired("last4", last4),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Card = apply {
        if (validated) {
            return@apply
        }

        id()
        brand()
        created()
        expiration().validate()
        last4()
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
            (if (brand.asKnown() == null) 0 else 1) +
            (if (created.asKnown() == null) 0 else 1) +
            (expiration.asKnown()?.validity() ?: 0) +
            (if (last4.asKnown() == null) 0 else 1)

    /** Expiration of the card. */
    class Expiration
    private constructor(
        private val month: JsonField<Long>,
        private val year: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("month") @ExcludeMissing month: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("year") @ExcludeMissing year: JsonField<Long> = JsonMissing.of(),
        ) : this(month, year, mutableMapOf())

        /**
         * Expiration month of the card.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun month(): Long = month.getRequired("month")

        /**
         * Expiration year of the card.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun year(): Long = year.getRequired("year")

        /**
         * Returns the raw JSON value of [month].
         *
         * Unlike [month], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<Long> = month

        /**
         * Returns the raw JSON value of [year].
         *
         * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Long> = year

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
             * Returns a mutable builder for constructing an instance of [Expiration].
             *
             * The following fields are required:
             * ```kotlin
             * .month()
             * .year()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Expiration]. */
        class Builder internal constructor() {

            private var month: JsonField<Long>? = null
            private var year: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expiration: Expiration) = apply {
                month = expiration.month
                year = expiration.year
                additionalProperties = expiration.additionalProperties.toMutableMap()
            }

            /** Expiration month of the card. */
            fun month(month: Long) = month(JsonField.of(month))

            /**
             * Sets [Builder.month] to an arbitrary JSON value.
             *
             * You should usually call [Builder.month] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun month(month: JsonField<Long>) = apply { this.month = month }

            /** Expiration year of the card. */
            fun year(year: Long) = year(JsonField.of(year))

            /**
             * Sets [Builder.year] to an arbitrary JSON value.
             *
             * You should usually call [Builder.year] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun year(year: JsonField<Long>) = apply { this.year = year }

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
             * Returns an immutable instance of [Expiration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .month()
             * .year()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Expiration =
                Expiration(
                    checkRequired("month", month),
                    checkRequired("year", year),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Expiration = apply {
            if (validated) {
                return@apply
            }

            month()
            year()
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
            (if (month.asKnown() == null) 0 else 1) + (if (year.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Expiration && month == other.month && year == other.year && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(month, year, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Expiration{month=$month, year=$year, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Card && id == other.id && brand == other.brand && created == other.created && expiration == other.expiration && last4 == other.last4 && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, brand, created, expiration, last4, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Card{id=$id, brand=$brand, created=$created, expiration=$expiration, last4=$last4, additionalProperties=$additionalProperties}"
}
