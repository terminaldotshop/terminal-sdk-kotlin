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

@JsonDeserialize(builder = ProductListResponse.Builder::class)
@NoAutoDetect
class ProductListResponse
private constructor(
    private val data: JsonField<List<Product>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** A list of products. */
    fun data(): List<Product> = data.getRequired("data")

    /** A list of products. */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProductListResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Product>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(productListResponse: ProductListResponse) = apply {
            this.data = productListResponse.data
            additionalProperties(productListResponse.additionalProperties)
        }

        /** A list of products. */
        fun data(data: List<Product>) = data(JsonField.of(data))

        /** A list of products. */
        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Product>>) = apply { this.data = data }

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

        fun build(): ProductListResponse =
            ProductListResponse(data.map { it.toImmutable() }, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductListResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductListResponse{data=$data, additionalProperties=$additionalProperties}"
}
