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
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable

@NoAutoDetect
class CartRedeemGiftCardResponse
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Gift card redemption result */
    fun data(): Data = data.getRequired("data")

    /** Gift card redemption result */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CartRedeemGiftCardResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CartRedeemGiftCardResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CartRedeemGiftCardResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cartRedeemGiftCardResponse: CartRedeemGiftCardResponse) = apply {
            data = cartRedeemGiftCardResponse.data
            additionalProperties = cartRedeemGiftCardResponse.additionalProperties.toMutableMap()
        }

        /** Gift card redemption result */
        fun data(data: Data) = data(JsonField.of(data))

        /** Gift card redemption result */
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

        fun build(): CartRedeemGiftCardResponse =
            CartRedeemGiftCardResponse(
                checkRequired("data", data),
                additionalProperties.toImmutable(),
            )
    }

    /** Gift card redemption result */
    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("appliedAmount")
        @ExcludeMissing
        private val appliedAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("giftCardID")
        @ExcludeMissing
        private val giftCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remainingBalance")
        @ExcludeMissing
        private val remainingBalance: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun appliedAmount(): Long = appliedAmount.getRequired("appliedAmount")

        fun giftCardId(): String = giftCardId.getRequired("giftCardID")

        fun remainingBalance(): Long = remainingBalance.getRequired("remainingBalance")

        @JsonProperty("appliedAmount")
        @ExcludeMissing
        fun _appliedAmount(): JsonField<Long> = appliedAmount

        @JsonProperty("giftCardID")
        @ExcludeMissing
        fun _giftCardId(): JsonField<String> = giftCardId

        @JsonProperty("remainingBalance")
        @ExcludeMissing
        fun _remainingBalance(): JsonField<Long> = remainingBalance

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            appliedAmount()
            giftCardId()
            remainingBalance()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .appliedAmount()
             * .giftCardId()
             * .remainingBalance()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var appliedAmount: JsonField<Long>? = null
            private var giftCardId: JsonField<String>? = null
            private var remainingBalance: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                appliedAmount = data.appliedAmount
                giftCardId = data.giftCardId
                remainingBalance = data.remainingBalance
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun appliedAmount(appliedAmount: Long) = appliedAmount(JsonField.of(appliedAmount))

            fun appliedAmount(appliedAmount: JsonField<Long>) = apply {
                this.appliedAmount = appliedAmount
            }

            fun giftCardId(giftCardId: String) = giftCardId(JsonField.of(giftCardId))

            fun giftCardId(giftCardId: JsonField<String>) = apply { this.giftCardId = giftCardId }

            fun remainingBalance(remainingBalance: Long) =
                remainingBalance(JsonField.of(remainingBalance))

            fun remainingBalance(remainingBalance: JsonField<Long>) = apply {
                this.remainingBalance = remainingBalance
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

            fun build(): Data =
                Data(
                    checkRequired("appliedAmount", appliedAmount),
                    checkRequired("giftCardId", giftCardId),
                    checkRequired("remainingBalance", remainingBalance),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && appliedAmount == other.appliedAmount && giftCardId == other.giftCardId && remainingBalance == other.remainingBalance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliedAmount, giftCardId, remainingBalance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{appliedAmount=$appliedAmount, giftCardId=$giftCardId, remainingBalance=$remainingBalance, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CartRedeemGiftCardResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CartRedeemGiftCardResponse{data=$data, additionalProperties=$additionalProperties}"
}
