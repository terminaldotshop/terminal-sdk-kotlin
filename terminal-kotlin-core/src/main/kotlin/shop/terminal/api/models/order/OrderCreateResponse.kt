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
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable

@NoAutoDetect
class OrderCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Order ID. */
    fun data(): String = data.getRequired("data")

    /** Order ID. */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): OrderCreateResponse = apply {
        if (validated) {
            return@apply
        }

        data()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrderCreateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OrderCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(orderCreateResponse: OrderCreateResponse) = apply {
            data = orderCreateResponse.data
            additionalProperties = orderCreateResponse.additionalProperties.toMutableMap()
        }

        /** Order ID. */
        fun data(data: String) = data(JsonField.of(data))

        /** Order ID. */
        fun data(data: JsonField<String>) = apply { this.data = data }

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

        fun build(): OrderCreateResponse =
            OrderCreateResponse(checkRequired("data", data), additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrderCreateResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrderCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
