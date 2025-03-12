// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.profile

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

/** A Terminal shop user's profile. (We have users, btw.) */
@NoAutoDetect
class Profile
@JsonCreator
private constructor(
    @JsonProperty("user") @ExcludeMissing private val user: JsonField<User> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A Terminal shop user. (We have users, btw.) */
    fun user(): User = user.getRequired("user")

    /** A Terminal shop user. (We have users, btw.) */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Profile = apply {
        if (validated) {
            return@apply
        }

        user().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Profile].
         *
         * The following fields are required:
         * ```kotlin
         * .user()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Profile]. */
    class Builder internal constructor() {

        private var user: JsonField<User>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(profile: Profile) = apply {
            user = profile.user
            additionalProperties = profile.additionalProperties.toMutableMap()
        }

        /** A Terminal shop user. (We have users, btw.) */
        fun user(user: User) = user(JsonField.of(user))

        /** A Terminal shop user. (We have users, btw.) */
        fun user(user: JsonField<User>) = apply { this.user = user }

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

        fun build(): Profile =
            Profile(checkRequired("user", user), additionalProperties.toImmutable())
    }

    /** A Terminal shop user. (We have users, btw.) */
    @NoAutoDetect
    class User
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fingerprint")
        @ExcludeMissing
        private val fingerprint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stripeCustomerID")
        @ExcludeMissing
        private val stripeCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(): String = id.getRequired("id")

        /** Email address of the user. */
        fun email(): String? = email.getNullable("email")

        /** The user's fingerprint, derived from their public SSH key. */
        fun fingerprint(): String? = fingerprint.getNullable("fingerprint")

        /** Name of the user. */
        fun name(): String? = name.getNullable("name")

        /** Stripe customer ID of the user. */
        fun stripeCustomerId(): String = stripeCustomerId.getRequired("stripeCustomerID")

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** Email address of the user. */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /** The user's fingerprint, derived from their public SSH key. */
        @JsonProperty("fingerprint")
        @ExcludeMissing
        fun _fingerprint(): JsonField<String> = fingerprint

        /** Name of the user. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Stripe customer ID of the user. */
        @JsonProperty("stripeCustomerID")
        @ExcludeMissing
        fun _stripeCustomerId(): JsonField<String> = stripeCustomerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): User = apply {
            if (validated) {
                return@apply
            }

            id()
            email()
            fingerprint()
            name()
            stripeCustomerId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [User].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .email()
             * .fingerprint()
             * .name()
             * .stripeCustomerId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [User]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var fingerprint: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var stripeCustomerId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(user: User) = apply {
                id = user.id
                email = user.email
                fingerprint = user.fingerprint
                name = user.name
                stripeCustomerId = user.stripeCustomerId
                additionalProperties = user.additionalProperties.toMutableMap()
            }

            /** Unique object identifier. The format and length of IDs may change over time. */
            fun id(id: String) = id(JsonField.of(id))

            /** Unique object identifier. The format and length of IDs may change over time. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Email address of the user. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** Email address of the user. */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** The user's fingerprint, derived from their public SSH key. */
            fun fingerprint(fingerprint: String?) = fingerprint(JsonField.ofNullable(fingerprint))

            /** The user's fingerprint, derived from their public SSH key. */
            fun fingerprint(fingerprint: JsonField<String>) = apply {
                this.fingerprint = fingerprint
            }

            /** Name of the user. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Name of the user. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Stripe customer ID of the user. */
            fun stripeCustomerId(stripeCustomerId: String) =
                stripeCustomerId(JsonField.of(stripeCustomerId))

            /** Stripe customer ID of the user. */
            fun stripeCustomerId(stripeCustomerId: JsonField<String>) = apply {
                this.stripeCustomerId = stripeCustomerId
            }

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

            fun build(): User =
                User(
                    checkRequired("id", id),
                    checkRequired("email", email),
                    checkRequired("fingerprint", fingerprint),
                    checkRequired("name", name),
                    checkRequired("stripeCustomerId", stripeCustomerId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is User && id == other.id && email == other.email && fingerprint == other.fingerprint && name == other.name && stripeCustomerId == other.stripeCustomerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, email, fingerprint, name, stripeCustomerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "User{id=$id, email=$email, fingerprint=$fingerprint, name=$name, stripeCustomerId=$stripeCustomerId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Profile && user == other.user && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(user, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "Profile{user=$user, additionalProperties=$additionalProperties}"
}
