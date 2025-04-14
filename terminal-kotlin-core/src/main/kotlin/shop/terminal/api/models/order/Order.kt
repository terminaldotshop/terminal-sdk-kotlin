// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.order

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
import shop.terminal.api.core.checkKnown
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.toImmutable
import shop.terminal.api.errors.TerminalInvalidDataException

/** An order from the Terminal shop. */
class Order
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Amount>,
    private val created: JsonField<String>,
    private val items: JsonField<List<Item>>,
    private val shipping: JsonField<Shipping>,
    private val tracking: JsonField<Tracking>,
    private val index: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Amount> = JsonMissing.of(),
        @JsonProperty("created") @ExcludeMissing created: JsonField<String> = JsonMissing.of(),
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
        @JsonProperty("shipping") @ExcludeMissing shipping: JsonField<Shipping> = JsonMissing.of(),
        @JsonProperty("tracking") @ExcludeMissing tracking: JsonField<Tracking> = JsonMissing.of(),
        @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
    ) : this(id, amount, created, items, shipping, tracking, index, mutableMapOf())

    /**
     * Unique object identifier. The format and length of IDs may change over time.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The subtotal and shipping amounts of the order.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Amount = amount.getRequired("amount")

    /**
     * Date the order was created.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): String = created.getRequired("created")

    /**
     * Items in the order.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * Shipping address of the order.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shipping(): Shipping = shipping.getRequired("shipping")

    /**
     * Tracking information of the order.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tracking(): Tracking = tracking.getRequired("tracking")

    /**
     * Zero-based index of the order for this user only.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun index(): Long? = index.getNullable("index")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Amount> = amount

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<String> = created

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

    /**
     * Returns the raw JSON value of [shipping].
     *
     * Unlike [shipping], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipping") @ExcludeMissing fun _shipping(): JsonField<Shipping> = shipping

    /**
     * Returns the raw JSON value of [tracking].
     *
     * Unlike [tracking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracking") @ExcludeMissing fun _tracking(): JsonField<Tracking> = tracking

    /**
     * Returns the raw JSON value of [index].
     *
     * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

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
         * Returns a mutable builder for constructing an instance of [Order].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .created()
         * .items()
         * .shipping()
         * .tracking()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Order]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Amount>? = null
        private var created: JsonField<String>? = null
        private var items: JsonField<MutableList<Item>>? = null
        private var shipping: JsonField<Shipping>? = null
        private var tracking: JsonField<Tracking>? = null
        private var index: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(order: Order) = apply {
            id = order.id
            amount = order.amount
            created = order.created
            items = order.items.map { it.toMutableList() }
            shipping = order.shipping
            tracking = order.tracking
            index = order.index
            additionalProperties = order.additionalProperties.toMutableMap()
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

        /** The subtotal and shipping amounts of the order. */
        fun amount(amount: Amount) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Amount] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Amount>) = apply { this.amount = amount }

        /** Date the order was created. */
        fun created(created: String) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<String>) = apply { this.created = created }

        /** Items in the order. */
        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /** Shipping address of the order. */
        fun shipping(shipping: Shipping) = shipping(JsonField.of(shipping))

        /**
         * Sets [Builder.shipping] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipping] with a well-typed [Shipping] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shipping(shipping: JsonField<Shipping>) = apply { this.shipping = shipping }

        /** Tracking information of the order. */
        fun tracking(tracking: Tracking) = tracking(JsonField.of(tracking))

        /**
         * Sets [Builder.tracking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracking] with a well-typed [Tracking] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tracking(tracking: JsonField<Tracking>) = apply { this.tracking = tracking }

        /** Zero-based index of the order for this user only. */
        fun index(index: Long) = index(JsonField.of(index))

        /**
         * Sets [Builder.index] to an arbitrary JSON value.
         *
         * You should usually call [Builder.index] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun index(index: JsonField<Long>) = apply { this.index = index }

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
         * Returns an immutable instance of [Order].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .created()
         * .items()
         * .shipping()
         * .tracking()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Order =
            Order(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("created", created),
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("shipping", shipping),
                checkRequired("tracking", tracking),
                index,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Order = apply {
        if (validated) {
            return@apply
        }

        id()
        amount().validate()
        created()
        items().forEach { it.validate() }
        shipping().validate()
        tracking().validate()
        index()
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
            (amount.asKnown()?.validity() ?: 0) +
            (if (created.asKnown() == null) 0 else 1) +
            (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (shipping.asKnown()?.validity() ?: 0) +
            (tracking.asKnown()?.validity() ?: 0) +
            (if (index.asKnown() == null) 0 else 1)

    /** The subtotal and shipping amounts of the order. */
    class Amount
    private constructor(
        private val shipping: JsonField<Long>,
        private val subtotal: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("shipping") @ExcludeMissing shipping: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<Long> = JsonMissing.of(),
        ) : this(shipping, subtotal, mutableMapOf())

        /**
         * Shipping amount of the order, in cents (USD).
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun shipping(): Long = shipping.getRequired("shipping")

        /**
         * Subtotal amount of the order, in cents (USD).
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subtotal(): Long = subtotal.getRequired("subtotal")

        /**
         * Returns the raw JSON value of [shipping].
         *
         * Unlike [shipping], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shipping") @ExcludeMissing fun _shipping(): JsonField<Long> = shipping

        /**
         * Returns the raw JSON value of [subtotal].
         *
         * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Long> = subtotal

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
             * Returns a mutable builder for constructing an instance of [Amount].
             *
             * The following fields are required:
             * ```kotlin
             * .shipping()
             * .subtotal()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Amount]. */
        class Builder internal constructor() {

            private var shipping: JsonField<Long>? = null
            private var subtotal: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(amount: Amount) = apply {
                shipping = amount.shipping
                subtotal = amount.subtotal
                additionalProperties = amount.additionalProperties.toMutableMap()
            }

            /** Shipping amount of the order, in cents (USD). */
            fun shipping(shipping: Long) = shipping(JsonField.of(shipping))

            /**
             * Sets [Builder.shipping] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shipping] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shipping(shipping: JsonField<Long>) = apply { this.shipping = shipping }

            /** Subtotal amount of the order, in cents (USD). */
            fun subtotal(subtotal: Long) = subtotal(JsonField.of(subtotal))

            /**
             * Sets [Builder.subtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtotal] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtotal(subtotal: JsonField<Long>) = apply { this.subtotal = subtotal }

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
             * Returns an immutable instance of [Amount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .shipping()
             * .subtotal()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Amount =
                Amount(
                    checkRequired("shipping", shipping),
                    checkRequired("subtotal", subtotal),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Amount = apply {
            if (validated) {
                return@apply
            }

            shipping()
            subtotal()
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
            (if (shipping.asKnown() == null) 0 else 1) + (if (subtotal.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Amount && shipping == other.shipping && subtotal == other.subtotal && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(shipping, subtotal, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Amount{shipping=$shipping, subtotal=$subtotal, additionalProperties=$additionalProperties}"
    }

    class Item
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Long>,
        private val quantity: JsonField<Long>,
        private val description: JsonField<String>,
        private val productVariantId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("productVariantID")
            @ExcludeMissing
            productVariantId: JsonField<String> = JsonMissing.of(),
        ) : this(id, amount, quantity, description, productVariantId, mutableMapOf())

        /**
         * Unique object identifier. The format and length of IDs may change over time.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Amount of the item in the order, in cents (USD).
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Quantity of the item in the order.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Long = quantity.getRequired("quantity")

        /**
         * Description of the item in the order.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * ID of the product variant of the item in the order.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productVariantId(): String? = productVariantId.getNullable("productVariantID")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [productVariantId].
         *
         * Unlike [productVariantId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("productVariantID")
        @ExcludeMissing
        fun _productVariantId(): JsonField<String> = productVariantId

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
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .quantity()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var quantity: JsonField<Long>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var productVariantId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(item: Item) = apply {
                id = item.id
                amount = item.amount
                quantity = item.quantity
                description = item.description
                productVariantId = item.productVariantId
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** Unique object identifier. The format and length of IDs may change over time. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Amount of the item in the order, in cents (USD). */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Quantity of the item in the order. */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            /** Description of the item in the order. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** ID of the product variant of the item in the order. */
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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .quantity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("quantity", quantity),
                    description,
                    productVariantId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            quantity()
            description()
            productVariantId()
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
            (if (id.asKnown() == null) 0 else 1) +
                (if (amount.asKnown() == null) 0 else 1) +
                (if (quantity.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (productVariantId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Item && id == other.id && amount == other.amount && quantity == other.quantity && description == other.description && productVariantId == other.productVariantId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, quantity, description, productVariantId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, amount=$amount, quantity=$quantity, description=$description, productVariantId=$productVariantId, additionalProperties=$additionalProperties}"
    }

    /** Shipping address of the order. */
    class Shipping
    private constructor(
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val name: JsonField<String>,
        private val street1: JsonField<String>,
        private val zip: JsonField<String>,
        private val phone: JsonField<String>,
        private val province: JsonField<String>,
        private val street2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street1") @ExcludeMissing street1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("province")
            @ExcludeMissing
            province: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street2") @ExcludeMissing street2: JsonField<String> = JsonMissing.of(),
        ) : this(city, country, name, street1, zip, phone, province, street2, mutableMapOf())

        /**
         * City of the address.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * ISO 3166-1 alpha-2 country code of the address.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * The recipient's name.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Street of the address.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun street1(): String = street1.getRequired("street1")

        /**
         * Zip code of the address.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun zip(): String = zip.getRequired("zip")

        /**
         * Phone number of the recipient.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun phone(): String? = phone.getNullable("phone")

        /**
         * Province or state of the address.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun province(): String? = province.getNullable("province")

        /**
         * Apartment, suite, etc. of the address.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun street2(): String? = street2.getNullable("street2")

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [street1].
         *
         * Unlike [street1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("street1") @ExcludeMissing fun _street1(): JsonField<String> = street1

        /**
         * Returns the raw JSON value of [zip].
         *
         * Unlike [zip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

        /**
         * Returns the raw JSON value of [phone].
         *
         * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

        /**
         * Returns the raw JSON value of [province].
         *
         * Unlike [province], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("province") @ExcludeMissing fun _province(): JsonField<String> = province

        /**
         * Returns the raw JSON value of [street2].
         *
         * Unlike [street2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("street2") @ExcludeMissing fun _street2(): JsonField<String> = street2

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
             * Returns a mutable builder for constructing an instance of [Shipping].
             *
             * The following fields are required:
             * ```kotlin
             * .city()
             * .country()
             * .name()
             * .street1()
             * .zip()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Shipping]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var street1: JsonField<String>? = null
            private var zip: JsonField<String>? = null
            private var phone: JsonField<String> = JsonMissing.of()
            private var province: JsonField<String> = JsonMissing.of()
            private var street2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(shipping: Shipping) = apply {
                city = shipping.city
                country = shipping.country
                name = shipping.name
                street1 = shipping.street1
                zip = shipping.zip
                phone = shipping.phone
                province = shipping.province
                street2 = shipping.street2
                additionalProperties = shipping.additionalProperties.toMutableMap()
            }

            /** City of the address. */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** ISO 3166-1 alpha-2 country code of the address. */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** The recipient's name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Street of the address. */
            fun street1(street1: String) = street1(JsonField.of(street1))

            /**
             * Sets [Builder.street1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.street1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun street1(street1: JsonField<String>) = apply { this.street1 = street1 }

            /** Zip code of the address. */
            fun zip(zip: String) = zip(JsonField.of(zip))

            /**
             * Sets [Builder.zip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zip] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun zip(zip: JsonField<String>) = apply { this.zip = zip }

            /** Phone number of the recipient. */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /**
             * Sets [Builder.phone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            /** Province or state of the address. */
            fun province(province: String) = province(JsonField.of(province))

            /**
             * Sets [Builder.province] to an arbitrary JSON value.
             *
             * You should usually call [Builder.province] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun province(province: JsonField<String>) = apply { this.province = province }

            /** Apartment, suite, etc. of the address. */
            fun street2(street2: String) = street2(JsonField.of(street2))

            /**
             * Sets [Builder.street2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.street2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun street2(street2: JsonField<String>) = apply { this.street2 = street2 }

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
             * Returns an immutable instance of [Shipping].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .city()
             * .country()
             * .name()
             * .street1()
             * .zip()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Shipping =
                Shipping(
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("name", name),
                    checkRequired("street1", street1),
                    checkRequired("zip", zip),
                    phone,
                    province,
                    street2,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Shipping = apply {
            if (validated) {
                return@apply
            }

            city()
            country()
            name()
            street1()
            zip()
            phone()
            province()
            street2()
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
            (if (city.asKnown() == null) 0 else 1) +
                (if (country.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (street1.asKnown() == null) 0 else 1) +
                (if (zip.asKnown() == null) 0 else 1) +
                (if (phone.asKnown() == null) 0 else 1) +
                (if (province.asKnown() == null) 0 else 1) +
                (if (street2.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Shipping && city == other.city && country == other.country && name == other.name && street1 == other.street1 && zip == other.zip && phone == other.phone && province == other.province && street2 == other.street2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(city, country, name, street1, zip, phone, province, street2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Shipping{city=$city, country=$country, name=$name, street1=$street1, zip=$zip, phone=$phone, province=$province, street2=$street2, additionalProperties=$additionalProperties}"
    }

    /** Tracking information of the order. */
    class Tracking
    private constructor(
        private val number: JsonField<String>,
        private val service: JsonField<String>,
        private val status: JsonField<String>,
        private val statusDetails: JsonField<String>,
        private val statusUpdatedAt: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("number") @ExcludeMissing number: JsonField<String> = JsonMissing.of(),
            @JsonProperty("service") @ExcludeMissing service: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("statusDetails")
            @ExcludeMissing
            statusDetails: JsonField<String> = JsonMissing.of(),
            @JsonProperty("statusUpdatedAt")
            @ExcludeMissing
            statusUpdatedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(number, service, status, statusDetails, statusUpdatedAt, url, mutableMapOf())

        /**
         * Tracking number of the order.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun number(): String? = number.getNullable("number")

        /**
         * Shipping service of the order.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun service(): String? = service.getNullable("service")

        /**
         * Current tracking status of the shipment.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): String? = status.getNullable("status")

        /**
         * Additional details about the tracking status.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun statusDetails(): String? = statusDetails.getNullable("statusDetails")

        /**
         * When the tracking status was last updated.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun statusUpdatedAt(): String? = statusUpdatedAt.getNullable("statusUpdatedAt")

        /**
         * Tracking URL of the order.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun url(): String? = url.getNullable("url")

        /**
         * Returns the raw JSON value of [number].
         *
         * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

        /**
         * Returns the raw JSON value of [service].
         *
         * Unlike [service], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<String> = service

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [statusDetails].
         *
         * Unlike [statusDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("statusDetails")
        @ExcludeMissing
        fun _statusDetails(): JsonField<String> = statusDetails

        /**
         * Returns the raw JSON value of [statusUpdatedAt].
         *
         * Unlike [statusUpdatedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("statusUpdatedAt")
        @ExcludeMissing
        fun _statusUpdatedAt(): JsonField<String> = statusUpdatedAt

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Tracking]. */
            fun builder() = Builder()
        }

        /** A builder for [Tracking]. */
        class Builder internal constructor() {

            private var number: JsonField<String> = JsonMissing.of()
            private var service: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var statusDetails: JsonField<String> = JsonMissing.of()
            private var statusUpdatedAt: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tracking: Tracking) = apply {
                number = tracking.number
                service = tracking.service
                status = tracking.status
                statusDetails = tracking.statusDetails
                statusUpdatedAt = tracking.statusUpdatedAt
                url = tracking.url
                additionalProperties = tracking.additionalProperties.toMutableMap()
            }

            /** Tracking number of the order. */
            fun number(number: String) = number(JsonField.of(number))

            /**
             * Sets [Builder.number] to an arbitrary JSON value.
             *
             * You should usually call [Builder.number] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun number(number: JsonField<String>) = apply { this.number = number }

            /** Shipping service of the order. */
            fun service(service: String) = service(JsonField.of(service))

            /**
             * Sets [Builder.service] to an arbitrary JSON value.
             *
             * You should usually call [Builder.service] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun service(service: JsonField<String>) = apply { this.service = service }

            /** Current tracking status of the shipment. */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Additional details about the tracking status. */
            fun statusDetails(statusDetails: String) = statusDetails(JsonField.of(statusDetails))

            /**
             * Sets [Builder.statusDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusDetails] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusDetails(statusDetails: JsonField<String>) = apply {
                this.statusDetails = statusDetails
            }

            /** When the tracking status was last updated. */
            fun statusUpdatedAt(statusUpdatedAt: String) =
                statusUpdatedAt(JsonField.of(statusUpdatedAt))

            /**
             * Sets [Builder.statusUpdatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusUpdatedAt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusUpdatedAt(statusUpdatedAt: JsonField<String>) = apply {
                this.statusUpdatedAt = statusUpdatedAt
            }

            /** Tracking URL of the order. */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Tracking].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tracking =
                Tracking(
                    number,
                    service,
                    status,
                    statusDetails,
                    statusUpdatedAt,
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Tracking = apply {
            if (validated) {
                return@apply
            }

            number()
            service()
            status()
            statusDetails()
            statusUpdatedAt()
            url()
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
            (if (number.asKnown() == null) 0 else 1) +
                (if (service.asKnown() == null) 0 else 1) +
                (if (status.asKnown() == null) 0 else 1) +
                (if (statusDetails.asKnown() == null) 0 else 1) +
                (if (statusUpdatedAt.asKnown() == null) 0 else 1) +
                (if (url.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tracking && number == other.number && service == other.service && status == other.status && statusDetails == other.statusDetails && statusUpdatedAt == other.statusUpdatedAt && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(number, service, status, statusDetails, statusUpdatedAt, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tracking{number=$number, service=$service, status=$status, statusDetails=$statusDetails, statusUpdatedAt=$statusUpdatedAt, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Order && id == other.id && amount == other.amount && created == other.created && items == other.items && shipping == other.shipping && tracking == other.tracking && index == other.index && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, created, items, shipping, tracking, index, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Order{id=$id, amount=$amount, created=$created, items=$items, shipping=$shipping, tracking=$tracking, index=$index, additionalProperties=$additionalProperties}"
}
