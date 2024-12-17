// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.NoAutoDetect
import shop.terminal.api.core.toImmutable

/** Credit card used for payments in the Terminal shop. */
@JsonDeserialize(builder = Card.Builder::class)
@NoAutoDetect
class Card
private constructor(
    private val id: JsonField<String>,
    private val brand: JsonField<String>,
    private val expiration: JsonField<Expiration>,
    private val last4: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** Brand of the card. */
    fun brand(): String = brand.getRequired("brand")

    /** Expiration of the card. */
    fun expiration(): Expiration = expiration.getRequired("expiration")

    /** Last four digits of the card. */
    fun last4(): String = last4.getRequired("last4")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Brand of the card. */
    @JsonProperty("brand") @ExcludeMissing fun _brand() = brand

    /** Expiration of the card. */
    @JsonProperty("expiration") @ExcludeMissing fun _expiration() = expiration

    /** Last four digits of the card. */
    @JsonProperty("last4") @ExcludeMissing fun _last4() = last4

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Card = apply {
        if (!validated) {
            id()
            brand()
            expiration().validate()
            last4()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var brand: JsonField<String> = JsonMissing.of()
        private var expiration: JsonField<Expiration> = JsonMissing.of()
        private var last4: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(card: Card) = apply {
            this.id = card.id
            this.brand = card.brand
            this.expiration = card.expiration
            this.last4 = card.last4
            additionalProperties(card.additionalProperties)
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Brand of the card. */
        fun brand(brand: String) = brand(JsonField.of(brand))

        /** Brand of the card. */
        @JsonProperty("brand")
        @ExcludeMissing
        fun brand(brand: JsonField<String>) = apply { this.brand = brand }

        /** Expiration of the card. */
        fun expiration(expiration: Expiration) = expiration(JsonField.of(expiration))

        /** Expiration of the card. */
        @JsonProperty("expiration")
        @ExcludeMissing
        fun expiration(expiration: JsonField<Expiration>) = apply { this.expiration = expiration }

        /** Last four digits of the card. */
        fun last4(last4: String) = last4(JsonField.of(last4))

        /** Last four digits of the card. */
        @JsonProperty("last4")
        @ExcludeMissing
        fun last4(last4: JsonField<String>) = apply { this.last4 = last4 }

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

        fun build(): Card =
            Card(
                id,
                brand,
                expiration,
                last4,
                additionalProperties.toImmutable(),
            )
    }

    /** Expiration of the card. */
    @JsonDeserialize(builder = Expiration.Builder::class)
    @NoAutoDetect
    class Expiration
    private constructor(
        private val year: JsonField<Long>,
        private val month: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Expiration year of the card. */
        fun year(): Long = year.getRequired("year")

        /** Expiration month of the card. */
        fun month(): Long = month.getRequired("month")

        /** Expiration year of the card. */
        @JsonProperty("year") @ExcludeMissing fun _year() = year

        /** Expiration month of the card. */
        @JsonProperty("month") @ExcludeMissing fun _month() = month

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Expiration = apply {
            if (!validated) {
                year()
                month()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var year: JsonField<Long> = JsonMissing.of()
            private var month: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expiration: Expiration) = apply {
                this.year = expiration.year
                this.month = expiration.month
                additionalProperties(expiration.additionalProperties)
            }

            /** Expiration year of the card. */
            fun year(year: Long) = year(JsonField.of(year))

            /** Expiration year of the card. */
            @JsonProperty("year")
            @ExcludeMissing
            fun year(year: JsonField<Long>) = apply { this.year = year }

            /** Expiration month of the card. */
            fun month(month: Long) = month(JsonField.of(month))

            /** Expiration month of the card. */
            @JsonProperty("month")
            @ExcludeMissing
            fun month(month: JsonField<Long>) = apply { this.month = month }

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

            fun build(): Expiration =
                Expiration(
                    year,
                    month,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Expiration && year == other.year && month == other.month && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(year, month, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Expiration{year=$year, month=$month, additionalProperties=$additionalProperties}"
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
