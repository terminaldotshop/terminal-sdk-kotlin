// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

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
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable

@NoAutoDetect
class TokenGetResponse
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Token> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A personal access token used to access the Terminal API. If you leak this, expect large sums
     * of coffee to be ordered on your credit card.
     */
    fun data(): Token = data.getRequired("data")

    /**
     * A personal access token used to access the Terminal API. If you leak this, expect large sums
     * of coffee to be ordered on your credit card.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Token> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

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

        private var data: JsonField<Token>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tokenGetResponse: TokenGetResponse) = apply {
            data = tokenGetResponse.data
            additionalProperties = tokenGetResponse.additionalProperties.toMutableMap()
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
        fun data(data: JsonField<Token>) = apply { this.data = data }

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

        fun build(): TokenGetResponse =
            TokenGetResponse(
                checkNotNull(data) { "`data` is required but was not set" },
                additionalProperties.toImmutable()
            )
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
