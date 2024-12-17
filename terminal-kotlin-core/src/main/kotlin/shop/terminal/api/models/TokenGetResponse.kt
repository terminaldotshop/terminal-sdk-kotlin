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

@JsonDeserialize(builder = TokenGetResponse.Builder::class)
@NoAutoDetect
class TokenGetResponse
private constructor(
    private val data: JsonField<Token>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * A personal access token used to access the Terminal API. If you leak this, expect large sums
     * of coffee to be ordered on your credit card.
     */
    fun data(): Token = data.getRequired("data")

    /**
     * A personal access token used to access the Terminal API. If you leak this, expect large sums
     * of coffee to be ordered on your credit card.
     */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TokenGetResponse = apply {
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

        private var data: JsonField<Token> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tokenGetResponse: TokenGetResponse) = apply {
            this.data = tokenGetResponse.data
            additionalProperties(tokenGetResponse.additionalProperties)
        }

        /**
         * A personal access token used to access the Terminal API. If you leak this, expect large
         * sums of coffee to be ordered on your credit card.
         */
        fun data(data: Token) = data(JsonField.of(data))

        /**
         * A personal access token used to access the Terminal API. If you leak this, expect large
         * sums of coffee to be ordered on your credit card.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Token>) = apply { this.data = data }

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

        fun build(): TokenGetResponse = TokenGetResponse(data, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenGetResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenGetResponse{data=$data, additionalProperties=$additionalProperties}"
}
