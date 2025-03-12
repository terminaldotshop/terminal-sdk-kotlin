// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.token

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

/**
 * A personal access token used to access the Terminal API. If you leak this,
 * expect large sums of coffee to be ordered on your credit card.
 */
@NoAutoDetect
class Token @JsonCreator private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created") @ExcludeMissing private val created: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** Personal access token (obfuscated). */
    fun token(): String = token.getRequired("token")

    /** The created time for the token. */
    fun created(): String = created.getRequired("created")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    /** Personal access token (obfuscated). */
    @JsonProperty("token")
    @ExcludeMissing
    fun _token(): JsonField<String> = token

    /** The created time for the token. */
    @JsonProperty("created")
    @ExcludeMissing
    fun _created(): JsonField<String> = created

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Token =
        apply {
            if (validated) {
              return@apply
            }

            id()
            token()
            created()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Token].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .id()
         * .token()
         * .created()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Token]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var token: JsonField<String>? = null
        private var created: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(token: Token) =
            apply {
                id = token.id
                this.token = token.token
                created = token.created
                additionalProperties = token.additionalProperties.toMutableMap()
            }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /** Personal access token (obfuscated). */
        fun token(token: String) = token(JsonField.of(token))

        /** Personal access token (obfuscated). */
        fun token(token: JsonField<String>) =
            apply {
                this.token = token
            }

        /** The created time for the token. */
        fun created(created: String) = created(JsonField.of(created))

        /** The created time for the token. */
        fun created(created: JsonField<String>) =
            apply {
                this.created = created
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

        fun build(): Token =
            Token(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "token", token
              ),
              checkRequired(
                "created", created
              ),
              additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is Token && id == other.id && token == other.token && created == other.created && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, token, created, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "Token{id=$id, token=$token, created=$created, additionalProperties=$additionalProperties}"
}
