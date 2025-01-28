// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import shop.terminal.api.core.Enum
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.NoAutoDetect
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable
import shop.terminal.api.errors.TerminalInvalidDataException

/** Product sold in the Terminal shop. */
@NoAutoDetect
class Product
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("variants")
    @ExcludeMissing
    private val variants: JsonField<List<ProductVariant>> = JsonMissing.of(),
    @JsonProperty("order") @ExcludeMissing private val order: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("subscription")
    @ExcludeMissing
    private val subscription: JsonField<Subscription> = JsonMissing.of(),
    @JsonProperty("tags") @ExcludeMissing private val tags: JsonField<Tags> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** Description of the product. */
    fun description(): String = description.getRequired("description")

    /** Name of the product. */
    fun name(): String = name.getRequired("name")

    /** List of variants of the product. */
    fun variants(): List<ProductVariant> = variants.getRequired("variants")

    /** Order of the product used when displaying a sorted list of products. */
    fun order(): Long? = order.getNullable("order")

    /** Whether the product must be or can be subscribed to. */
    fun subscription(): Subscription? = subscription.getNullable("subscription")

    /** Tags for the product. */
    fun tags(): Tags? = tags.getNullable("tags")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Description of the product. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** Name of the product. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** List of variants of the product. */
    @JsonProperty("variants")
    @ExcludeMissing
    fun _variants(): JsonField<List<ProductVariant>> = variants

    /** Order of the product used when displaying a sorted list of products. */
    @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Long> = order

    /** Whether the product must be or can be subscribed to. */
    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<Subscription> = subscription

    /** Tags for the product. */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<Tags> = tags

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Product = apply {
        if (validated) {
            return@apply
        }

        id()
        description()
        name()
        variants().forEach { it.validate() }
        order()
        subscription()
        tags()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var variants: JsonField<MutableList<ProductVariant>>? = null
        private var order: JsonField<Long> = JsonMissing.of()
        private var subscription: JsonField<Subscription> = JsonMissing.of()
        private var tags: JsonField<Tags> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(product: Product) = apply {
            id = product.id
            description = product.description
            name = product.name
            variants = product.variants.map { it.toMutableList() }
            order = product.order
            subscription = product.subscription
            tags = product.tags
            additionalProperties = product.additionalProperties.toMutableMap()
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Description of the product. */
        fun description(description: String) = description(JsonField.of(description))

        /** Description of the product. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Name of the product. */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the product. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** List of variants of the product. */
        fun variants(variants: List<ProductVariant>) = variants(JsonField.of(variants))

        /** List of variants of the product. */
        fun variants(variants: JsonField<List<ProductVariant>>) = apply {
            this.variants = variants.map { it.toMutableList() }
        }

        /** List of variants of the product. */
        fun addVariant(variant: ProductVariant) = apply {
            variants =
                (variants ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(variant)
                }
        }

        /** Order of the product used when displaying a sorted list of products. */
        fun order(order: Long) = order(JsonField.of(order))

        /** Order of the product used when displaying a sorted list of products. */
        fun order(order: JsonField<Long>) = apply { this.order = order }

        /** Whether the product must be or can be subscribed to. */
        fun subscription(subscription: Subscription) = subscription(JsonField.of(subscription))

        /** Whether the product must be or can be subscribed to. */
        fun subscription(subscription: JsonField<Subscription>) = apply {
            this.subscription = subscription
        }

        /** Tags for the product. */
        fun tags(tags: Tags) = tags(JsonField.of(tags))

        /** Tags for the product. */
        fun tags(tags: JsonField<Tags>) = apply { this.tags = tags }

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

        fun build(): Product =
            Product(
                checkRequired("id", id),
                checkRequired("description", description),
                checkRequired("name", name),
                checkRequired("variants", variants).map { it.toImmutable() },
                order,
                subscription,
                tags,
                additionalProperties.toImmutable(),
            )
    }

    /** Whether the product must be or can be subscribed to. */
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
    @NoAutoDetect
    class Tags
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Tags = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tags: Tags) = apply {
                additionalProperties = tags.additionalProperties.toMutableMap()
            }

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

        return /* spotless:off */ other is Product && id == other.id && description == other.description && name == other.name && variants == other.variants && order == other.order && subscription == other.subscription && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, description, name, variants, order, subscription, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Product{id=$id, description=$description, name=$name, variants=$variants, order=$order, subscription=$subscription, tags=$tags, additionalProperties=$additionalProperties}"
}
