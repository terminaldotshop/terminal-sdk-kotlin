// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.product

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import shop.terminal.api.core.Enum
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.checkKnown
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.toImmutable
import shop.terminal.api.errors.TerminalInvalidDataException

/** Product sold in the Terminal shop. */
class Product
private constructor(
    private val id: JsonField<String>,
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val variants: JsonField<List<ProductVariant>>,
    private val order: JsonField<Long>,
    private val subscription: JsonField<Subscription>,
    private val tags: JsonField<Tags>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("variants")
        @ExcludeMissing
        variants: JsonField<List<ProductVariant>> = JsonMissing.of(),
        @JsonProperty("order") @ExcludeMissing order: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("subscription")
        @ExcludeMissing
        subscription: JsonField<Subscription> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<Tags> = JsonMissing.of(),
    ) : this(id, description, name, variants, order, subscription, tags, mutableMapOf())

    /**
     * Unique object identifier. The format and length of IDs may change over time.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Description of the product.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * Name of the product.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * List of variants of the product.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun variants(): List<ProductVariant> = variants.getRequired("variants")

    /**
     * Order of the product used when displaying a sorted list of products.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun order(): Long? = order.getNullable("order")

    /**
     * Whether the product must be or can be subscribed to.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscription(): Subscription? = subscription.getNullable("subscription")

    /**
     * Tags for the product.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Tags? = tags.getNullable("tags")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [variants].
     *
     * Unlike [variants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variants")
    @ExcludeMissing
    fun _variants(): JsonField<List<ProductVariant>> = variants

    /**
     * Returns the raw JSON value of [order].
     *
     * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Long> = order

    /**
     * Returns the raw JSON value of [subscription].
     *
     * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<Subscription> = subscription

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<Tags> = tags

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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Description of the product. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Name of the product. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** List of variants of the product. */
        fun variants(variants: List<ProductVariant>) = variants(JsonField.of(variants))

        /**
         * Sets [Builder.variants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variants] with a well-typed `List<ProductVariant>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun variants(variants: JsonField<List<ProductVariant>>) = apply {
            this.variants = variants.map { it.toMutableList() }
        }

        /**
         * Adds a single [ProductVariant] to [variants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVariant(variant: ProductVariant) = apply {
            variants =
                (variants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("variants", it).add(variant)
                }
        }

        /** Order of the product used when displaying a sorted list of products. */
        fun order(order: Long) = order(JsonField.of(order))

        /**
         * Sets [Builder.order] to an arbitrary JSON value.
         *
         * You should usually call [Builder.order] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun order(order: JsonField<Long>) = apply { this.order = order }

        /** Whether the product must be or can be subscribed to. */
        fun subscription(subscription: Subscription) = subscription(JsonField.of(subscription))

        /**
         * Sets [Builder.subscription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscription] with a well-typed [Subscription] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscription(subscription: JsonField<Subscription>) = apply {
            this.subscription = subscription
        }

        /** Tags for the product. */
        fun tags(tags: Tags) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed [Tags] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [Product].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .description()
         * .name()
         * .variants()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Product =
            Product(
                checkRequired("id", id),
                checkRequired("description", description),
                checkRequired("name", name),
                checkRequired("variants", variants).map { it.toImmutable() },
                order,
                subscription,
                tags,
                additionalProperties.toMutableMap(),
            )
    }

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
        subscription()?.validate()
        tags()?.validate()
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
            (if (description.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (variants.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (order.asKnown() == null) 0 else 1) +
            (subscription.asKnown()?.validity() ?: 0) +
            (tags.asKnown()?.validity() ?: 0)

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

        private var validated: Boolean = false

        fun validate(): Subscription = apply {
            if (validated) {
                return@apply
            }

            known()
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
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
    class Tags
    private constructor(
        private val app: JsonField<String>,
        private val color: JsonField<String>,
        private val featured: JsonField<Boolean>,
        private val marketEu: JsonField<Boolean>,
        private val marketGlobal: JsonField<Boolean>,
        private val marketNa: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("app") @ExcludeMissing app: JsonField<String> = JsonMissing.of(),
            @JsonProperty("color") @ExcludeMissing color: JsonField<String> = JsonMissing.of(),
            @JsonProperty("featured")
            @ExcludeMissing
            featured: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("market_eu")
            @ExcludeMissing
            marketEu: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("market_global")
            @ExcludeMissing
            marketGlobal: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("market_na")
            @ExcludeMissing
            marketNa: JsonField<Boolean> = JsonMissing.of(),
        ) : this(app, color, featured, marketEu, marketGlobal, marketNa, mutableMapOf())

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun app(): String? = app.getNullable("app")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun color(): String? = color.getNullable("color")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun featured(): Boolean? = featured.getNullable("featured")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun marketEu(): Boolean? = marketEu.getNullable("market_eu")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun marketGlobal(): Boolean? = marketGlobal.getNullable("market_global")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun marketNa(): Boolean? = marketNa.getNullable("market_na")

        /**
         * Returns the raw JSON value of [app].
         *
         * Unlike [app], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<String> = app

        /**
         * Returns the raw JSON value of [color].
         *
         * Unlike [color], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

        /**
         * Returns the raw JSON value of [featured].
         *
         * Unlike [featured], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featured") @ExcludeMissing fun _featured(): JsonField<Boolean> = featured

        /**
         * Returns the raw JSON value of [marketEu].
         *
         * Unlike [marketEu], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("market_eu") @ExcludeMissing fun _marketEu(): JsonField<Boolean> = marketEu

        /**
         * Returns the raw JSON value of [marketGlobal].
         *
         * Unlike [marketGlobal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("market_global")
        @ExcludeMissing
        fun _marketGlobal(): JsonField<Boolean> = marketGlobal

        /**
         * Returns the raw JSON value of [marketNa].
         *
         * Unlike [marketNa], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("market_na") @ExcludeMissing fun _marketNa(): JsonField<Boolean> = marketNa

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

            /** Returns a mutable builder for constructing an instance of [Tags]. */
            fun builder() = Builder()
        }

        /** A builder for [Tags]. */
        class Builder internal constructor() {

            private var app: JsonField<String> = JsonMissing.of()
            private var color: JsonField<String> = JsonMissing.of()
            private var featured: JsonField<Boolean> = JsonMissing.of()
            private var marketEu: JsonField<Boolean> = JsonMissing.of()
            private var marketGlobal: JsonField<Boolean> = JsonMissing.of()
            private var marketNa: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tags: Tags) = apply {
                app = tags.app
                color = tags.color
                featured = tags.featured
                marketEu = tags.marketEu
                marketGlobal = tags.marketGlobal
                marketNa = tags.marketNa
                additionalProperties = tags.additionalProperties.toMutableMap()
            }

            fun app(app: String) = app(JsonField.of(app))

            /**
             * Sets [Builder.app] to an arbitrary JSON value.
             *
             * You should usually call [Builder.app] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun app(app: JsonField<String>) = apply { this.app = app }

            fun color(color: String) = color(JsonField.of(color))

            /**
             * Sets [Builder.color] to an arbitrary JSON value.
             *
             * You should usually call [Builder.color] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun color(color: JsonField<String>) = apply { this.color = color }

            fun featured(featured: Boolean) = featured(JsonField.of(featured))

            /**
             * Sets [Builder.featured] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featured] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featured(featured: JsonField<Boolean>) = apply { this.featured = featured }

            fun marketEu(marketEu: Boolean) = marketEu(JsonField.of(marketEu))

            /**
             * Sets [Builder.marketEu] to an arbitrary JSON value.
             *
             * You should usually call [Builder.marketEu] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun marketEu(marketEu: JsonField<Boolean>) = apply { this.marketEu = marketEu }

            fun marketGlobal(marketGlobal: Boolean) = marketGlobal(JsonField.of(marketGlobal))

            /**
             * Sets [Builder.marketGlobal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.marketGlobal] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun marketGlobal(marketGlobal: JsonField<Boolean>) = apply {
                this.marketGlobal = marketGlobal
            }

            fun marketNa(marketNa: Boolean) = marketNa(JsonField.of(marketNa))

            /**
             * Sets [Builder.marketNa] to an arbitrary JSON value.
             *
             * You should usually call [Builder.marketNa] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Tags].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tags =
                Tags(
                    app,
                    color,
                    featured,
                    marketEu,
                    marketGlobal,
                    marketNa,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Tags = apply {
            if (validated) {
                return@apply
            }

            app()
            color()
            featured()
            marketEu()
            marketGlobal()
            marketNa()
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
            (if (app.asKnown() == null) 0 else 1) +
                (if (color.asKnown() == null) 0 else 1) +
                (if (featured.asKnown() == null) 0 else 1) +
                (if (marketEu.asKnown() == null) 0 else 1) +
                (if (marketGlobal.asKnown() == null) 0 else 1) +
                (if (marketNa.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tags && app == other.app && color == other.color && featured == other.featured && marketEu == other.marketEu && marketGlobal == other.marketGlobal && marketNa == other.marketNa && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(app, color, featured, marketEu, marketGlobal, marketNa, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tags{app=$app, color=$color, featured=$featured, marketEu=$marketEu, marketGlobal=$marketGlobal, marketNa=$marketNa, additionalProperties=$additionalProperties}"
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
