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

/**
 * A personal access token used to access the Terminal API. If you leak this, expect large sums of
 * coffee to be ordered on your credit card.
 */
@JsonDeserialize(builder = Token.Builder::class)
@NoAutoDetect
class Token
private constructor(
    private val id: JsonField<String>,
    private val time: JsonField<Time>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** Relevant timestamps for the token. */
    fun time(): Time = time.getRequired("time")

    /** Personal access token (obfuscated). */
    fun token(): String = token.getRequired("token")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Relevant timestamps for the token. */
    @JsonProperty("time") @ExcludeMissing fun _time() = time

    /** Personal access token (obfuscated). */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Token = apply {
        if (!validated) {
            id()
            time().validate()
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
        private var time: JsonField<Time> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(token: Token) = apply {
            this.id = token.id
            this.time = token.time
            this.token = token.token
            additionalProperties(token.additionalProperties)
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Relevant timestamps for the token. */
        fun time(time: Time) = time(JsonField.of(time))

        /** Relevant timestamps for the token. */
        @JsonProperty("time")
        @ExcludeMissing
        fun time(time: JsonField<Time>) = apply { this.time = time }

        /** Personal access token (obfuscated). */
        fun token(token: String) = token(JsonField.of(token))

        /** Personal access token (obfuscated). */
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

        fun build(): Token =
            Token(
                id,
                time,
                token,
                additionalProperties.toImmutable(),
            )
    }

    /** Relevant timestamps for the token. */
    @JsonDeserialize(builder = Time.Builder::class)
    @NoAutoDetect
    class Time
    private constructor(
        private val created: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The created time for the token. */
        fun created(): String = created.getRequired("created")

        /** The created time for the token. */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Time = apply {
            if (!validated) {
                created()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var created: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(time: Time) = apply {
                this.created = time.created
                additionalProperties(time.additionalProperties)
            }

            /** The created time for the token. */
            fun created(created: String) = created(JsonField.of(created))

            /** The created time for the token. */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<String>) = apply { this.created = created }

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

            fun build(): Time = Time(created, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Time && created == other.created && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(created, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Time{created=$created, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Token && id == other.id && time == other.time && token == other.token && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, time, token, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Token{id=$id, time=$time, token=$token, additionalProperties=$additionalProperties}"
}
