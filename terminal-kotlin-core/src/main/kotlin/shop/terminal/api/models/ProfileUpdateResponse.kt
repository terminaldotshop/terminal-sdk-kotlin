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

@JsonDeserialize(builder = ProfileUpdateResponse.Builder::class)
@NoAutoDetect
class ProfileUpdateResponse
private constructor(
    private val data: JsonField<Profile>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** A Terminal shop user's profile. (We have users, btw.) */
    fun data(): Profile = data.getRequired("data")

    /** A Terminal shop user's profile. (We have users, btw.) */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProfileUpdateResponse = apply {
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

        private var data: JsonField<Profile> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(profileUpdateResponse: ProfileUpdateResponse) = apply {
            this.data = profileUpdateResponse.data
            additionalProperties(profileUpdateResponse.additionalProperties)
        }

        /** A Terminal shop user's profile. (We have users, btw.) */
        fun data(data: Profile) = data(JsonField.of(data))

        /** A Terminal shop user's profile. (We have users, btw.) */
        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Profile>) = apply { this.data = data }

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

        fun build(): ProfileUpdateResponse =
            ProfileUpdateResponse(data, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProfileUpdateResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProfileUpdateResponse{data=$data, additionalProperties=$additionalProperties}"
}
