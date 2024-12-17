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

/** A Terminal App used for configuring an OAuth 2.0 client. */
@JsonDeserialize(builder = App.Builder::class)
@NoAutoDetect
class App
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val redirectUri: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** Name of the app. */
    fun name(): String = name.getRequired("name")

    /** Redirect URI of the app. */
    fun redirectUri(): String = redirectUri.getRequired("redirectURI")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Name of the app. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Redirect URI of the app. */
    @JsonProperty("redirectURI") @ExcludeMissing fun _redirectUri() = redirectUri

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): App = apply {
        if (!validated) {
            id()
            name()
            redirectUri()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var redirectUri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(app: App) = apply {
            this.id = app.id
            this.name = app.name
            this.redirectUri = app.redirectUri
            additionalProperties(app.additionalProperties)
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the app. */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the app. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Redirect URI of the app. */
        fun redirectUri(redirectUri: String) = redirectUri(JsonField.of(redirectUri))

        /** Redirect URI of the app. */
        @JsonProperty("redirectURI")
        @ExcludeMissing
        fun redirectUri(redirectUri: JsonField<String>) = apply { this.redirectUri = redirectUri }

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

        fun build(): App =
            App(
                id,
                name,
                redirectUri,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is App && id == other.id && name == other.name && redirectUri == other.redirectUri && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, redirectUri, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "App{id=$id, name=$name, redirectUri=$redirectUri, additionalProperties=$additionalProperties}"
}
