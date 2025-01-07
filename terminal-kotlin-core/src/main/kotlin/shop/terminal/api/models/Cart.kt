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
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable

/** The current Terminal shop user's cart. */
@NoAutoDetect
class Cart
@JsonCreator
private constructor(
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<Amount> = JsonMissing.of(),
    @JsonProperty("items")
    @ExcludeMissing
    private val items: JsonField<List<Item>> = JsonMissing.of(),
    @JsonProperty("subtotal")
    @ExcludeMissing
    private val subtotal: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("addressID")
    @ExcludeMissing
    private val addressId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("cardID")
    @ExcludeMissing
    private val cardId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("shipping")
    @ExcludeMissing
    private val shipping: JsonField<Shipping> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The subtotal and shipping amounts for the current user's cart. */
    fun amount(): Amount = amount.getRequired("amount")

    /** An array of items in the current user's cart. */
    fun items(): List<Item> = items.getRequired("items")

    /** The subtotal of all items in the current user's cart, in cents (USD). */
    fun subtotal(): Long = subtotal.getRequired("subtotal")

    /** ID of the shipping address selected on the current user's cart. */
    fun addressId(): String? = addressId.getNullable("addressID")

    /** ID of the card selected on the current user's cart. */
    fun cardId(): String? = cardId.getNullable("cardID")

    /** Shipping information for the current user's cart. */
    fun shipping(): Shipping? = shipping.getNullable("shipping")

    /** The subtotal and shipping amounts for the current user's cart. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** An array of items in the current user's cart. */
    @JsonProperty("items") @ExcludeMissing fun _items() = items

    /** The subtotal of all items in the current user's cart, in cents (USD). */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

    /** ID of the shipping address selected on the current user's cart. */
    @JsonProperty("addressID") @ExcludeMissing fun _addressId() = addressId

    /** ID of the card selected on the current user's cart. */
    @JsonProperty("cardID") @ExcludeMissing fun _cardId() = cardId

    /** Shipping information for the current user's cart. */
    @JsonProperty("shipping") @ExcludeMissing fun _shipping() = shipping

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Cart = apply {
        if (!validated) {
            amount().validate()
            items().forEach { it.validate() }
            subtotal()
            addressId()
            cardId()
            shipping()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var amount: JsonField<Amount> = JsonMissing.of()
        private var items: JsonField<List<Item>> = JsonMissing.of()
        private var subtotal: JsonField<Long> = JsonMissing.of()
        private var addressId: JsonField<String> = JsonMissing.of()
        private var cardId: JsonField<String> = JsonMissing.of()
        private var shipping: JsonField<Shipping> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cart: Cart) = apply {
            amount = cart.amount
            items = cart.items
            subtotal = cart.subtotal
            addressId = cart.addressId
            cardId = cart.cardId
            shipping = cart.shipping
            additionalProperties = cart.additionalProperties.toMutableMap()
        }

        /** The subtotal and shipping amounts for the current user's cart. */
        fun amount(amount: Amount) = amount(JsonField.of(amount))

        /** The subtotal and shipping amounts for the current user's cart. */
        fun amount(amount: JsonField<Amount>) = apply { this.amount = amount }

        /** An array of items in the current user's cart. */
        fun items(items: List<Item>) = items(JsonField.of(items))

        /** An array of items in the current user's cart. */
        fun items(items: JsonField<List<Item>>) = apply { this.items = items }

        /** The subtotal of all items in the current user's cart, in cents (USD). */
        fun subtotal(subtotal: Long) = subtotal(JsonField.of(subtotal))

        /** The subtotal of all items in the current user's cart, in cents (USD). */
        fun subtotal(subtotal: JsonField<Long>) = apply { this.subtotal = subtotal }

        /** ID of the shipping address selected on the current user's cart. */
        fun addressId(addressId: String) = addressId(JsonField.of(addressId))

        /** ID of the shipping address selected on the current user's cart. */
        fun addressId(addressId: JsonField<String>) = apply { this.addressId = addressId }

        /** ID of the card selected on the current user's cart. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** ID of the card selected on the current user's cart. */
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** Shipping information for the current user's cart. */
        fun shipping(shipping: Shipping) = shipping(JsonField.of(shipping))

        /** Shipping information for the current user's cart. */
        fun shipping(shipping: JsonField<Shipping>) = apply { this.shipping = shipping }

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

        fun build(): Cart =
            Cart(
                amount,
                items.map { it.toImmutable() },
                subtotal,
                addressId,
                cardId,
                shipping,
                additionalProperties.toImmutable(),
            )
    }

    /** The subtotal and shipping amounts for the current user's cart. */
    @NoAutoDetect
    class Amount
    @JsonCreator
    private constructor(
        @JsonProperty("subtotal")
        @ExcludeMissing
        private val subtotal: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("shipping")
        @ExcludeMissing
        private val shipping: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Subtotal of the current user's cart, in cents (USD). */
        fun subtotal(): Long = subtotal.getRequired("subtotal")

        /** Shipping amount of the current user's cart, in cents (USD). */
        fun shipping(): Long? = shipping.getNullable("shipping")

        /** Subtotal of the current user's cart, in cents (USD). */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

        /** Shipping amount of the current user's cart, in cents (USD). */
        @JsonProperty("shipping") @ExcludeMissing fun _shipping() = shipping

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Amount = apply {
            if (!validated) {
                subtotal()
                shipping()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var subtotal: JsonField<Long> = JsonMissing.of()
            private var shipping: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(amount: Amount) = apply {
                subtotal = amount.subtotal
                shipping = amount.shipping
                additionalProperties = amount.additionalProperties.toMutableMap()
            }

            /** Subtotal of the current user's cart, in cents (USD). */
            fun subtotal(subtotal: Long) = subtotal(JsonField.of(subtotal))

            /** Subtotal of the current user's cart, in cents (USD). */
            fun subtotal(subtotal: JsonField<Long>) = apply { this.subtotal = subtotal }

            /** Shipping amount of the current user's cart, in cents (USD). */
            fun shipping(shipping: Long) = shipping(JsonField.of(shipping))

            /** Shipping amount of the current user's cart, in cents (USD). */
            fun shipping(shipping: JsonField<Long>) = apply { this.shipping = shipping }

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

            fun build(): Amount =
                Amount(
                    subtotal,
                    shipping,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Amount && subtotal == other.subtotal && shipping == other.shipping && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(subtotal, shipping, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Amount{subtotal=$subtotal, shipping=$shipping, additionalProperties=$additionalProperties}"
    }

    /** An item in the current Terminal shop user's cart. */
    @NoAutoDetect
    class Item
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productVariantID")
        @ExcludeMissing
        private val productVariantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("subtotal")
        @ExcludeMissing
        private val subtotal: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(): String = id.getRequired("id")

        /** ID of the product variant for this item in the current user's cart. */
        fun productVariantId(): String = productVariantId.getRequired("productVariantID")

        /** Quantity of the item in the current user's cart. */
        fun quantity(): Long = quantity.getRequired("quantity")

        /** Subtotal of the item in the current user's cart, in cents (USD). */
        fun subtotal(): Long = subtotal.getRequired("subtotal")

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** ID of the product variant for this item in the current user's cart. */
        @JsonProperty("productVariantID") @ExcludeMissing fun _productVariantId() = productVariantId

        /** Quantity of the item in the current user's cart. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        /** Subtotal of the item in the current user's cart, in cents (USD). */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Item = apply {
            if (!validated) {
                id()
                productVariantId()
                quantity()
                subtotal()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var productVariantId: JsonField<String> = JsonMissing.of()
            private var quantity: JsonField<Long> = JsonMissing.of()
            private var subtotal: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(item: Item) = apply {
                id = item.id
                productVariantId = item.productVariantId
                quantity = item.quantity
                subtotal = item.subtotal
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** Unique object identifier. The format and length of IDs may change over time. */
            fun id(id: String) = id(JsonField.of(id))

            /** Unique object identifier. The format and length of IDs may change over time. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** ID of the product variant for this item in the current user's cart. */
            fun productVariantId(productVariantId: String) =
                productVariantId(JsonField.of(productVariantId))

            /** ID of the product variant for this item in the current user's cart. */
            fun productVariantId(productVariantId: JsonField<String>) = apply {
                this.productVariantId = productVariantId
            }

            /** Quantity of the item in the current user's cart. */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /** Quantity of the item in the current user's cart. */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            /** Subtotal of the item in the current user's cart, in cents (USD). */
            fun subtotal(subtotal: Long) = subtotal(JsonField.of(subtotal))

            /** Subtotal of the item in the current user's cart, in cents (USD). */
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

            fun build(): Item =
                Item(
                    id,
                    productVariantId,
                    quantity,
                    subtotal,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Item && id == other.id && productVariantId == other.productVariantId && quantity == other.quantity && subtotal == other.subtotal && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, productVariantId, quantity, subtotal, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, productVariantId=$productVariantId, quantity=$quantity, subtotal=$subtotal, additionalProperties=$additionalProperties}"
    }

    /** Shipping information for the current user's cart. */
    @NoAutoDetect
    class Shipping
    @JsonCreator
    private constructor(
        @JsonProperty("service")
        @ExcludeMissing
        private val service: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeframe")
        @ExcludeMissing
        private val timeframe: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Shipping service name. */
        fun service(): String? = service.getNullable("service")

        /** Shipping timeframe provided by the shipping carrier. */
        fun timeframe(): String? = timeframe.getNullable("timeframe")

        /** Shipping service name. */
        @JsonProperty("service") @ExcludeMissing fun _service() = service

        /** Shipping timeframe provided by the shipping carrier. */
        @JsonProperty("timeframe") @ExcludeMissing fun _timeframe() = timeframe

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Shipping = apply {
            if (!validated) {
                service()
                timeframe()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var service: JsonField<String> = JsonMissing.of()
            private var timeframe: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(shipping: Shipping) = apply {
                service = shipping.service
                timeframe = shipping.timeframe
                additionalProperties = shipping.additionalProperties.toMutableMap()
            }

            /** Shipping service name. */
            fun service(service: String) = service(JsonField.of(service))

            /** Shipping service name. */
            fun service(service: JsonField<String>) = apply { this.service = service }

            /** Shipping timeframe provided by the shipping carrier. */
            fun timeframe(timeframe: String) = timeframe(JsonField.of(timeframe))

            /** Shipping timeframe provided by the shipping carrier. */
            fun timeframe(timeframe: JsonField<String>) = apply { this.timeframe = timeframe }

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

            fun build(): Shipping =
                Shipping(
                    service,
                    timeframe,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Shipping && service == other.service && timeframe == other.timeframe && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(service, timeframe, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Shipping{service=$service, timeframe=$timeframe, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Cart && amount == other.amount && items == other.items && subtotal == other.subtotal && addressId == other.addressId && cardId == other.cardId && shipping == other.shipping && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, items, subtotal, addressId, cardId, shipping, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Cart{amount=$amount, items=$items, subtotal=$subtotal, addressId=$addressId, cardId=$cardId, shipping=$shipping, additionalProperties=$additionalProperties}"
}
