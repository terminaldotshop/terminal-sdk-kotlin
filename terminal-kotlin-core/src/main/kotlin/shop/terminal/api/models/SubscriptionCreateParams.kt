// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import shop.terminal.api.core.Enum
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.NoAutoDetect
import shop.terminal.api.core.http.Headers
import shop.terminal.api.core.http.QueryParams
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable
import shop.terminal.api.errors.TerminalInvalidDataException

class SubscriptionCreateParams
constructor(
    private val body: SubscriptionCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = body.id()

    /** ID of the shipping address used for the subscription. */
    fun addressId(): String = body.addressId()

    /** ID of the card used for the subscription. */
    fun cardId(): String = body.cardId()

    /** Frequency of the subscription. */
    fun frequency(): Frequency = body.frequency()

    /** ID of the product variant being subscribed to. */
    fun productVariantId(): String = body.productVariantId()

    /** Quantity of the subscription. */
    fun quantity(): Long = body.quantity()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): SubscriptionCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    /** Subscription to a Terminal shop product. */
    @NoAutoDetect
    class SubscriptionCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("id") private val id: String,
        @JsonProperty("addressID") private val addressId: String,
        @JsonProperty("cardID") private val cardId: String,
        @JsonProperty("frequency") private val frequency: Frequency,
        @JsonProperty("productVariantID") private val productVariantId: String,
        @JsonProperty("quantity") private val quantity: Long,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") fun id(): String = id

        /** ID of the shipping address used for the subscription. */
        @JsonProperty("addressID") fun addressId(): String = addressId

        /** ID of the card used for the subscription. */
        @JsonProperty("cardID") fun cardId(): String = cardId

        /** Frequency of the subscription. */
        @JsonProperty("frequency") fun frequency(): Frequency = frequency

        /** ID of the product variant being subscribed to. */
        @JsonProperty("productVariantID") fun productVariantId(): String = productVariantId

        /** Quantity of the subscription. */
        @JsonProperty("quantity") fun quantity(): Long = quantity

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var addressId: String? = null
            private var cardId: String? = null
            private var frequency: Frequency? = null
            private var productVariantId: String? = null
            private var quantity: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(subscriptionCreateBody: SubscriptionCreateBody) = apply {
                id = subscriptionCreateBody.id
                addressId = subscriptionCreateBody.addressId
                cardId = subscriptionCreateBody.cardId
                frequency = subscriptionCreateBody.frequency
                productVariantId = subscriptionCreateBody.productVariantId
                quantity = subscriptionCreateBody.quantity
                additionalProperties = subscriptionCreateBody.additionalProperties.toMutableMap()
            }

            /** Unique object identifier. The format and length of IDs may change over time. */
            fun id(id: String) = apply { this.id = id }

            /** ID of the shipping address used for the subscription. */
            fun addressId(addressId: String) = apply { this.addressId = addressId }

            /** ID of the card used for the subscription. */
            fun cardId(cardId: String) = apply { this.cardId = cardId }

            /** Frequency of the subscription. */
            fun frequency(frequency: Frequency) = apply { this.frequency = frequency }

            /** ID of the product variant being subscribed to. */
            fun productVariantId(productVariantId: String) = apply {
                this.productVariantId = productVariantId
            }

            /** Quantity of the subscription. */
            fun quantity(quantity: Long) = apply { this.quantity = quantity }

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

            fun build(): SubscriptionCreateBody =
                SubscriptionCreateBody(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(addressId) { "`addressId` is required but was not set" },
                    checkNotNull(cardId) { "`cardId` is required but was not set" },
                    checkNotNull(frequency) { "`frequency` is required but was not set" },
                    checkNotNull(productVariantId) {
                        "`productVariantId` is required but was not set"
                    },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubscriptionCreateBody && id == other.id && addressId == other.addressId && cardId == other.cardId && frequency == other.frequency && productVariantId == other.productVariantId && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, addressId, cardId, frequency, productVariantId, quantity, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionCreateBody{id=$id, addressId=$addressId, cardId=$cardId, frequency=$frequency, productVariantId=$productVariantId, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: SubscriptionCreateBody.Builder = SubscriptionCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionCreateParams: SubscriptionCreateParams) = apply {
            body = subscriptionCreateParams.body.toBuilder()
            additionalHeaders = subscriptionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionCreateParams.additionalQueryParams.toBuilder()
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = apply { body.id(id) }

        /** ID of the shipping address used for the subscription. */
        fun addressId(addressId: String) = apply { body.addressId(addressId) }

        /** ID of the card used for the subscription. */
        fun cardId(cardId: String) = apply { body.cardId(cardId) }

        /** Frequency of the subscription. */
        fun frequency(frequency: Frequency) = apply { body.frequency(frequency) }

        /** ID of the product variant being subscribed to. */
        fun productVariantId(productVariantId: String) = apply {
            body.productVariantId(productVariantId)
        }

        /** Quantity of the subscription. */
        fun quantity(quantity: Long) = apply { body.quantity(quantity) }

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

        fun build(): SubscriptionCreateParams =
            SubscriptionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Frequency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val FIXED = of("fixed")

            val DAILY = of("daily")

            val WEEKLY = of("weekly")

            val MONTHLY = of("monthly")

            val YEARLY = of("yearly")

            fun of(value: String) = Frequency(JsonField.of(value))
        }

        enum class Known {
            FIXED,
            DAILY,
            WEEKLY,
            MONTHLY,
            YEARLY,
        }

        enum class Value {
            FIXED,
            DAILY,
            WEEKLY,
            MONTHLY,
            YEARLY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FIXED -> Value.FIXED
                DAILY -> Value.DAILY
                WEEKLY -> Value.WEEKLY
                MONTHLY -> Value.MONTHLY
                YEARLY -> Value.YEARLY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FIXED -> Known.FIXED
                DAILY -> Known.DAILY
                WEEKLY -> Known.WEEKLY
                MONTHLY -> Known.MONTHLY
                YEARLY -> Known.YEARLY
                else -> throw TerminalInvalidDataException("Unknown Frequency: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
