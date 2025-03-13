// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

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
import shop.terminal.api.core.checkKnown
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable

/** The current Terminal shop user's cart. */
@NoAutoDetect
class Cart @JsonCreator private constructor(
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Amount> = JsonMissing.of(),
    @JsonProperty("items") @ExcludeMissing private val items: JsonField<List<Item>> = JsonMissing.of(),
    @JsonProperty("subtotal") @ExcludeMissing private val subtotal: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("addressID") @ExcludeMissing private val addressId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("cardID") @ExcludeMissing private val cardId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("giftCardID") @ExcludeMissing private val giftCardId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("shipping") @ExcludeMissing private val shipping: JsonField<Shipping> = JsonMissing.of(),
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

    /** ID of the gift card applied to the current user's cart. */
    fun giftCardId(): String? = giftCardId.getNullable("giftCardID")

    /** Shipping information for the current user's cart. */
    fun shipping(): Shipping? = shipping.getNullable("shipping")

    /** The subtotal and shipping amounts for the current user's cart. */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount(): JsonField<Amount> = amount

    /** An array of items in the current user's cart. */
    @JsonProperty("items")
    @ExcludeMissing
    fun _items(): JsonField<List<Item>> = items

    /** The subtotal of all items in the current user's cart, in cents (USD). */
    @JsonProperty("subtotal")
    @ExcludeMissing
    fun _subtotal(): JsonField<Long> = subtotal

    /** ID of the shipping address selected on the current user's cart. */
    @JsonProperty("addressID")
    @ExcludeMissing
    fun _addressId(): JsonField<String> = addressId

    /** ID of the card selected on the current user's cart. */
    @JsonProperty("cardID")
    @ExcludeMissing
    fun _cardId(): JsonField<String> = cardId

    /** ID of the gift card applied to the current user's cart. */
    @JsonProperty("giftCardID")
    @ExcludeMissing
    fun _giftCardId(): JsonField<String> = giftCardId

    /** Shipping information for the current user's cart. */
    @JsonProperty("shipping")
    @ExcludeMissing
    fun _shipping(): JsonField<Shipping> = shipping

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Cart =
        apply {
            if (validated) {
              return@apply
            }

            amount().validate()
            items().forEach { it.validate() }
            subtotal()
            addressId()
            cardId()
            giftCardId()
            shipping()?.validate()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Cart].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .amount()
         * .items()
         * .subtotal()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Cart]. */
    class Builder internal constructor() {

        private var amount: JsonField<Amount>? = null
        private var items: JsonField<MutableList<Item>>? = null
        private var subtotal: JsonField<Long>? = null
        private var addressId: JsonField<String> = JsonMissing.of()
        private var cardId: JsonField<String> = JsonMissing.of()
        private var giftCardId: JsonField<String> = JsonMissing.of()
        private var shipping: JsonField<Shipping> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cart: Cart) =
            apply {
                amount = cart.amount
                items = cart.items.map { it.toMutableList() }
                subtotal = cart.subtotal
                addressId = cart.addressId
                cardId = cart.cardId
                giftCardId = cart.giftCardId
                shipping = cart.shipping
                additionalProperties = cart.additionalProperties.toMutableMap()
            }

        /** The subtotal and shipping amounts for the current user's cart. */
        fun amount(amount: Amount) = amount(JsonField.of(amount))

        /** The subtotal and shipping amounts for the current user's cart. */
        fun amount(amount: JsonField<Amount>) =
            apply {
                this.amount = amount
            }

        /** An array of items in the current user's cart. */
        fun items(items: List<Item>) = items(JsonField.of(items))

        /** An array of items in the current user's cart. */
        fun items(items: JsonField<List<Item>>) =
            apply {
                this.items = items.map { it.toMutableList() }
            }

        /** An array of items in the current user's cart. */
        fun addItem(item: Item) =
            apply {
                items = (items ?: JsonField.of(mutableListOf())).also {
                    checkKnown("items", it).add(item)
                }
            }

        /** The subtotal of all items in the current user's cart, in cents (USD). */
        fun subtotal(subtotal: Long) = subtotal(JsonField.of(subtotal))

        /** The subtotal of all items in the current user's cart, in cents (USD). */
        fun subtotal(subtotal: JsonField<Long>) =
            apply {
                this.subtotal = subtotal
            }

        /** ID of the shipping address selected on the current user's cart. */
        fun addressId(addressId: String) = addressId(JsonField.of(addressId))

        /** ID of the shipping address selected on the current user's cart. */
        fun addressId(addressId: JsonField<String>) =
            apply {
                this.addressId = addressId
            }

        /** ID of the card selected on the current user's cart. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** ID of the card selected on the current user's cart. */
        fun cardId(cardId: JsonField<String>) =
            apply {
                this.cardId = cardId
            }

        /** ID of the gift card applied to the current user's cart. */
        fun giftCardId(giftCardId: String) = giftCardId(JsonField.of(giftCardId))

        /** ID of the gift card applied to the current user's cart. */
        fun giftCardId(giftCardId: JsonField<String>) =
            apply {
                this.giftCardId = giftCardId
            }

        /** Shipping information for the current user's cart. */
        fun shipping(shipping: Shipping) = shipping(JsonField.of(shipping))

        /** Shipping information for the current user's cart. */
        fun shipping(shipping: JsonField<Shipping>) =
            apply {
                this.shipping = shipping
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        fun build(): Cart =
            Cart(
              checkRequired(
                "amount", amount
              ),
              checkRequired(
                "items", items
              ).map { it.toImmutable() },
              checkRequired(
                "subtotal", subtotal
              ),
              addressId,
              cardId,
              giftCardId,
              shipping,
              additionalProperties.toImmutable(),
            )
    }

    /** The subtotal and shipping amounts for the current user's cart. */
    @NoAutoDetect
    class Amount @JsonCreator private constructor(
        @JsonProperty("subtotal") @ExcludeMissing private val subtotal: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("giftCard") @ExcludeMissing private val giftCard: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("shipping") @ExcludeMissing private val shipping: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing private val total: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** Subtotal of the current user's cart, in cents (USD). */
        fun subtotal(): Long = subtotal.getRequired("subtotal")

        /** Amount applied from gift card on the current user's cart, in cents (USD). */
        fun giftCard(): Long? = giftCard.getNullable("giftCard")

        /** Shipping amount of the current user's cart, in cents (USD). */
        fun shipping(): Long? = shipping.getNullable("shipping")

        /** Total amount after gift card applied, in cents (USD). */
        fun total(): Long? = total.getNullable("total")

        /** Subtotal of the current user's cart, in cents (USD). */
        @JsonProperty("subtotal")
        @ExcludeMissing
        fun _subtotal(): JsonField<Long> = subtotal

        /** Amount applied from gift card on the current user's cart, in cents (USD). */
        @JsonProperty("giftCard")
        @ExcludeMissing
        fun _giftCard(): JsonField<Long> = giftCard

        /** Shipping amount of the current user's cart, in cents (USD). */
        @JsonProperty("shipping")
        @ExcludeMissing
        fun _shipping(): JsonField<Long> = shipping

        /** Total amount after gift card applied, in cents (USD). */
        @JsonProperty("total")
        @ExcludeMissing
        fun _total(): JsonField<Long> = total

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Amount =
            apply {
                if (validated) {
                  return@apply
                }

                subtotal()
                giftCard()
                shipping()
                total()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Amount].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .subtotal()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Amount]. */
        class Builder internal constructor() {

            private var subtotal: JsonField<Long>? = null
            private var giftCard: JsonField<Long> = JsonMissing.of()
            private var shipping: JsonField<Long> = JsonMissing.of()
            private var total: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(amount: Amount) =
                apply {
                    subtotal = amount.subtotal
                    giftCard = amount.giftCard
                    shipping = amount.shipping
                    total = amount.total
                    additionalProperties = amount.additionalProperties.toMutableMap()
                }

            /** Subtotal of the current user's cart, in cents (USD). */
            fun subtotal(subtotal: Long) = subtotal(JsonField.of(subtotal))

            /** Subtotal of the current user's cart, in cents (USD). */
            fun subtotal(subtotal: JsonField<Long>) =
                apply {
                    this.subtotal = subtotal
                }

            /** Amount applied from gift card on the current user's cart, in cents (USD). */
            fun giftCard(giftCard: Long) = giftCard(JsonField.of(giftCard))

            /** Amount applied from gift card on the current user's cart, in cents (USD). */
            fun giftCard(giftCard: JsonField<Long>) =
                apply {
                    this.giftCard = giftCard
                }

            /** Shipping amount of the current user's cart, in cents (USD). */
            fun shipping(shipping: Long) = shipping(JsonField.of(shipping))

            /** Shipping amount of the current user's cart, in cents (USD). */
            fun shipping(shipping: JsonField<Long>) =
                apply {
                    this.shipping = shipping
                }

            /** Total amount after gift card applied, in cents (USD). */
            fun total(total: Long) = total(JsonField.of(total))

            /** Total amount after gift card applied, in cents (USD). */
            fun total(total: JsonField<Long>) =
                apply {
                    this.total = total
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Amount =
                Amount(
                  checkRequired(
                    "subtotal", subtotal
                  ),
                  giftCard,
                  shipping,
                  total,
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Amount && subtotal == other.subtotal && giftCard == other.giftCard && shipping == other.shipping && total == other.total && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(subtotal, giftCard, shipping, total, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Amount{subtotal=$subtotal, giftCard=$giftCard, shipping=$shipping, total=$total, additionalProperties=$additionalProperties}"
    }

    /** An item in the current Terminal shop user's cart. */
    @NoAutoDetect
    class Item @JsonCreator private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productVariantID") @ExcludeMissing private val productVariantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing private val quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("subtotal") @ExcludeMissing private val subtotal: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

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
        @JsonProperty("id")
        @ExcludeMissing
        fun _id(): JsonField<String> = id

        /** ID of the product variant for this item in the current user's cart. */
        @JsonProperty("productVariantID")
        @ExcludeMissing
        fun _productVariantId(): JsonField<String> = productVariantId

        /** Quantity of the item in the current user's cart. */
        @JsonProperty("quantity")
        @ExcludeMissing
        fun _quantity(): JsonField<Long> = quantity

        /** Subtotal of the item in the current user's cart, in cents (USD). */
        @JsonProperty("subtotal")
        @ExcludeMissing
        fun _subtotal(): JsonField<Long> = subtotal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Item =
            apply {
                if (validated) {
                  return@apply
                }

                id()
                productVariantId()
                quantity()
                subtotal()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .id()
             * .productVariantId()
             * .quantity()
             * .subtotal()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var productVariantId: JsonField<String>? = null
            private var quantity: JsonField<Long>? = null
            private var subtotal: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(item: Item) =
                apply {
                    id = item.id
                    productVariantId = item.productVariantId
                    quantity = item.quantity
                    subtotal = item.subtotal
                    additionalProperties = item.additionalProperties.toMutableMap()
                }

            /** Unique object identifier. The format and length of IDs may change over time. */
            fun id(id: String) = id(JsonField.of(id))

            /** Unique object identifier. The format and length of IDs may change over time. */
            fun id(id: JsonField<String>) =
                apply {
                    this.id = id
                }

            /** ID of the product variant for this item in the current user's cart. */
            fun productVariantId(productVariantId: String) = productVariantId(JsonField.of(productVariantId))

            /** ID of the product variant for this item in the current user's cart. */
            fun productVariantId(productVariantId: JsonField<String>) =
                apply {
                    this.productVariantId = productVariantId
                }

            /** Quantity of the item in the current user's cart. */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /** Quantity of the item in the current user's cart. */
            fun quantity(quantity: JsonField<Long>) =
                apply {
                    this.quantity = quantity
                }

            /** Subtotal of the item in the current user's cart, in cents (USD). */
            fun subtotal(subtotal: Long) = subtotal(JsonField.of(subtotal))

            /** Subtotal of the item in the current user's cart, in cents (USD). */
            fun subtotal(subtotal: JsonField<Long>) =
                apply {
                    this.subtotal = subtotal
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Item =
                Item(
                  checkRequired(
                    "id", id
                  ),
                  checkRequired(
                    "productVariantId", productVariantId
                  ),
                  checkRequired(
                    "quantity", quantity
                  ),
                  checkRequired(
                    "subtotal", subtotal
                  ),
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

        override fun toString() = "Item{id=$id, productVariantId=$productVariantId, quantity=$quantity, subtotal=$subtotal, additionalProperties=$additionalProperties}"
    }

    /** Shipping information for the current user's cart. */
    @NoAutoDetect
    class Shipping @JsonCreator private constructor(
        @JsonProperty("service") @ExcludeMissing private val service: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeframe") @ExcludeMissing private val timeframe: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** Shipping service name. */
        fun service(): String? = service.getNullable("service")

        /** Shipping timeframe provided by the shipping carrier. */
        fun timeframe(): String? = timeframe.getNullable("timeframe")

        /** Shipping service name. */
        @JsonProperty("service")
        @ExcludeMissing
        fun _service(): JsonField<String> = service

        /** Shipping timeframe provided by the shipping carrier. */
        @JsonProperty("timeframe")
        @ExcludeMissing
        fun _timeframe(): JsonField<String> = timeframe

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Shipping =
            apply {
                if (validated) {
                  return@apply
                }

                service()
                timeframe()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Shipping]. */
            fun builder() = Builder()
        }

        /** A builder for [Shipping]. */
        class Builder internal constructor() {

            private var service: JsonField<String> = JsonMissing.of()
            private var timeframe: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(shipping: Shipping) =
                apply {
                    service = shipping.service
                    timeframe = shipping.timeframe
                    additionalProperties = shipping.additionalProperties.toMutableMap()
                }

            /** Shipping service name. */
            fun service(service: String) = service(JsonField.of(service))

            /** Shipping service name. */
            fun service(service: JsonField<String>) =
                apply {
                    this.service = service
                }

            /** Shipping timeframe provided by the shipping carrier. */
            fun timeframe(timeframe: String) = timeframe(JsonField.of(timeframe))

            /** Shipping timeframe provided by the shipping carrier. */
            fun timeframe(timeframe: JsonField<String>) =
                apply {
                    this.timeframe = timeframe
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
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

        override fun toString() = "Shipping{service=$service, timeframe=$timeframe, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is Cart && amount == other.amount && items == other.items && subtotal == other.subtotal && addressId == other.addressId && cardId == other.cardId && giftCardId == other.giftCardId && shipping == other.shipping && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, items, subtotal, addressId, cardId, giftCardId, shipping, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "Cart{amount=$amount, items=$items, subtotal=$subtotal, addressId=$addressId, cardId=$cardId, giftCardId=$giftCardId, shipping=$shipping, additionalProperties=$additionalProperties}"
}
