// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import shop.terminal.core.ExcludeMissing
import shop.terminal.core.JsonField
import shop.terminal.core.JsonMissing
import shop.terminal.core.JsonValue
import shop.terminal.core.NoAutoDetect
import shop.terminal.core.toImmutable

/** The current Terminal shop user's cart. */
@JsonDeserialize(builder = Cart.Builder::class)
@NoAutoDetect
class Cart
private constructor(
    private val items: JsonField<List<Item>>,
    private val subtotal: JsonField<Long>,
    private val addressId: JsonField<String>,
    private val cardId: JsonField<String>,
    private val amount: JsonField<Amount>,
    private val shipping: JsonField<Shipping>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** An array of items in the current user's cart. */
    fun items(): List<Item> = items.getRequired("items")

    /** The subtotal of all items in the current user's cart, in cents (USD). */
    fun subtotal(): Long = subtotal.getRequired("subtotal")

    /** ID of the shipping address selected on the current user's cart. */
    fun addressId(): String? = addressId.getNullable("addressID")

    /** ID of the card selected on the current user's cart. */
    fun cardId(): String? = cardId.getNullable("cardID")

    /** The subtotal and shipping amounts for the current user's cart. */
    fun amount(): Amount = amount.getRequired("amount")

    /** Shipping information for the current user's cart. */
    fun shipping(): Shipping? = shipping.getNullable("shipping")

    /** An array of items in the current user's cart. */
    @JsonProperty("items") @ExcludeMissing fun _items() = items

    /** The subtotal of all items in the current user's cart, in cents (USD). */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

    /** ID of the shipping address selected on the current user's cart. */
    @JsonProperty("addressID") @ExcludeMissing fun _addressId() = addressId

    /** ID of the card selected on the current user's cart. */
    @JsonProperty("cardID") @ExcludeMissing fun _cardId() = cardId

    /** The subtotal and shipping amounts for the current user's cart. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** Shipping information for the current user's cart. */
    @JsonProperty("shipping") @ExcludeMissing fun _shipping() = shipping

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Cart = apply {
        if (!validated) {
            items().forEach { it.validate() }
            subtotal()
            addressId()
            cardId()
            amount().validate()
            shipping()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var items: JsonField<List<Item>> = JsonMissing.of()
        private var subtotal: JsonField<Long> = JsonMissing.of()
        private var addressId: JsonField<String> = JsonMissing.of()
        private var cardId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Amount> = JsonMissing.of()
        private var shipping: JsonField<Shipping> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cart: Cart) = apply {
            this.items = cart.items
            this.subtotal = cart.subtotal
            this.addressId = cart.addressId
            this.cardId = cart.cardId
            this.amount = cart.amount
            this.shipping = cart.shipping
            additionalProperties(cart.additionalProperties)
        }

        /** An array of items in the current user's cart. */
        fun items(items: List<Item>) = items(JsonField.of(items))

        /** An array of items in the current user's cart. */
        @JsonProperty("items")
        @ExcludeMissing
        fun items(items: JsonField<List<Item>>) = apply { this.items = items }

        /** The subtotal of all items in the current user's cart, in cents (USD). */
        fun subtotal(subtotal: Long) = subtotal(JsonField.of(subtotal))

        /** The subtotal of all items in the current user's cart, in cents (USD). */
        @JsonProperty("subtotal")
        @ExcludeMissing
        fun subtotal(subtotal: JsonField<Long>) = apply { this.subtotal = subtotal }

        /** ID of the shipping address selected on the current user's cart. */
        fun addressId(addressId: String) = addressId(JsonField.of(addressId))

        /** ID of the shipping address selected on the current user's cart. */
        @JsonProperty("addressID")
        @ExcludeMissing
        fun addressId(addressId: JsonField<String>) = apply { this.addressId = addressId }

        /** ID of the card selected on the current user's cart. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** ID of the card selected on the current user's cart. */
        @JsonProperty("cardID")
        @ExcludeMissing
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** The subtotal and shipping amounts for the current user's cart. */
        fun amount(amount: Amount) = amount(JsonField.of(amount))

        /** The subtotal and shipping amounts for the current user's cart. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Amount>) = apply { this.amount = amount }

        /** Shipping information for the current user's cart. */
        fun shipping(shipping: Shipping) = shipping(JsonField.of(shipping))

        /** Shipping information for the current user's cart. */
        @JsonProperty("shipping")
        @ExcludeMissing
        fun shipping(shipping: JsonField<Shipping>) = apply { this.shipping = shipping }

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

        fun build(): Cart =
            Cart(
                items.map { it.toImmutable() },
                subtotal,
                addressId,
                cardId,
                amount,
                shipping,
                additionalProperties.toImmutable(),
            )
    }

    /** The subtotal and shipping amounts for the current user's cart. */
    @JsonDeserialize(builder = Amount.Builder::class)
    @NoAutoDetect
    class Amount
    private constructor(
        private val subtotal: JsonField<Long>,
        private val shipping: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
                this.subtotal = amount.subtotal
                this.shipping = amount.shipping
                additionalProperties(amount.additionalProperties)
            }

            /** Subtotal of the current user's cart, in cents (USD). */
            fun subtotal(subtotal: Long) = subtotal(JsonField.of(subtotal))

            /** Subtotal of the current user's cart, in cents (USD). */
            @JsonProperty("subtotal")
            @ExcludeMissing
            fun subtotal(subtotal: JsonField<Long>) = apply { this.subtotal = subtotal }

            /** Shipping amount of the current user's cart, in cents (USD). */
            fun shipping(shipping: Long) = shipping(JsonField.of(shipping))

            /** Shipping amount of the current user's cart, in cents (USD). */
            @JsonProperty("shipping")
            @ExcludeMissing
            fun shipping(shipping: JsonField<Long>) = apply { this.shipping = shipping }

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
    @JsonDeserialize(builder = Item.Builder::class)
    @NoAutoDetect
    class Item
    private constructor(
        private val id: JsonField<String>,
        private val productVariantId: JsonField<String>,
        private val quantity: JsonField<Long>,
        private val subtotal: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
                this.id = item.id
                this.productVariantId = item.productVariantId
                this.quantity = item.quantity
                this.subtotal = item.subtotal
                additionalProperties(item.additionalProperties)
            }

            /** Unique object identifier. The format and length of IDs may change over time. */
            fun id(id: String) = id(JsonField.of(id))

            /** Unique object identifier. The format and length of IDs may change over time. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** ID of the product variant for this item in the current user's cart. */
            fun productVariantId(productVariantId: String) =
                productVariantId(JsonField.of(productVariantId))

            /** ID of the product variant for this item in the current user's cart. */
            @JsonProperty("productVariantID")
            @ExcludeMissing
            fun productVariantId(productVariantId: JsonField<String>) = apply {
                this.productVariantId = productVariantId
            }

            /** Quantity of the item in the current user's cart. */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /** Quantity of the item in the current user's cart. */
            @JsonProperty("quantity")
            @ExcludeMissing
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            /** Subtotal of the item in the current user's cart, in cents (USD). */
            fun subtotal(subtotal: Long) = subtotal(JsonField.of(subtotal))

            /** Subtotal of the item in the current user's cart, in cents (USD). */
            @JsonProperty("subtotal")
            @ExcludeMissing
            fun subtotal(subtotal: JsonField<Long>) = apply { this.subtotal = subtotal }

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
    @JsonDeserialize(builder = Shipping.Builder::class)
    @NoAutoDetect
    class Shipping
    private constructor(
        private val service: JsonField<String>,
        private val timeframe: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
                this.service = shipping.service
                this.timeframe = shipping.timeframe
                additionalProperties(shipping.additionalProperties)
            }

            /** Shipping service name. */
            fun service(service: String) = service(JsonField.of(service))

            /** Shipping service name. */
            @JsonProperty("service")
            @ExcludeMissing
            fun service(service: JsonField<String>) = apply { this.service = service }

            /** Shipping timeframe provided by the shipping carrier. */
            fun timeframe(timeframe: String) = timeframe(JsonField.of(timeframe))

            /** Shipping timeframe provided by the shipping carrier. */
            @JsonProperty("timeframe")
            @ExcludeMissing
            fun timeframe(timeframe: JsonField<String>) = apply { this.timeframe = timeframe }

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

        return /* spotless:off */ other is Cart && items == other.items && subtotal == other.subtotal && addressId == other.addressId && cardId == other.cardId && amount == other.amount && shipping == other.shipping && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(items, subtotal, addressId, cardId, amount, shipping, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Cart{items=$items, subtotal=$subtotal, addressId=$addressId, cardId=$cardId, amount=$amount, shipping=$shipping, additionalProperties=$additionalProperties}"
}
