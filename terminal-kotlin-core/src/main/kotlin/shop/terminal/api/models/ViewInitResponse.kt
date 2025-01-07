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

@NoAutoDetect
class ViewInitResponse
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Initial app data. */
    fun data(): Data = data.getRequired("data")

    /** Initial app data. */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ViewInitResponse = apply {
        if (!validated) {
            data().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(viewInitResponse: ViewInitResponse) = apply {
            data = viewInitResponse.data
            additionalProperties = viewInitResponse.additionalProperties.toMutableMap()
        }

        /** Initial app data. */
        fun data(data: Data) = data(JsonField.of(data))

        /** Initial app data. */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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

        fun build(): ViewInitResponse = ViewInitResponse(data, additionalProperties.toImmutable())
    }

    /** Initial app data. */
    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("addresses")
        @ExcludeMissing
        private val addresses: JsonField<List<Address>> = JsonMissing.of(),
        @JsonProperty("apps")
        @ExcludeMissing
        private val apps: JsonField<List<App>> = JsonMissing.of(),
        @JsonProperty("cards")
        @ExcludeMissing
        private val cards: JsonField<List<Card>> = JsonMissing.of(),
        @JsonProperty("cart") @ExcludeMissing private val cart: JsonField<Cart> = JsonMissing.of(),
        @JsonProperty("orders")
        @ExcludeMissing
        private val orders: JsonField<List<Order>> = JsonMissing.of(),
        @JsonProperty("products")
        @ExcludeMissing
        private val products: JsonField<List<Product>> = JsonMissing.of(),
        @JsonProperty("profile")
        @ExcludeMissing
        private val profile: JsonField<Profile> = JsonMissing.of(),
        @JsonProperty("subscriptions")
        @ExcludeMissing
        private val subscriptions: JsonField<List<Subscription>> = JsonMissing.of(),
        @JsonProperty("tokens")
        @ExcludeMissing
        private val tokens: JsonField<List<Token>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun addresses(): List<Address> = addresses.getRequired("addresses")

        fun apps(): List<App> = apps.getRequired("apps")

        fun cards(): List<Card> = cards.getRequired("cards")

        /** The current Terminal shop user's cart. */
        fun cart(): Cart = cart.getRequired("cart")

        fun orders(): List<Order> = orders.getRequired("orders")

        fun products(): List<Product> = products.getRequired("products")

        /** A Terminal shop user's profile. (We have users, btw.) */
        fun profile(): Profile = profile.getRequired("profile")

        fun subscriptions(): List<Subscription> = subscriptions.getRequired("subscriptions")

        fun tokens(): List<Token> = tokens.getRequired("tokens")

        @JsonProperty("addresses") @ExcludeMissing fun _addresses() = addresses

        @JsonProperty("apps") @ExcludeMissing fun _apps() = apps

        @JsonProperty("cards") @ExcludeMissing fun _cards() = cards

        /** The current Terminal shop user's cart. */
        @JsonProperty("cart") @ExcludeMissing fun _cart() = cart

        @JsonProperty("orders") @ExcludeMissing fun _orders() = orders

        @JsonProperty("products") @ExcludeMissing fun _products() = products

        /** A Terminal shop user's profile. (We have users, btw.) */
        @JsonProperty("profile") @ExcludeMissing fun _profile() = profile

        @JsonProperty("subscriptions") @ExcludeMissing fun _subscriptions() = subscriptions

        @JsonProperty("tokens") @ExcludeMissing fun _tokens() = tokens

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (!validated) {
                addresses().forEach { it.validate() }
                apps().forEach { it.validate() }
                cards().forEach { it.validate() }
                cart().validate()
                orders().forEach { it.validate() }
                products().forEach { it.validate() }
                profile().validate()
                subscriptions().forEach { it.validate() }
                tokens().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var addresses: JsonField<List<Address>> = JsonMissing.of()
            private var apps: JsonField<List<App>> = JsonMissing.of()
            private var cards: JsonField<List<Card>> = JsonMissing.of()
            private var cart: JsonField<Cart> = JsonMissing.of()
            private var orders: JsonField<List<Order>> = JsonMissing.of()
            private var products: JsonField<List<Product>> = JsonMissing.of()
            private var profile: JsonField<Profile> = JsonMissing.of()
            private var subscriptions: JsonField<List<Subscription>> = JsonMissing.of()
            private var tokens: JsonField<List<Token>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                addresses = data.addresses
                apps = data.apps
                cards = data.cards
                cart = data.cart
                orders = data.orders
                products = data.products
                profile = data.profile
                subscriptions = data.subscriptions
                tokens = data.tokens
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun addresses(addresses: List<Address>) = addresses(JsonField.of(addresses))

            fun addresses(addresses: JsonField<List<Address>>) = apply {
                this.addresses = addresses
            }

            fun apps(apps: List<App>) = apps(JsonField.of(apps))

            fun apps(apps: JsonField<List<App>>) = apply { this.apps = apps }

            fun cards(cards: List<Card>) = cards(JsonField.of(cards))

            fun cards(cards: JsonField<List<Card>>) = apply { this.cards = cards }

            /** The current Terminal shop user's cart. */
            fun cart(cart: Cart) = cart(JsonField.of(cart))

            /** The current Terminal shop user's cart. */
            fun cart(cart: JsonField<Cart>) = apply { this.cart = cart }

            fun orders(orders: List<Order>) = orders(JsonField.of(orders))

            fun orders(orders: JsonField<List<Order>>) = apply { this.orders = orders }

            fun products(products: List<Product>) = products(JsonField.of(products))

            fun products(products: JsonField<List<Product>>) = apply { this.products = products }

            /** A Terminal shop user's profile. (We have users, btw.) */
            fun profile(profile: Profile) = profile(JsonField.of(profile))

            /** A Terminal shop user's profile. (We have users, btw.) */
            fun profile(profile: JsonField<Profile>) = apply { this.profile = profile }

            fun subscriptions(subscriptions: List<Subscription>) =
                subscriptions(JsonField.of(subscriptions))

            fun subscriptions(subscriptions: JsonField<List<Subscription>>) = apply {
                this.subscriptions = subscriptions
            }

            fun tokens(tokens: List<Token>) = tokens(JsonField.of(tokens))

            fun tokens(tokens: JsonField<List<Token>>) = apply { this.tokens = tokens }

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

            fun build(): Data =
                Data(
                    addresses.map { it.toImmutable() },
                    apps.map { it.toImmutable() },
                    cards.map { it.toImmutable() },
                    cart,
                    orders.map { it.toImmutable() },
                    products.map { it.toImmutable() },
                    profile,
                    subscriptions.map { it.toImmutable() },
                    tokens.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && addresses == other.addresses && apps == other.apps && cards == other.cards && cart == other.cart && orders == other.orders && products == other.products && profile == other.profile && subscriptions == other.subscriptions && tokens == other.tokens && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addresses, apps, cards, cart, orders, products, profile, subscriptions, tokens, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{addresses=$addresses, apps=$apps, cards=$cards, cart=$cart, orders=$orders, products=$products, profile=$profile, subscriptions=$subscriptions, tokens=$tokens, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ViewInitResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ViewInitResponse{data=$data, additionalProperties=$additionalProperties}"
}
