// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import shop.terminal.core.ExcludeMissing
import shop.terminal.core.JsonField
import shop.terminal.core.JsonMissing
import shop.terminal.core.JsonValue
import shop.terminal.core.NoAutoDetect
import shop.terminal.core.toImmutable

@JsonDeserialize(builder = AddressCreateResponse.Builder::class)
@NoAutoDetect
class AddressCreateResponse
private constructor(
    private val data: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Shipping address ID. */
    fun data(): String = data.getRequired("data")

    /** Shipping address ID. */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AddressCreateResponse = apply {
        if (!validated) {
            data()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(addressCreateResponse: AddressCreateResponse) = apply {
            this.data = addressCreateResponse.data
            additionalProperties(addressCreateResponse.additionalProperties)
        }

        /** Shipping address ID. */
        fun data(data: String) = data(JsonField.of(data))

        /** Shipping address ID. */
        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<String>) = apply { this.data = data }

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

        fun build(): AddressCreateResponse =
            AddressCreateResponse(data, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AddressCreateResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AddressCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
