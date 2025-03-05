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
import shop.terminal.api.core.checkKnown
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable

/** An order from the Terminal shop. */
@NoAutoDetect
class Order
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<Amount> = JsonMissing.of(),
    @JsonProperty("items")
    @ExcludeMissing
    private val items: JsonField<List<Item>> = JsonMissing.of(),
    @JsonProperty("shipping")
    @ExcludeMissing
    private val shipping: JsonField<Shipping> = JsonMissing.of(),
    @JsonProperty("tracking")
    @ExcludeMissing
    private val tracking: JsonField<Tracking> = JsonMissing.of(),
    @JsonProperty("index") @ExcludeMissing private val index: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** The subtotal and shipping amounts of the order. */
    fun amount(): Amount = amount.getRequired("amount")

    /** Items in the order. */
    fun items(): List<Item> = items.getRequired("items")

    /** Shipping address of the order. */
    fun shipping(): Shipping = shipping.getRequired("shipping")

    /** Tracking information of the order. */
    fun tracking(): Tracking = tracking.getRequired("tracking")

    /** Zero-based index of the order for this user only. */
    fun index(): Long? = index.getNullable("index")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The subtotal and shipping amounts of the order. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Amount> = amount

    /** Items in the order. */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

    /** Shipping address of the order. */
    @JsonProperty("shipping") @ExcludeMissing fun _shipping(): JsonField<Shipping> = shipping

    /** Tracking information of the order. */
    @JsonProperty("tracking") @ExcludeMissing fun _tracking(): JsonField<Tracking> = tracking

    /** Zero-based index of the order for this user only. */
    @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Order = apply {
        if (validated) {
            return@apply
        }

        id()
        amount().validate()
        items().forEach { it.validate() }
        shipping().validate()
        tracking().validate()
        index()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Order].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
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
        private var items: JsonField<MutableList<Item>>? = null
        private var shipping: JsonField<Shipping>? = null
        private var tracking: JsonField<Tracking>? = null
        private var index: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(order: Order) = apply {
            id = order.id
            amount = order.amount
            items = order.items.map { it.toMutableList() }
            shipping = order.shipping
            tracking = order.tracking
            index = order.index
            additionalProperties = order.additionalProperties.toMutableMap()
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The subtotal and shipping amounts of the order. */
        fun amount(amount: Amount) = amount(JsonField.of(amount))

        /** The subtotal and shipping amounts of the order. */
        fun amount(amount: JsonField<Amount>) = apply { this.amount = amount }

        /** Items in the order. */
        fun items(items: List<Item>) = items(JsonField.of(items))

        /** Items in the order. */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /** Items in the order. */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /** Shipping address of the order. */
        fun shipping(shipping: Shipping) = shipping(JsonField.of(shipping))

        /** Shipping address of the order. */
        fun shipping(shipping: JsonField<Shipping>) = apply { this.shipping = shipping }

        /** Tracking information of the order. */
        fun tracking(tracking: Tracking) = tracking(JsonField.of(tracking))

        /** Tracking information of the order. */
        fun tracking(tracking: JsonField<Tracking>) = apply { this.tracking = tracking }

        /** Zero-based index of the order for this user only. */
        fun index(index: Long) = index(JsonField.of(index))

        /** Zero-based index of the order for this user only. */
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

        fun build(): Order =
            Order(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("shipping", shipping),
                checkRequired("tracking", tracking),
                index,
                additionalProperties.toImmutable(),
            )
    }

    /** The subtotal and shipping amounts of the order. */
    @NoAutoDetect
    class Amount
    @JsonCreator
    private constructor(
        @JsonProperty("shipping")
        @ExcludeMissing
        private val shipping: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("subtotal")
        @ExcludeMissing
        private val subtotal: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Shipping amount of the order, in cents (USD). */
        fun shipping(): Long = shipping.getRequired("shipping")

        /** Subtotal amount of the order, in cents (USD). */
        fun subtotal(): Long = subtotal.getRequired("subtotal")

        /** Shipping amount of the order, in cents (USD). */
        @JsonProperty("shipping") @ExcludeMissing fun _shipping(): JsonField<Long> = shipping

        /** Subtotal amount of the order, in cents (USD). */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Long> = subtotal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Amount = apply {
            if (validated) {
                return@apply
            }

            shipping()
            subtotal()
            validated = true
        }

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

            /** Shipping amount of the order, in cents (USD). */
            fun shipping(shipping: JsonField<Long>) = apply { this.shipping = shipping }

            /** Subtotal amount of the order, in cents (USD). */
            fun subtotal(subtotal: Long) = subtotal(JsonField.of(subtotal))

            /** Subtotal amount of the order, in cents (USD). */
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

            fun build(): Amount =
                Amount(
                    checkRequired("shipping", shipping),
                    checkRequired("subtotal", subtotal),
                    additionalProperties.toImmutable(),
                )
        }

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

    @NoAutoDetect
    class Item
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productVariantID")
        @ExcludeMissing
        private val productVariantId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(): String = id.getRequired("id")

        /** Amount of the item in the order, in cents (USD). */
        fun amount(): Long = amount.getRequired("amount")

        /** Quantity of the item in the order. */
        fun quantity(): Long = quantity.getRequired("quantity")

        /** Description of the item in the order. */
        fun description(): String? = description.getNullable("description")

        /** ID of the product variant of the item in the order. */
        fun productVariantId(): String? = productVariantId.getNullable("productVariantID")

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** Amount of the item in the order, in cents (USD). */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** Quantity of the item in the order. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

        /** Description of the item in the order. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** ID of the product variant of the item in the order. */
        @JsonProperty("productVariantID")
        @ExcludeMissing
        fun _productVariantId(): JsonField<String> = productVariantId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            /** Unique object identifier. The format and length of IDs may change over time. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Amount of the item in the order, in cents (USD). */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** Amount of the item in the order, in cents (USD). */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Quantity of the item in the order. */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /** Quantity of the item in the order. */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            /** Description of the item in the order. */
            fun description(description: String) = description(JsonField.of(description))

            /** Description of the item in the order. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** ID of the product variant of the item in the order. */
            fun productVariantId(productVariantId: String) =
                productVariantId(JsonField.of(productVariantId))

            /** ID of the product variant of the item in the order. */
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

            fun build(): Item =
                Item(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("quantity", quantity),
                    description,
                    productVariantId,
                    additionalProperties.toImmutable(),
                )
        }

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
    @NoAutoDetect
    class Shipping
    @JsonCreator
    private constructor(
        @JsonProperty("city")
        @ExcludeMissing
        private val city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street1")
        @ExcludeMissing
        private val street1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zip") @ExcludeMissing private val zip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone")
        @ExcludeMissing
        private val phone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("province")
        @ExcludeMissing
        private val province: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street2")
        @ExcludeMissing
        private val street2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** City of the address. */
        fun city(): String = city.getRequired("city")

        /** ISO 3166-1 alpha-2 country code of the address. */
        fun country(): String = country.getRequired("country")

        /** The recipient's name. */
        fun name(): String = name.getRequired("name")

        /** Street of the address. */
        fun street1(): String = street1.getRequired("street1")

        /** Zip code of the address. */
        fun zip(): String = zip.getRequired("zip")

        /** Phone number of the recipient. */
        fun phone(): String? = phone.getNullable("phone")

        /** Province or state of the address. */
        fun province(): String? = province.getNullable("province")

        /** Apartment, suite, etc. of the address. */
        fun street2(): String? = street2.getNullable("street2")

        /** City of the address. */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /** ISO 3166-1 alpha-2 country code of the address. */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /** The recipient's name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Street of the address. */
        @JsonProperty("street1") @ExcludeMissing fun _street1(): JsonField<String> = street1

        /** Zip code of the address. */
        @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

        /** Phone number of the recipient. */
        @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

        /** Province or state of the address. */
        @JsonProperty("province") @ExcludeMissing fun _province(): JsonField<String> = province

        /** Apartment, suite, etc. of the address. */
        @JsonProperty("street2") @ExcludeMissing fun _street2(): JsonField<String> = street2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            /** City of the address. */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** ISO 3166-1 alpha-2 country code of the address. */
            fun country(country: String) = country(JsonField.of(country))

            /** ISO 3166-1 alpha-2 country code of the address. */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** The recipient's name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The recipient's name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Street of the address. */
            fun street1(street1: String) = street1(JsonField.of(street1))

            /** Street of the address. */
            fun street1(street1: JsonField<String>) = apply { this.street1 = street1 }

            /** Zip code of the address. */
            fun zip(zip: String) = zip(JsonField.of(zip))

            /** Zip code of the address. */
            fun zip(zip: JsonField<String>) = apply { this.zip = zip }

            /** Phone number of the recipient. */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /** Phone number of the recipient. */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            /** Province or state of the address. */
            fun province(province: String) = province(JsonField.of(province))

            /** Province or state of the address. */
            fun province(province: JsonField<String>) = apply { this.province = province }

            /** Apartment, suite, etc. of the address. */
            fun street2(street2: String) = street2(JsonField.of(street2))

            /** Apartment, suite, etc. of the address. */
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
                    additionalProperties.toImmutable(),
                )
        }

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
    @NoAutoDetect
    class Tracking
    @JsonCreator
    private constructor(
        @JsonProperty("number")
        @ExcludeMissing
        private val number: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service")
        @ExcludeMissing
        private val service: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Tracking number of the order. */
        fun number(): String? = number.getNullable("number")

        /** Shipping service of the order. */
        fun service(): String? = service.getNullable("service")

        /** Tracking URL of the order. */
        fun url(): String? = url.getNullable("url")

        /** Tracking number of the order. */
        @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

        /** Shipping service of the order. */
        @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<String> = service

        /** Tracking URL of the order. */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Tracking = apply {
            if (validated) {
                return@apply
            }

            number()
            service()
            url()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Tracking]. */
            fun builder() = Builder()
        }

        /** A builder for [Tracking]. */
        class Builder internal constructor() {

            private var number: JsonField<String> = JsonMissing.of()
            private var service: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tracking: Tracking) = apply {
                number = tracking.number
                service = tracking.service
                url = tracking.url
                additionalProperties = tracking.additionalProperties.toMutableMap()
            }

            /** Tracking number of the order. */
            fun number(number: String) = number(JsonField.of(number))

            /** Tracking number of the order. */
            fun number(number: JsonField<String>) = apply { this.number = number }

            /** Shipping service of the order. */
            fun service(service: String) = service(JsonField.of(service))

            /** Shipping service of the order. */
            fun service(service: JsonField<String>) = apply { this.service = service }

            /** Tracking URL of the order. */
            fun url(url: String) = url(JsonField.of(url))

            /** Tracking URL of the order. */
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

            fun build(): Tracking =
                Tracking(number, service, url, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tracking && number == other.number && service == other.service && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(number, service, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tracking{number=$number, service=$service, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Order && id == other.id && amount == other.amount && items == other.items && shipping == other.shipping && tracking == other.tracking && index == other.index && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, items, shipping, tracking, index, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Order{id=$id, amount=$amount, items=$items, shipping=$shipping, tracking=$tracking, index=$index, additionalProperties=$additionalProperties}"
}
