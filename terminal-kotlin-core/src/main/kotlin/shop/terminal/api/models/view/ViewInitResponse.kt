// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.view

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
import shop.terminal.api.models.address.Address
import shop.terminal.api.models.app.App
import shop.terminal.api.models.card.Card
import shop.terminal.api.models.cart.Cart
import shop.terminal.api.models.order.Order
import shop.terminal.api.models.product.Product
import shop.terminal.api.models.profile.Profile
import shop.terminal.api.models.subscription.Subscription
import shop.terminal.api.models.token.Token

class ViewInitResponse
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * Initial app data.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [ViewInitResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ViewInitResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(viewInitResponse: ViewInitResponse) = apply {
            data = viewInitResponse.data
            additionalProperties = viewInitResponse.additionalProperties.toMutableMap()
        }

        /** Initial app data. */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [ViewInitResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ViewInitResponse =
            ViewInitResponse(checkRequired("data", data), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ViewInitResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    internal fun validity(): Int = (data.asKnown()?.validity() ?: 0)

    /** Initial app data. */
    class Data
    private constructor(
        private val addresses: JsonField<List<Address>>,
        private val apps: JsonField<List<App>>,
        private val cards: JsonField<List<Card>>,
        private val cart: JsonField<Cart>,
        private val orders: JsonField<List<Order>>,
        private val products: JsonField<List<Product>>,
        private val profile: JsonField<Profile>,
        private val region: JsonField<Region>,
        private val subscriptions: JsonField<List<Subscription>>,
        private val tokens: JsonField<List<Token>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("addresses")
            @ExcludeMissing
            addresses: JsonField<List<Address>> = JsonMissing.of(),
            @JsonProperty("apps") @ExcludeMissing apps: JsonField<List<App>> = JsonMissing.of(),
            @JsonProperty("cards") @ExcludeMissing cards: JsonField<List<Card>> = JsonMissing.of(),
            @JsonProperty("cart") @ExcludeMissing cart: JsonField<Cart> = JsonMissing.of(),
            @JsonProperty("orders")
            @ExcludeMissing
            orders: JsonField<List<Order>> = JsonMissing.of(),
            @JsonProperty("products")
            @ExcludeMissing
            products: JsonField<List<Product>> = JsonMissing.of(),
            @JsonProperty("profile") @ExcludeMissing profile: JsonField<Profile> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<Region> = JsonMissing.of(),
            @JsonProperty("subscriptions")
            @ExcludeMissing
            subscriptions: JsonField<List<Subscription>> = JsonMissing.of(),
            @JsonProperty("tokens")
            @ExcludeMissing
            tokens: JsonField<List<Token>> = JsonMissing.of(),
        ) : this(
            addresses,
            apps,
            cards,
            cart,
            orders,
            products,
            profile,
            region,
            subscriptions,
            tokens,
            mutableMapOf(),
        )

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun addresses(): List<Address> = addresses.getRequired("addresses")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun apps(): List<App> = apps.getRequired("apps")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cards(): List<Card> = cards.getRequired("cards")

        /**
         * The current Terminal shop user's cart.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cart(): Cart = cart.getRequired("cart")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun orders(): List<Order> = orders.getRequired("orders")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun products(): List<Product> = products.getRequired("products")

        /**
         * A Terminal shop user's profile. (We have users, btw.)
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun profile(): Profile = profile.getRequired("profile")

        /**
         * A Terminal shop user's region.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): Region = region.getRequired("region")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptions(): List<Subscription> = subscriptions.getRequired("subscriptions")

        /**
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tokens(): List<Token> = tokens.getRequired("tokens")

        /**
         * Returns the raw JSON value of [addresses].
         *
         * Unlike [addresses], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addresses")
        @ExcludeMissing
        fun _addresses(): JsonField<List<Address>> = addresses

        /**
         * Returns the raw JSON value of [apps].
         *
         * Unlike [apps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("apps") @ExcludeMissing fun _apps(): JsonField<List<App>> = apps

        /**
         * Returns the raw JSON value of [cards].
         *
         * Unlike [cards], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cards") @ExcludeMissing fun _cards(): JsonField<List<Card>> = cards

        /**
         * Returns the raw JSON value of [cart].
         *
         * Unlike [cart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cart") @ExcludeMissing fun _cart(): JsonField<Cart> = cart

        /**
         * Returns the raw JSON value of [orders].
         *
         * Unlike [orders], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("orders") @ExcludeMissing fun _orders(): JsonField<List<Order>> = orders

        /**
         * Returns the raw JSON value of [products].
         *
         * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("products")
        @ExcludeMissing
        fun _products(): JsonField<List<Product>> = products

        /**
         * Returns the raw JSON value of [profile].
         *
         * Unlike [profile], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonField<Profile> = profile

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<Region> = region

        /**
         * Returns the raw JSON value of [subscriptions].
         *
         * Unlike [subscriptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriptions")
        @ExcludeMissing
        fun _subscriptions(): JsonField<List<Subscription>> = subscriptions

        /**
         * Returns the raw JSON value of [tokens].
         *
         * Unlike [tokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tokens") @ExcludeMissing fun _tokens(): JsonField<List<Token>> = tokens

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .addresses()
             * .apps()
             * .cards()
             * .cart()
             * .orders()
             * .products()
             * .profile()
             * .region()
             * .subscriptions()
             * .tokens()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var addresses: JsonField<MutableList<Address>>? = null
            private var apps: JsonField<MutableList<App>>? = null
            private var cards: JsonField<MutableList<Card>>? = null
            private var cart: JsonField<Cart>? = null
            private var orders: JsonField<MutableList<Order>>? = null
            private var products: JsonField<MutableList<Product>>? = null
            private var profile: JsonField<Profile>? = null
            private var region: JsonField<Region>? = null
            private var subscriptions: JsonField<MutableList<Subscription>>? = null
            private var tokens: JsonField<MutableList<Token>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                addresses = data.addresses.map { it.toMutableList() }
                apps = data.apps.map { it.toMutableList() }
                cards = data.cards.map { it.toMutableList() }
                cart = data.cart
                orders = data.orders.map { it.toMutableList() }
                products = data.products.map { it.toMutableList() }
                profile = data.profile
                region = data.region
                subscriptions = data.subscriptions.map { it.toMutableList() }
                tokens = data.tokens.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun addresses(addresses: List<Address>) = addresses(JsonField.of(addresses))

            /**
             * Sets [Builder.addresses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addresses] with a well-typed `List<Address>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addresses(addresses: JsonField<List<Address>>) = apply {
                this.addresses = addresses.map { it.toMutableList() }
            }

            /**
             * Adds a single [Address] to [addresses].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddress(address: Address) = apply {
                addresses =
                    (addresses ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addresses", it).add(address)
                    }
            }

            fun apps(apps: List<App>) = apps(JsonField.of(apps))

            /**
             * Sets [Builder.apps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apps] with a well-typed `List<App>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apps(apps: JsonField<List<App>>) = apply {
                this.apps = apps.map { it.toMutableList() }
            }

            /**
             * Adds a single [App] to [apps].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApp(app: App) = apply {
                apps =
                    (apps ?: JsonField.of(mutableListOf())).also { checkKnown("apps", it).add(app) }
            }

            fun cards(cards: List<Card>) = cards(JsonField.of(cards))

            /**
             * Sets [Builder.cards] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cards] with a well-typed `List<Card>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cards(cards: JsonField<List<Card>>) = apply {
                this.cards = cards.map { it.toMutableList() }
            }

            /**
             * Adds a single [Card] to [cards].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCard(card: Card) = apply {
                cards =
                    (cards ?: JsonField.of(mutableListOf())).also {
                        checkKnown("cards", it).add(card)
                    }
            }

            /** The current Terminal shop user's cart. */
            fun cart(cart: Cart) = cart(JsonField.of(cart))

            /**
             * Sets [Builder.cart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cart] with a well-typed [Cart] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cart(cart: JsonField<Cart>) = apply { this.cart = cart }

            fun orders(orders: List<Order>) = orders(JsonField.of(orders))

            /**
             * Sets [Builder.orders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orders] with a well-typed `List<Order>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orders(orders: JsonField<List<Order>>) = apply {
                this.orders = orders.map { it.toMutableList() }
            }

            /**
             * Adds a single [Order] to [orders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOrder(order: Order) = apply {
                orders =
                    (orders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("orders", it).add(order)
                    }
            }

            fun products(products: List<Product>) = products(JsonField.of(products))

            /**
             * Sets [Builder.products] to an arbitrary JSON value.
             *
             * You should usually call [Builder.products] with a well-typed `List<Product>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun products(products: JsonField<List<Product>>) = apply {
                this.products = products.map { it.toMutableList() }
            }

            /**
             * Adds a single [Product] to [products].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProduct(product: Product) = apply {
                products =
                    (products ?: JsonField.of(mutableListOf())).also {
                        checkKnown("products", it).add(product)
                    }
            }

            /** A Terminal shop user's profile. (We have users, btw.) */
            fun profile(profile: Profile) = profile(JsonField.of(profile))

            /**
             * Sets [Builder.profile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.profile] with a well-typed [Profile] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun profile(profile: JsonField<Profile>) = apply { this.profile = profile }

            /** A Terminal shop user's region. */
            fun region(region: Region) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [Region] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<Region>) = apply { this.region = region }

            fun subscriptions(subscriptions: List<Subscription>) =
                subscriptions(JsonField.of(subscriptions))

            /**
             * Sets [Builder.subscriptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptions] with a well-typed
             * `List<Subscription>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun subscriptions(subscriptions: JsonField<List<Subscription>>) = apply {
                this.subscriptions = subscriptions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Subscription] to [subscriptions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSubscription(subscription: Subscription) = apply {
                subscriptions =
                    (subscriptions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("subscriptions", it).add(subscription)
                    }
            }

            fun tokens(tokens: List<Token>) = tokens(JsonField.of(tokens))

            /**
             * Sets [Builder.tokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokens] with a well-typed `List<Token>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokens(tokens: JsonField<List<Token>>) = apply {
                this.tokens = tokens.map { it.toMutableList() }
            }

            /**
             * Adds a single [Token] to [tokens].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addToken(token: Token) = apply {
                tokens =
                    (tokens ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tokens", it).add(token)
                    }
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .addresses()
             * .apps()
             * .cards()
             * .cart()
             * .orders()
             * .products()
             * .profile()
             * .region()
             * .subscriptions()
             * .tokens()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("addresses", addresses).map { it.toImmutable() },
                    checkRequired("apps", apps).map { it.toImmutable() },
                    checkRequired("cards", cards).map { it.toImmutable() },
                    checkRequired("cart", cart),
                    checkRequired("orders", orders).map { it.toImmutable() },
                    checkRequired("products", products).map { it.toImmutable() },
                    checkRequired("profile", profile),
                    checkRequired("region", region),
                    checkRequired("subscriptions", subscriptions).map { it.toImmutable() },
                    checkRequired("tokens", tokens).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            addresses().forEach { it.validate() }
            apps().forEach { it.validate() }
            cards().forEach { it.validate() }
            cart().validate()
            orders().forEach { it.validate() }
            products().forEach { it.validate() }
            profile().validate()
            region().validate()
            subscriptions().forEach { it.validate() }
            tokens().forEach { it.validate() }
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
            (addresses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (apps.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (cards.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (cart.asKnown()?.validity() ?: 0) +
                (orders.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (products.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (profile.asKnown()?.validity() ?: 0) +
                (region.asKnown()?.validity() ?: 0) +
                (subscriptions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (tokens.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && addresses == other.addresses && apps == other.apps && cards == other.cards && cart == other.cart && orders == other.orders && products == other.products && profile == other.profile && region == other.region && subscriptions == other.subscriptions && tokens == other.tokens && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addresses, apps, cards, cart, orders, products, profile, region, subscriptions, tokens, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{addresses=$addresses, apps=$apps, cards=$cards, cart=$cart, orders=$orders, products=$products, profile=$profile, region=$region, subscriptions=$subscriptions, tokens=$tokens, additionalProperties=$additionalProperties}"
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
