// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

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
class AddressGetResponse @JsonCreator private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Address> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** Physical address associated with a Terminal shop user. */
    fun data(): Address = data.getRequired("data")

    /** Physical address associated with a Terminal shop user. */
    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<Address> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AddressGetResponse =
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
         * Returns a mutable builder for constructing an instance of [AddressGetResponse].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AddressGetResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Address>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(addressGetResponse: AddressGetResponse) =
            apply {
                data = addressGetResponse.data
                additionalProperties = addressGetResponse.additionalProperties.toMutableMap()
            }

        /** Physical address associated with a Terminal shop user. */
        fun data(data: Address) = data(JsonField.of(data))

        /** Physical address associated with a Terminal shop user. */
        fun data(data: JsonField<Address>) =
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

        fun build(): AddressGetResponse =
            AddressGetResponse(
              checkRequired(
                "data", data
              ), additionalProperties.toImmutable()
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is AddressGetResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "AddressGetResponse{data=$data, additionalProperties=$additionalProperties}"
}
