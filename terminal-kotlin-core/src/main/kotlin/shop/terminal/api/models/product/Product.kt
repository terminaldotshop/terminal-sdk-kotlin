// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.product

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
import shop.terminal.api.core.checkKnown
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

        /**
         * Returns a mutable builder for constructing an instance of [Product].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .description()
         * .name()
         * .variants()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Product]. */
    class Builder internal constructor() {

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
                (variants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("variants", it).add(variant)
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
    class Subscription @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val ALLOWED = of("allowed")

            val REQUIRED = of("required")

            fun of(value: String) = Subscription(JsonField.of(value))
        }

        /** An enum containing [Subscription]'s known values. */
        enum class Known {
            ALLOWED,
            REQUIRED,
        }

        /**
         * An enum containing [Subscription]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Subscription] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALLOWED,
            REQUIRED,
            /**
             * An enum member indicating that [Subscription] was instantiated with an unknown value.
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
                ALLOWED -> Value.ALLOWED
                REQUIRED -> Value.REQUIRED
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
                ALLOWED -> Known.ALLOWED
                REQUIRED -> Known.REQUIRED
                else -> throw TerminalInvalidDataException("Unknown Subscription: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TerminalInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw TerminalInvalidDataException("Value is not a String")

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
        @JsonProperty("app") @ExcludeMissing private val app: JsonField<String> = JsonMissing.of(),
        @JsonProperty("color")
        @ExcludeMissing
        private val color: JsonField<String> = JsonMissing.of(),
        @JsonProperty("featured")
        @ExcludeMissing
        private val featured: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("market_eu")
        @ExcludeMissing
        private val marketEu: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("market_na")
        @ExcludeMissing
        private val marketNa: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun app(): String? = app.getNullable("app")

        fun color(): String? = color.getNullable("color")

        fun featured(): Boolean? = featured.getNullable("featured")

        fun marketEu(): Boolean? = marketEu.getNullable("market_eu")

        fun marketNa(): Boolean? = marketNa.getNullable("market_na")

        @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<String> = app

        @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

        @JsonProperty("featured") @ExcludeMissing fun _featured(): JsonField<Boolean> = featured

        @JsonProperty("market_eu") @ExcludeMissing fun _marketEu(): JsonField<Boolean> = marketEu

        @JsonProperty("market_na") @ExcludeMissing fun _marketNa(): JsonField<Boolean> = marketNa

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Tags = apply {
            if (validated) {
                return@apply
            }

            app()
            color()
            featured()
            marketEu()
            marketNa()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Tags]. */
            fun builder() = Builder()
        }

        /** A builder for [Tags]. */
        class Builder internal constructor() {

            private var app: JsonField<String> = JsonMissing.of()
            private var color: JsonField<String> = JsonMissing.of()
            private var featured: JsonField<Boolean> = JsonMissing.of()
            private var marketEu: JsonField<Boolean> = JsonMissing.of()
            private var marketNa: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tags: Tags) = apply {
                app = tags.app
                color = tags.color
                featured = tags.featured
                marketEu = tags.marketEu
                marketNa = tags.marketNa
                additionalProperties = tags.additionalProperties.toMutableMap()
            }

            fun app(app: String) = app(JsonField.of(app))

            fun app(app: JsonField<String>) = apply { this.app = app }

            fun color(color: String) = color(JsonField.of(color))

            fun color(color: JsonField<String>) = apply { this.color = color }

            fun featured(featured: Boolean) = featured(JsonField.of(featured))

            fun featured(featured: JsonField<Boolean>) = apply { this.featured = featured }

            fun marketEu(marketEu: Boolean) = marketEu(JsonField.of(marketEu))

            fun marketEu(marketEu: JsonField<Boolean>) = apply { this.marketEu = marketEu }

            fun marketNa(marketNa: Boolean) = marketNa(JsonField.of(marketNa))

            fun marketNa(marketNa: JsonField<Boolean>) = apply { this.marketNa = marketNa }

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

            fun build(): Tags =
                Tags(app, color, featured, marketEu, marketNa, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tags && app == other.app && color == other.color && featured == other.featured && marketEu == other.marketEu && marketNa == other.marketNa && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(app, color, featured, marketEu, marketNa, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tags{app=$app, color=$color, featured=$featured, marketEu=$marketEu, marketNa=$marketNa, additionalProperties=$additionalProperties}"
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
