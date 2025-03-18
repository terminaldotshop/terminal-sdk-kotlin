// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.order

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
import shop.terminal.api.core.Params
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.http.Headers
import shop.terminal.api.core.http.QueryParams
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable
import shop.terminal.api.errors.TerminalInvalidDataException

/** Create an order without a cart. The order will be placed immediately. */
class OrderCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Shipping address ID.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun addressId(): String = body.addressId()

    /**
     * Card ID.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardId(): String = body.cardId()

    /**
     * Product variants to include in the order, along with their quantities.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun variants(): Variants = body.variants()

    /**
     * Returns the raw JSON value of [addressId].
     *
     * Unlike [addressId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addressId(): JsonField<String> = body._addressId()

    /**
     * Returns the raw JSON value of [cardId].
     *
     * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cardId(): JsonField<String> = body._cardId()

    /**
     * Returns the raw JSON value of [variants].
     *
     * Unlike [variants], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _variants(): JsonField<Variants> = body._variants()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Order information. */
    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("addressID")
        @ExcludeMissing
        private val addressId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardID")
        @ExcludeMissing
        private val cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("variants")
        @ExcludeMissing
        private val variants: JsonField<Variants> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Shipping address ID.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun addressId(): String = addressId.getRequired("addressID")

        /**
         * Card ID.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardId(): String = cardId.getRequired("cardID")

        /**
         * Product variants to include in the order, along with their quantities.
         *
         * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun variants(): Variants = variants.getRequired("variants")

        /**
         * Returns the raw JSON value of [addressId].
         *
         * Unlike [addressId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addressID") @ExcludeMissing fun _addressId(): JsonField<String> = addressId

        /**
         * Returns the raw JSON value of [cardId].
         *
         * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cardID") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /**
         * Returns the raw JSON value of [variants].
         *
         * Unlike [variants], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("variants") @ExcludeMissing fun _variants(): JsonField<Variants> = variants

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            addressId()
            cardId()
            variants().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .addressId()
             * .cardId()
             * .variants()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var addressId: JsonField<String>? = null
            private var cardId: JsonField<String>? = null
            private var variants: JsonField<Variants>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                addressId = body.addressId
                cardId = body.cardId
                variants = body.variants
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Shipping address ID. */
            fun addressId(addressId: String) = addressId(JsonField.of(addressId))

            /**
             * Sets [Builder.addressId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addressId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addressId(addressId: JsonField<String>) = apply { this.addressId = addressId }

            /** Card ID. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /**
             * Sets [Builder.cardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** Product variants to include in the order, along with their quantities. */
            fun variants(variants: Variants) = variants(JsonField.of(variants))

            /**
             * Sets [Builder.variants] to an arbitrary JSON value.
             *
             * You should usually call [Builder.variants] with a well-typed [Variants] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun variants(variants: JsonField<Variants>) = apply { this.variants = variants }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .addressId()
             * .cardId()
             * .variants()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("addressId", addressId),
                    checkRequired("cardId", cardId),
                    checkRequired("variants", variants),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && addressId == other.addressId && cardId == other.cardId && variants == other.variants && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addressId, cardId, variants, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{addressId=$addressId, cardId=$cardId, variants=$variants, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrderCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .addressId()
         * .cardId()
         * .variants()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OrderCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(orderCreateParams: OrderCreateParams) = apply {
            body = orderCreateParams.body.toBuilder()
            additionalHeaders = orderCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = orderCreateParams.additionalQueryParams.toBuilder()
        }

        /** Shipping address ID. */
        fun addressId(addressId: String) = apply { body.addressId(addressId) }

        /**
         * Sets [Builder.addressId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addressId(addressId: JsonField<String>) = apply { body.addressId(addressId) }

        /** Card ID. */
        fun cardId(cardId: String) = apply { body.cardId(cardId) }

        /**
         * Sets [Builder.cardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cardId(cardId: JsonField<String>) = apply { body.cardId(cardId) }

        /** Product variants to include in the order, along with their quantities. */
        fun variants(variants: Variants) = apply { body.variants(variants) }

        /**
         * Sets [Builder.variants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variants] with a well-typed [Variants] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun variants(variants: JsonField<Variants>) = apply { body.variants(variants) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [OrderCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .addressId()
         * .cardId()
         * .variants()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrderCreateParams =
            OrderCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Product variants to include in the order, along with their quantities. */
    @NoAutoDetect
    class Variants
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Variants = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Variants]. */
            fun builder() = Builder()
        }

        /** A builder for [Variants]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(variants: Variants) = apply {
                additionalProperties = variants.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Variants].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Variants = Variants(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Variants && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Variants{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrderCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "OrderCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
