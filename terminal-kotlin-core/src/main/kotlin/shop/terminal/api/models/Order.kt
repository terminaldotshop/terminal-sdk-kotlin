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

/** An order from the Terminal shop. */
@JsonDeserialize(builder = Order.Builder::class)
@NoAutoDetect
class Order
private constructor(
    private val id: JsonField<String>,
    private val index: JsonField<Long>,
    private val shipping: JsonField<Shipping>,
    private val amount: JsonField<Amount>,
    private val tracking: JsonField<Tracking>,
    private val items: JsonField<List<Item>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** Zero-based index of the order for this user only. */
    fun index(): Long? = index.getNullable("index")

    /** Shipping address of the order. */
    fun shipping(): Shipping = shipping.getRequired("shipping")

    /** The subtotal and shipping amounts of the order. */
    fun amount(): Amount = amount.getRequired("amount")

    /** Tracking information of the order. */
    fun tracking(): Tracking = tracking.getRequired("tracking")

    /** Items in the order. */
    fun items(): List<Item> = items.getRequired("items")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Zero-based index of the order for this user only. */
    @JsonProperty("index") @ExcludeMissing fun _index() = index

    /** Shipping address of the order. */
    @JsonProperty("shipping") @ExcludeMissing fun _shipping() = shipping

    /** The subtotal and shipping amounts of the order. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** Tracking information of the order. */
    @JsonProperty("tracking") @ExcludeMissing fun _tracking() = tracking

    /** Items in the order. */
    @JsonProperty("items") @ExcludeMissing fun _items() = items

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Order = apply {
        if (!validated) {
            id()
            index()
            shipping().validate()
            amount().validate()
            tracking().validate()
            items().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var index: JsonField<Long> = JsonMissing.of()
        private var shipping: JsonField<Shipping> = JsonMissing.of()
        private var amount: JsonField<Amount> = JsonMissing.of()
        private var tracking: JsonField<Tracking> = JsonMissing.of()
        private var items: JsonField<List<Item>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(order: Order) = apply {
            this.id = order.id
            this.index = order.index
            this.shipping = order.shipping
            this.amount = order.amount
            this.tracking = order.tracking
            this.items = order.items
            additionalProperties(order.additionalProperties)
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Zero-based index of the order for this user only. */
        fun index(index: Long) = index(JsonField.of(index))

        /** Zero-based index of the order for this user only. */
        @JsonProperty("index")
        @ExcludeMissing
        fun index(index: JsonField<Long>) = apply { this.index = index }

        /** Shipping address of the order. */
        fun shipping(shipping: Shipping) = shipping(JsonField.of(shipping))

        /** Shipping address of the order. */
        @JsonProperty("shipping")
        @ExcludeMissing
        fun shipping(shipping: JsonField<Shipping>) = apply { this.shipping = shipping }

        /** The subtotal and shipping amounts of the order. */
        fun amount(amount: Amount) = amount(JsonField.of(amount))

        /** The subtotal and shipping amounts of the order. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Amount>) = apply { this.amount = amount }

        /** Tracking information of the order. */
        fun tracking(tracking: Tracking) = tracking(JsonField.of(tracking))

        /** Tracking information of the order. */
        @JsonProperty("tracking")
        @ExcludeMissing
        fun tracking(tracking: JsonField<Tracking>) = apply { this.tracking = tracking }

        /** Items in the order. */
        fun items(items: List<Item>) = items(JsonField.of(items))

        /** Items in the order. */
        @JsonProperty("items")
        @ExcludeMissing
        fun items(items: JsonField<List<Item>>) = apply { this.items = items }

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

        fun build(): Order =
            Order(
                id,
                index,
                shipping,
                amount,
                tracking,
                items.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /** The subtotal and shipping amounts of the order. */
    @JsonDeserialize(builder = Amount.Builder::class)
    @NoAutoDetect
    class Amount
    private constructor(
        private val shipping: JsonField<Long>,
        private val subtotal: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Shipping amount of the order, in cents (USD). */
        fun shipping(): Long = shipping.getRequired("shipping")

        /** Subtotal amount of the order, in cents (USD). */
        fun subtotal(): Long = subtotal.getRequired("subtotal")

        /** Shipping amount of the order, in cents (USD). */
        @JsonProperty("shipping") @ExcludeMissing fun _shipping() = shipping

        /** Subtotal amount of the order, in cents (USD). */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Amount = apply {
            if (!validated) {
                shipping()
                subtotal()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var shipping: JsonField<Long> = JsonMissing.of()
            private var subtotal: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(amount: Amount) = apply {
                this.shipping = amount.shipping
                this.subtotal = amount.subtotal
                additionalProperties(amount.additionalProperties)
            }

            /** Shipping amount of the order, in cents (USD). */
            fun shipping(shipping: Long) = shipping(JsonField.of(shipping))

            /** Shipping amount of the order, in cents (USD). */
            @JsonProperty("shipping")
            @ExcludeMissing
            fun shipping(shipping: JsonField<Long>) = apply { this.shipping = shipping }

            /** Subtotal amount of the order, in cents (USD). */
            fun subtotal(subtotal: Long) = subtotal(JsonField.of(subtotal))

            /** Subtotal amount of the order, in cents (USD). */
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

            fun build(): Amount =
                Amount(
                    shipping,
                    subtotal,
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

    @JsonDeserialize(builder = Item.Builder::class)
    @NoAutoDetect
    class Item
    private constructor(
        private val id: JsonField<String>,
        private val description: JsonField<String>,
        private val amount: JsonField<Long>,
        private val quantity: JsonField<Long>,
        private val productVariantId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(): String = id.getRequired("id")

        /** Description of the item in the order. */
        fun description(): String? = description.getNullable("description")

        /** Amount of the item in the order, in cents (USD). */
        fun amount(): Long = amount.getRequired("amount")

        /** Quantity of the item in the order. */
        fun quantity(): Long = quantity.getRequired("quantity")

        /** ID of the product variant of the item in the order. */
        fun productVariantId(): String? = productVariantId.getNullable("productVariantID")

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** Description of the item in the order. */
        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /** Amount of the item in the order, in cents (USD). */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** Quantity of the item in the order. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        /** ID of the product variant of the item in the order. */
        @JsonProperty("productVariantID") @ExcludeMissing fun _productVariantId() = productVariantId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Item = apply {
            if (!validated) {
                id()
                description()
                amount()
                quantity()
                productVariantId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var quantity: JsonField<Long> = JsonMissing.of()
            private var productVariantId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(item: Item) = apply {
                this.id = item.id
                this.description = item.description
                this.amount = item.amount
                this.quantity = item.quantity
                this.productVariantId = item.productVariantId
                additionalProperties(item.additionalProperties)
            }

            /** Unique object identifier. The format and length of IDs may change over time. */
            fun id(id: String) = id(JsonField.of(id))

            /** Unique object identifier. The format and length of IDs may change over time. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Description of the item in the order. */
            fun description(description: String) = description(JsonField.of(description))

            /** Description of the item in the order. */
            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Amount of the item in the order, in cents (USD). */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** Amount of the item in the order, in cents (USD). */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Quantity of the item in the order. */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /** Quantity of the item in the order. */
            @JsonProperty("quantity")
            @ExcludeMissing
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            /** ID of the product variant of the item in the order. */
            fun productVariantId(productVariantId: String) =
                productVariantId(JsonField.of(productVariantId))

            /** ID of the product variant of the item in the order. */
            @JsonProperty("productVariantID")
            @ExcludeMissing
            fun productVariantId(productVariantId: JsonField<String>) = apply {
                this.productVariantId = productVariantId
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

            fun build(): Item =
                Item(
                    id,
                    description,
                    amount,
                    quantity,
                    productVariantId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Item && id == other.id && description == other.description && amount == other.amount && quantity == other.quantity && productVariantId == other.productVariantId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, description, amount, quantity, productVariantId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, description=$description, amount=$amount, quantity=$quantity, productVariantId=$productVariantId, additionalProperties=$additionalProperties}"
    }

    /** Shipping address of the order. */
    @JsonDeserialize(builder = Shipping.Builder::class)
    @NoAutoDetect
    class Shipping
    private constructor(
        private val name: JsonField<String>,
        private val street1: JsonField<String>,
        private val street2: JsonField<String>,
        private val city: JsonField<String>,
        private val province: JsonField<String>,
        private val country: JsonField<String>,
        private val zip: JsonField<String>,
        private val phone: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The recipient's name. */
        fun name(): String = name.getRequired("name")

        /** Street of the address. */
        fun street1(): String = street1.getRequired("street1")

        /** Apartment, suite, etc. of the address. */
        fun street2(): String? = street2.getNullable("street2")

        /** City of the address. */
        fun city(): String = city.getRequired("city")

        /** Province or state of the address. */
        fun province(): String? = province.getNullable("province")

        /** ISO 3166-1 alpha-2 country code of the address. */
        fun country(): String = country.getRequired("country")

        /** Zip code of the address. */
        fun zip(): String = zip.getRequired("zip")

        /** Phone number of the recipient. */
        fun phone(): String? = phone.getNullable("phone")

        /** The recipient's name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** Street of the address. */
        @JsonProperty("street1") @ExcludeMissing fun _street1() = street1

        /** Apartment, suite, etc. of the address. */
        @JsonProperty("street2") @ExcludeMissing fun _street2() = street2

        /** City of the address. */
        @JsonProperty("city") @ExcludeMissing fun _city() = city

        /** Province or state of the address. */
        @JsonProperty("province") @ExcludeMissing fun _province() = province

        /** ISO 3166-1 alpha-2 country code of the address. */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        /** Zip code of the address. */
        @JsonProperty("zip") @ExcludeMissing fun _zip() = zip

        /** Phone number of the recipient. */
        @JsonProperty("phone") @ExcludeMissing fun _phone() = phone

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Shipping = apply {
            if (!validated) {
                name()
                street1()
                street2()
                city()
                province()
                country()
                zip()
                phone()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var street1: JsonField<String> = JsonMissing.of()
            private var street2: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var province: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var zip: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(shipping: Shipping) = apply {
                this.name = shipping.name
                this.street1 = shipping.street1
                this.street2 = shipping.street2
                this.city = shipping.city
                this.province = shipping.province
                this.country = shipping.country
                this.zip = shipping.zip
                this.phone = shipping.phone
                additionalProperties(shipping.additionalProperties)
            }

            /** The recipient's name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The recipient's name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Street of the address. */
            fun street1(street1: String) = street1(JsonField.of(street1))

            /** Street of the address. */
            @JsonProperty("street1")
            @ExcludeMissing
            fun street1(street1: JsonField<String>) = apply { this.street1 = street1 }

            /** Apartment, suite, etc. of the address. */
            fun street2(street2: String) = street2(JsonField.of(street2))

            /** Apartment, suite, etc. of the address. */
            @JsonProperty("street2")
            @ExcludeMissing
            fun street2(street2: JsonField<String>) = apply { this.street2 = street2 }

            /** City of the address. */
            fun city(city: String) = city(JsonField.of(city))

            /** City of the address. */
            @JsonProperty("city")
            @ExcludeMissing
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** Province or state of the address. */
            fun province(province: String) = province(JsonField.of(province))

            /** Province or state of the address. */
            @JsonProperty("province")
            @ExcludeMissing
            fun province(province: JsonField<String>) = apply { this.province = province }

            /** ISO 3166-1 alpha-2 country code of the address. */
            fun country(country: String) = country(JsonField.of(country))

            /** ISO 3166-1 alpha-2 country code of the address. */
            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Zip code of the address. */
            fun zip(zip: String) = zip(JsonField.of(zip))

            /** Zip code of the address. */
            @JsonProperty("zip")
            @ExcludeMissing
            fun zip(zip: JsonField<String>) = apply { this.zip = zip }

            /** Phone number of the recipient. */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /** Phone number of the recipient. */
            @JsonProperty("phone")
            @ExcludeMissing
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

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
                    name,
                    street1,
                    street2,
                    city,
                    province,
                    country,
                    zip,
                    phone,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Shipping && name == other.name && street1 == other.street1 && street2 == other.street2 && city == other.city && province == other.province && country == other.country && zip == other.zip && phone == other.phone && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, street1, street2, city, province, country, zip, phone, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Shipping{name=$name, street1=$street1, street2=$street2, city=$city, province=$province, country=$country, zip=$zip, phone=$phone, additionalProperties=$additionalProperties}"
    }

    /** Tracking information of the order. */
    @JsonDeserialize(builder = Tracking.Builder::class)
    @NoAutoDetect
    class Tracking
    private constructor(
        private val service: JsonField<String>,
        private val number: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Shipping service of the order. */
        fun service(): String? = service.getNullable("service")

        /** Tracking number of the order. */
        fun number(): String? = number.getNullable("number")

        /** Tracking URL of the order. */
        fun url(): String? = url.getNullable("url")

        /** Shipping service of the order. */
        @JsonProperty("service") @ExcludeMissing fun _service() = service

        /** Tracking number of the order. */
        @JsonProperty("number") @ExcludeMissing fun _number() = number

        /** Tracking URL of the order. */
        @JsonProperty("url") @ExcludeMissing fun _url() = url

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Tracking = apply {
            if (!validated) {
                service()
                number()
                url()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var service: JsonField<String> = JsonMissing.of()
            private var number: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tracking: Tracking) = apply {
                this.service = tracking.service
                this.number = tracking.number
                this.url = tracking.url
                additionalProperties(tracking.additionalProperties)
            }

            /** Shipping service of the order. */
            fun service(service: String) = service(JsonField.of(service))

            /** Shipping service of the order. */
            @JsonProperty("service")
            @ExcludeMissing
            fun service(service: JsonField<String>) = apply { this.service = service }

            /** Tracking number of the order. */
            fun number(number: String) = number(JsonField.of(number))

            /** Tracking number of the order. */
            @JsonProperty("number")
            @ExcludeMissing
            fun number(number: JsonField<String>) = apply { this.number = number }

            /** Tracking URL of the order. */
            fun url(url: String) = url(JsonField.of(url))

            /** Tracking URL of the order. */
            @JsonProperty("url")
            @ExcludeMissing
            fun url(url: JsonField<String>) = apply { this.url = url }

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

            fun build(): Tracking =
                Tracking(
                    service,
                    number,
                    url,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tracking && service == other.service && number == other.number && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(service, number, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tracking{service=$service, number=$number, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Order && id == other.id && index == other.index && shipping == other.shipping && amount == other.amount && tracking == other.tracking && items == other.items && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, index, shipping, amount, tracking, items, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Order{id=$id, index=$index, shipping=$shipping, amount=$amount, tracking=$tracking, items=$items, additionalProperties=$additionalProperties}"
}
