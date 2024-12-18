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

@JsonDeserialize(builder = ViewInitResponse.Builder::class)
@NoAutoDetect
class ViewInitResponse
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Initial app data. */
    fun data(): Data = data.getRequired("data")

    /** Initial app data. */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            this.data = viewInitResponse.data
            additionalProperties(viewInitResponse.additionalProperties)
        }

        /** Initial app data. */
        fun data(data: Data) = data(JsonField.of(data))

        /** Initial app data. */
        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Data>) = apply { this.data = data }

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

        fun build(): ViewInitResponse = ViewInitResponse(data, additionalProperties.toImmutable())
    }

    /** Initial app data. */
    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val profile: JsonField<Profile>,
        private val products: JsonField<List<Product>>,
        private val cart: JsonField<Cart>,
        private val addresses: JsonField<List<Address>>,
        private val cards: JsonField<List<Card>>,
        private val subscriptions: JsonField<List<Subscription>>,
        private val orders: JsonField<List<Order>>,
        private val tokens: JsonField<List<Token>>,
        private val apps: JsonField<List<App>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** A Terminal shop user's profile. (We have users, btw.) */
        fun profile(): Profile = profile.getRequired("profile")

        fun products(): List<Product> = products.getRequired("products")

        /** The current Terminal shop user's cart. */
        fun cart(): Cart = cart.getRequired("cart")

        fun addresses(): List<Address> = addresses.getRequired("addresses")

        fun cards(): List<Card> = cards.getRequired("cards")

        fun subscriptions(): List<Subscription> = subscriptions.getRequired("subscriptions")

        fun orders(): List<Order> = orders.getRequired("orders")

        fun tokens(): List<Token> = tokens.getRequired("tokens")

        fun apps(): List<App> = apps.getRequired("apps")

        /** A Terminal shop user's profile. (We have users, btw.) */
        @JsonProperty("profile") @ExcludeMissing fun _profile() = profile

        @JsonProperty("products") @ExcludeMissing fun _products() = products

        /** The current Terminal shop user's cart. */
        @JsonProperty("cart") @ExcludeMissing fun _cart() = cart

        @JsonProperty("addresses") @ExcludeMissing fun _addresses() = addresses

        @JsonProperty("cards") @ExcludeMissing fun _cards() = cards

        @JsonProperty("subscriptions") @ExcludeMissing fun _subscriptions() = subscriptions

        @JsonProperty("orders") @ExcludeMissing fun _orders() = orders

        @JsonProperty("tokens") @ExcludeMissing fun _tokens() = tokens

        @JsonProperty("apps") @ExcludeMissing fun _apps() = apps

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                profile().validate()
                products().forEach { it.validate() }
                cart().validate()
                addresses().forEach { it.validate() }
                cards().forEach { it.validate() }
                subscriptions().forEach { it.validate() }
                orders().forEach { it.validate() }
                tokens().forEach { it.validate() }
                apps().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var profile: JsonField<Profile> = JsonMissing.of()
            private var products: JsonField<List<Product>> = JsonMissing.of()
            private var cart: JsonField<Cart> = JsonMissing.of()
            private var addresses: JsonField<List<Address>> = JsonMissing.of()
            private var cards: JsonField<List<Card>> = JsonMissing.of()
            private var subscriptions: JsonField<List<Subscription>> = JsonMissing.of()
            private var orders: JsonField<List<Order>> = JsonMissing.of()
            private var tokens: JsonField<List<Token>> = JsonMissing.of()
            private var apps: JsonField<List<App>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                this.profile = data.profile
                this.products = data.products
                this.cart = data.cart
                this.addresses = data.addresses
                this.cards = data.cards
                this.subscriptions = data.subscriptions
                this.orders = data.orders
                this.tokens = data.tokens
                this.apps = data.apps
                additionalProperties(data.additionalProperties)
            }

            /** A Terminal shop user's profile. (We have users, btw.) */
            fun profile(profile: Profile) = profile(JsonField.of(profile))

            /** A Terminal shop user's profile. (We have users, btw.) */
            @JsonProperty("profile")
            @ExcludeMissing
            fun profile(profile: JsonField<Profile>) = apply { this.profile = profile }

            fun products(products: List<Product>) = products(JsonField.of(products))

            @JsonProperty("products")
            @ExcludeMissing
            fun products(products: JsonField<List<Product>>) = apply { this.products = products }

            /** The current Terminal shop user's cart. */
            fun cart(cart: Cart) = cart(JsonField.of(cart))

            /** The current Terminal shop user's cart. */
            @JsonProperty("cart")
            @ExcludeMissing
            fun cart(cart: JsonField<Cart>) = apply { this.cart = cart }

            fun addresses(addresses: List<Address>) = addresses(JsonField.of(addresses))

            @JsonProperty("addresses")
            @ExcludeMissing
            fun addresses(addresses: JsonField<List<Address>>) = apply {
                this.addresses = addresses
            }

            fun cards(cards: List<Card>) = cards(JsonField.of(cards))

            @JsonProperty("cards")
            @ExcludeMissing
            fun cards(cards: JsonField<List<Card>>) = apply { this.cards = cards }

            fun subscriptions(subscriptions: List<Subscription>) =
                subscriptions(JsonField.of(subscriptions))

            @JsonProperty("subscriptions")
            @ExcludeMissing
            fun subscriptions(subscriptions: JsonField<List<Subscription>>) = apply {
                this.subscriptions = subscriptions
            }

            fun orders(orders: List<Order>) = orders(JsonField.of(orders))

            @JsonProperty("orders")
            @ExcludeMissing
            fun orders(orders: JsonField<List<Order>>) = apply { this.orders = orders }

            fun tokens(tokens: List<Token>) = tokens(JsonField.of(tokens))

            @JsonProperty("tokens")
            @ExcludeMissing
            fun tokens(tokens: JsonField<List<Token>>) = apply { this.tokens = tokens }

            fun apps(apps: List<App>) = apps(JsonField.of(apps))

            @JsonProperty("apps")
            @ExcludeMissing
            fun apps(apps: JsonField<List<App>>) = apply { this.apps = apps }

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

            fun build(): Data =
                Data(
                    profile,
                    products.map { it.toImmutable() },
                    cart,
                    addresses.map { it.toImmutable() },
                    cards.map { it.toImmutable() },
                    subscriptions.map { it.toImmutable() },
                    orders.map { it.toImmutable() },
                    tokens.map { it.toImmutable() },
                    apps.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && profile == other.profile && products == other.products && cart == other.cart && addresses == other.addresses && cards == other.cards && subscriptions == other.subscriptions && orders == other.orders && tokens == other.tokens && apps == other.apps && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(profile, products, cart, addresses, cards, subscriptions, orders, tokens, apps, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{profile=$profile, products=$products, cart=$cart, addresses=$addresses, cards=$cards, subscriptions=$subscriptions, orders=$orders, tokens=$tokens, apps=$apps, additionalProperties=$additionalProperties}"
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
