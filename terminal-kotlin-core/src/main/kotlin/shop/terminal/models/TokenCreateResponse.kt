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

@JsonDeserialize(builder = TokenCreateResponse.Builder::class)
@NoAutoDetect
class TokenCreateResponse
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun data(): Data = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TokenCreateResponse = apply {
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

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tokenCreateResponse: TokenCreateResponse) = apply {
            this.data = tokenCreateResponse.data
            additionalProperties(tokenCreateResponse.additionalProperties)
        }

        fun data(data: Data) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Data>) = apply { this.data = data }

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

        fun build(): TokenCreateResponse =
            TokenCreateResponse(data, additionalProperties.toImmutable())
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val id: JsonField<String>,
        private val token: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Personal token ID. */
        fun id(): String = id.getRequired("id")

        /**
         * Personal access token. Include this in the Authorization header (`Bearer <token>`) when
         * accessing the Terminal API.
         */
        fun token(): String = token.getRequired("token")

        /** Personal token ID. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * Personal access token. Include this in the Authorization header (`Bearer <token>`) when
         * accessing the Terminal API.
         */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                id()
                token()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                this.id = data.id
                this.token = data.token
                additionalProperties(data.additionalProperties)
            }

            /** Personal token ID. */
            fun id(id: String) = id(JsonField.of(id))

            /** Personal token ID. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Personal access token. Include this in the Authorization header (`Bearer <token>`)
             * when accessing the Terminal API.
             */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Personal access token. Include this in the Authorization header (`Bearer <token>`)
             * when accessing the Terminal API.
             */
            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

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

            fun build(): Data =
                Data(
                    id,
                    token,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && id == other.id && token == other.token && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, token, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, token=$token, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenCreateResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
