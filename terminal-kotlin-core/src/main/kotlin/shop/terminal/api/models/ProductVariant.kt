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

/** Variant of a product in the Terminal shop. */
@JsonDeserialize(builder = ProductVariant.Builder::class)
@NoAutoDetect
class ProductVariant
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val price: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** Name of the product variant. */
    fun name(): String = name.getRequired("name")

    /** Price of the product variant in cents (USD). */
    fun price(): Long = price.getRequired("price")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Name of the product variant. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Price of the product variant in cents (USD). */
    @JsonProperty("price") @ExcludeMissing fun _price() = price

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProductVariant = apply {
        if (!validated) {
            id()
            name()
            price()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var price: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(productVariant: ProductVariant) = apply {
            this.id = productVariant.id
            this.name = productVariant.name
            this.price = productVariant.price
            additionalProperties(productVariant.additionalProperties)
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the product variant. */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the product variant. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Price of the product variant in cents (USD). */
        fun price(price: Long) = price(JsonField.of(price))

        /** Price of the product variant in cents (USD). */
        @JsonProperty("price")
        @ExcludeMissing
        fun price(price: JsonField<Long>) = apply { this.price = price }

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

        fun build(): ProductVariant =
            ProductVariant(
                id,
                name,
                price,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductVariant && id == other.id && name == other.name && price == other.price && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, price, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductVariant{id=$id, name=$name, price=$price, additionalProperties=$additionalProperties}"
}
