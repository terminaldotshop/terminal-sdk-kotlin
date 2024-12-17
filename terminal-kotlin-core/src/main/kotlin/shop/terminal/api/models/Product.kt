// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import shop.terminal.api.core.Enum
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.NoAutoDetect
import shop.terminal.api.core.toImmutable
import shop.terminal.api.errors.TerminalInvalidDataException

/** Product sold in the Terminal shop. */
@JsonDeserialize(builder = Product.Builder::class)
@NoAutoDetect
class Product
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val variants: JsonField<List<ProductVariant>>,
    private val order: JsonField<Long>,
    private val subscription: JsonField<Subscription>,
    private val tags: JsonField<Tags>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** Name of the product. */
    fun name(): String = name.getRequired("name")

    /** Description of the product. */
    fun description(): String = description.getRequired("description")

    /** List of variants of the product. */
    fun variants(): List<ProductVariant> = variants.getRequired("variants")

    /** Order of the product used when displaying a sorted list of products. */
    fun order(): Long? = order.getNullable("order")

    /** Whether the product must be or can be subscribed to. */
    fun subscription(): Subscription? = subscription.getNullable("subscription")

    /** Tags for the product. */
    fun tags(): Tags? = tags.getNullable("tags")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Name of the product. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Description of the product. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** List of variants of the product. */
    @JsonProperty("variants") @ExcludeMissing fun _variants() = variants

    /** Order of the product used when displaying a sorted list of products. */
    @JsonProperty("order") @ExcludeMissing fun _order() = order

    /** Whether the product must be or can be subscribed to. */
    @JsonProperty("subscription") @ExcludeMissing fun _subscription() = subscription

    /** Tags for the product. */
    @JsonProperty("tags") @ExcludeMissing fun _tags() = tags

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Product = apply {
        if (!validated) {
            id()
            name()
            description()
            variants().forEach { it.validate() }
            order()
            subscription()
            tags()?.validate()
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
        private var description: JsonField<String> = JsonMissing.of()
        private var variants: JsonField<List<ProductVariant>> = JsonMissing.of()
        private var order: JsonField<Long> = JsonMissing.of()
        private var subscription: JsonField<Subscription> = JsonMissing.of()
        private var tags: JsonField<Tags> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(product: Product) = apply {
            this.id = product.id
            this.name = product.name
            this.description = product.description
            this.variants = product.variants
            this.order = product.order
            this.subscription = product.subscription
            this.tags = product.tags
            additionalProperties(product.additionalProperties)
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the product. */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the product. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Description of the product. */
        fun description(description: String) = description(JsonField.of(description))

        /** Description of the product. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** List of variants of the product. */
        fun variants(variants: List<ProductVariant>) = variants(JsonField.of(variants))

        /** List of variants of the product. */
        @JsonProperty("variants")
        @ExcludeMissing
        fun variants(variants: JsonField<List<ProductVariant>>) = apply { this.variants = variants }

        /** Order of the product used when displaying a sorted list of products. */
        fun order(order: Long) = order(JsonField.of(order))

        /** Order of the product used when displaying a sorted list of products. */
        @JsonProperty("order")
        @ExcludeMissing
        fun order(order: JsonField<Long>) = apply { this.order = order }

        /** Whether the product must be or can be subscribed to. */
        fun subscription(subscription: Subscription) = subscription(JsonField.of(subscription))

        /** Whether the product must be or can be subscribed to. */
        @JsonProperty("subscription")
        @ExcludeMissing
        fun subscription(subscription: JsonField<Subscription>) = apply {
            this.subscription = subscription
        }

        /** Tags for the product. */
        fun tags(tags: Tags) = tags(JsonField.of(tags))

        /** Tags for the product. */
        @JsonProperty("tags")
        @ExcludeMissing
        fun tags(tags: JsonField<Tags>) = apply { this.tags = tags }

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

        fun build(): Product =
            Product(
                id,
                name,
                description,
                variants.map { it.toImmutable() },
                order,
                subscription,
                tags,
                additionalProperties.toImmutable(),
            )
    }

    class Subscription
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ALLOWED = of("allowed")

            val REQUIRED = of("required")

            fun of(value: String) = Subscription(JsonField.of(value))
        }

        enum class Known {
            ALLOWED,
            REQUIRED,
        }

        enum class Value {
            ALLOWED,
            REQUIRED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ALLOWED -> Value.ALLOWED
                REQUIRED -> Value.REQUIRED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ALLOWED -> Known.ALLOWED
                REQUIRED -> Known.REQUIRED
                else -> throw TerminalInvalidDataException("Unknown Subscription: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Subscription && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Tags for the product. */
    @JsonDeserialize(builder = Tags.Builder::class)
    @NoAutoDetect
    class Tags
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Tags = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tags: Tags) = apply {
                additionalProperties(tags.additionalProperties)
            }

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

            fun build(): Tags = Tags(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tags && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Tags{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Product && id == other.id && name == other.name && description == other.description && variants == other.variants && order == other.order && subscription == other.subscription && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, description, variants, order, subscription, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Product{id=$id, name=$name, description=$description, variants=$variants, order=$order, subscription=$subscription, tags=$tags, additionalProperties=$additionalProperties}"
}
