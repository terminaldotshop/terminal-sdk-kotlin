// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.NoAutoDetect
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable

/** Credit card used for payments in the Terminal shop. */
@NoAutoDetect
class Card
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("brand") @ExcludeMissing private val brand: JsonField<String> = JsonMissing.of(),
    @JsonProperty("expiration")
    @ExcludeMissing
    private val expiration: JsonField<Expiration> = JsonMissing.of(),
    @JsonProperty("last4") @ExcludeMissing private val last4: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** Brand of the card. */
    fun brand(): String = brand.getRequired("brand")

    /** Expiration of the card. */
    fun expiration(): Expiration = expiration.getRequired("expiration")

    /** Last four digits of the card. */
    fun last4(): String = last4.getRequired("last4")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Brand of the card. */
    @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<String> = brand

    /** Expiration of the card. */
    @JsonProperty("expiration")
    @ExcludeMissing
    fun _expiration(): JsonField<Expiration> = expiration

    /** Last four digits of the card. */
    @JsonProperty("last4") @ExcludeMissing fun _last4(): JsonField<String> = last4

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Card = apply {
        if (validated) {
            return@apply
        }

        id()
        brand()
        expiration().validate()
        last4()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [Card]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var brand: JsonField<String>? = null
        private var expiration: JsonField<Expiration>? = null
        private var last4: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(card: Card) = apply {
            id = card.id
            brand = card.brand
            expiration = card.expiration
            last4 = card.last4
            additionalProperties = card.additionalProperties.toMutableMap()
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Brand of the card. */
        fun brand(brand: String) = brand(JsonField.of(brand))

        /** Brand of the card. */
        fun brand(brand: JsonField<String>) = apply { this.brand = brand }

        /** Expiration of the card. */
        fun expiration(expiration: Expiration) = expiration(JsonField.of(expiration))

        /** Expiration of the card. */
        fun expiration(expiration: JsonField<Expiration>) = apply { this.expiration = expiration }

        /** Last four digits of the card. */
        fun last4(last4: String) = last4(JsonField.of(last4))

        /** Last four digits of the card. */
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

        fun build(): Card =
            Card(
                checkRequired("id", id),
                checkRequired("brand", brand),
                checkRequired("expiration", expiration),
                checkRequired("last4", last4),
                additionalProperties.toImmutable(),
            )
    }

    /** Expiration of the card. */
    @NoAutoDetect
    class Expiration
    @JsonCreator
    private constructor(
        @JsonProperty("month")
        @ExcludeMissing
        private val month: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("year") @ExcludeMissing private val year: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Expiration month of the card. */
        fun month(): Long = month.getRequired("month")

        /** Expiration year of the card. */
        fun year(): Long = year.getRequired("year")

        /** Expiration month of the card. */
        @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<Long> = month

        /** Expiration year of the card. */
        @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Long> = year

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Expiration = apply {
            if (validated) {
                return@apply
            }

            month()
            year()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** Expiration month of the card. */
            fun month(month: JsonField<Long>) = apply { this.month = month }

            /** Expiration year of the card. */
            fun year(year: Long) = year(JsonField.of(year))

            /** Expiration year of the card. */
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

            fun build(): Expiration =
                Expiration(
                    checkRequired("month", month),
                    checkRequired("year", year),
                    additionalProperties.toImmutable(),
                )
        }

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

        return /* spotless:off */ other is Card && id == other.id && brand == other.brand && expiration == other.expiration && last4 == other.last4 && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, brand, expiration, last4, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Card{id=$id, brand=$brand, expiration=$expiration, last4=$last4, additionalProperties=$additionalProperties}"
}
