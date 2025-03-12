// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.subscription

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
class SubscriptionGetResponse @JsonCreator private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Subscription> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** Subscription to a Terminal shop product. */
    fun data(): Subscription = data.getRequired("data")

    /** Subscription to a Terminal shop product. */
    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<Subscription> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SubscriptionGetResponse =
        apply {
            if (validated) {
              return@apply
            }

            data().validate()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionGetResponse].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionGetResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Subscription>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionGetResponse: SubscriptionGetResponse) =
            apply {
                data = subscriptionGetResponse.data
                additionalProperties = subscriptionGetResponse.additionalProperties.toMutableMap()
            }

        /** Subscription to a Terminal shop product. */
        fun data(data: Subscription) = data(JsonField.of(data))

        /** Subscription to a Terminal shop product. */
        fun data(data: JsonField<Subscription>) =
            apply {
                this.data = data
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

        fun build(): SubscriptionGetResponse =
            SubscriptionGetResponse(
              checkRequired(
                "data", data
              ), additionalProperties.toImmutable()
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is SubscriptionGetResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "SubscriptionGetResponse{data=$data, additionalProperties=$additionalProperties}"
}
