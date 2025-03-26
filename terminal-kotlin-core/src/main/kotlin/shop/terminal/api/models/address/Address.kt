// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.address

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonField
import shop.terminal.api.core.JsonMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.checkRequired
import shop.terminal.api.errors.TerminalInvalidDataException

/** Physical address associated with a Terminal shop user. */
class Address
private constructor(
    private val id: JsonField<String>,
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val name: JsonField<String>,
    private val street1: JsonField<String>,
    private val zip: JsonField<String>,
    private val phone: JsonField<String>,
    private val province: JsonField<String>,
    private val street2: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street1") @ExcludeMissing street1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("province") @ExcludeMissing province: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street2") @ExcludeMissing street2: JsonField<String> = JsonMissing.of(),
    ) : this(id, city, country, name, street1, zip, phone, province, street2, mutableMapOf())

    /**
     * Unique object identifier. The format and length of IDs may change over time.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * City of the address.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun city(): String = city.getRequired("city")

    /**
     * ISO 3166-1 alpha-2 country code of the address.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * The recipient's name.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Street of the address.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun street1(): String = street1.getRequired("street1")

    /**
     * Zip code of the address.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun zip(): String = zip.getRequired("zip")

    /**
     * Phone number of the recipient.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phone(): String? = phone.getNullable("phone")

    /**
     * Province or state of the address.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun province(): String? = province.getNullable("province")

    /**
     * Apartment, suite, etc. of the address.
     *
     * @throws TerminalInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun street2(): String? = street2.getNullable("street2")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [street1].
     *
     * Unlike [street1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street1") @ExcludeMissing fun _street1(): JsonField<String> = street1

    /**
     * Returns the raw JSON value of [zip].
     *
     * Unlike [zip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

    /**
     * Returns the raw JSON value of [province].
     *
     * Unlike [province], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("province") @ExcludeMissing fun _province(): JsonField<String> = province

    /**
     * Returns the raw JSON value of [street2].
     *
     * Unlike [street2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street2") @ExcludeMissing fun _street2(): JsonField<String> = street2

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Address].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .city()
         * .country()
         * .name()
         * .street1()
         * .zip()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Address]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var city: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var street1: JsonField<String>? = null
        private var zip: JsonField<String>? = null
        private var phone: JsonField<String> = JsonMissing.of()
        private var province: JsonField<String> = JsonMissing.of()
        private var street2: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(address: Address) = apply {
            id = address.id
            city = address.city
            country = address.country
            name = address.name
            street1 = address.street1
            zip = address.zip
            phone = address.phone
            province = address.province
            street2 = address.street2
            additionalProperties = address.additionalProperties.toMutableMap()
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** City of the address. */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** ISO 3166-1 alpha-2 country code of the address. */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** The recipient's name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Street of the address. */
        fun street1(street1: String) = street1(JsonField.of(street1))

        /**
         * Sets [Builder.street1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.street1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun street1(street1: JsonField<String>) = apply { this.street1 = street1 }

        /** Zip code of the address. */
        fun zip(zip: String) = zip(JsonField.of(zip))

        /**
         * Sets [Builder.zip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zip] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zip(zip: JsonField<String>) = apply { this.zip = zip }

        /** Phone number of the recipient. */
        fun phone(phone: String) = phone(JsonField.of(phone))

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { this.phone = phone }

        /** Province or state of the address. */
        fun province(province: String) = province(JsonField.of(province))

        /**
         * Sets [Builder.province] to an arbitrary JSON value.
         *
         * You should usually call [Builder.province] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun province(province: JsonField<String>) = apply { this.province = province }

        /** Apartment, suite, etc. of the address. */
        fun street2(street2: String) = street2(JsonField.of(street2))

        /**
         * Sets [Builder.street2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.street2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun street2(street2: JsonField<String>) = apply { this.street2 = street2 }

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

        /**
         * Returns an immutable instance of [Address].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .city()
         * .country()
         * .name()
         * .street1()
         * .zip()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Address =
            Address(
                checkRequired("id", id),
                checkRequired("city", city),
                checkRequired("country", country),
                checkRequired("name", name),
                checkRequired("street1", street1),
                checkRequired("zip", zip),
                phone,
                province,
                street2,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Address = apply {
        if (validated) {
            return@apply
        }

        id()
        city()
        country()
        name()
        street1()
        zip()
        phone()
        province()
        street2()
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Address && id == other.id && city == other.city && country == other.country && name == other.name && street1 == other.street1 && zip == other.zip && phone == other.phone && province == other.province && street2 == other.street2 && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, city, country, name, street1, zip, phone, province, street2, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Address{id=$id, city=$city, country=$country, name=$name, street1=$street1, zip=$zip, phone=$phone, province=$province, street2=$street2, additionalProperties=$additionalProperties}"
}
