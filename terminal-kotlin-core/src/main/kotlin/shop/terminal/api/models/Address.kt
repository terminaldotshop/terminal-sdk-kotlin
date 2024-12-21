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

/** Physical address associated with a Terminal shop user. */
@NoAutoDetect
class Address
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("street1")
    @ExcludeMissing
    private val street1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("street2")
    @ExcludeMissing
    private val street2: JsonField<String> = JsonMissing.of(),
    @JsonProperty("city") @ExcludeMissing private val city: JsonField<String> = JsonMissing.of(),
    @JsonProperty("province")
    @ExcludeMissing
    private val province: JsonField<String> = JsonMissing.of(),
    @JsonProperty("country")
    @ExcludeMissing
    private val country: JsonField<String> = JsonMissing.of(),
    @JsonProperty("zip") @ExcludeMissing private val zip: JsonField<String> = JsonMissing.of(),
    @JsonProperty("phone") @ExcludeMissing private val phone: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique object identifier. The format and length of IDs may change over time. */
    fun id(): String = id.getRequired("id")

    /** The recipient's name. */
    fun name(): String = name.getRequired("name")

    /** Street of the address. */
    fun street1(): String = street1.getRequired("street1")

    /** Apartment, suite, etc. of the address. */
    fun street2(): String? = street2.getNullable("street2")

    /** City of the address. */
    fun city(): String = city.getRequired("city")

    /** Province or state of the address. */
    fun province(): String? = province.getNullable("province")

    /** ISO 3166-1 alpha-2 country code of the address. */
    fun country(): String = country.getRequired("country")

    /** Zip code of the address. */
    fun zip(): String = zip.getRequired("zip")

    /** Phone number of the recipient. */
    fun phone(): String? = phone.getNullable("phone")

    /** Unique object identifier. The format and length of IDs may change over time. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The recipient's name. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Street of the address. */
    @JsonProperty("street1") @ExcludeMissing fun _street1() = street1

    /** Apartment, suite, etc. of the address. */
    @JsonProperty("street2") @ExcludeMissing fun _street2() = street2

    /** City of the address. */
    @JsonProperty("city") @ExcludeMissing fun _city() = city

    /** Province or state of the address. */
    @JsonProperty("province") @ExcludeMissing fun _province() = province

    /** ISO 3166-1 alpha-2 country code of the address. */
    @JsonProperty("country") @ExcludeMissing fun _country() = country

    /** Zip code of the address. */
    @JsonProperty("zip") @ExcludeMissing fun _zip() = zip

    /** Phone number of the recipient. */
    @JsonProperty("phone") @ExcludeMissing fun _phone() = phone

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Address = apply {
        if (!validated) {
            id()
            name()
            street1()
            street2()
            city()
            province()
            country()
            zip()
            phone()
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
        private var street1: JsonField<String> = JsonMissing.of()
        private var street2: JsonField<String> = JsonMissing.of()
        private var city: JsonField<String> = JsonMissing.of()
        private var province: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var zip: JsonField<String> = JsonMissing.of()
        private var phone: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(address: Address) = apply {
            id = address.id
            name = address.name
            street1 = address.street1
            street2 = address.street2
            city = address.city
            province = address.province
            country = address.country
            zip = address.zip
            phone = address.phone
            additionalProperties = address.additionalProperties.toMutableMap()
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The recipient's name. */
        fun name(name: String) = name(JsonField.of(name))

        /** The recipient's name. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Street of the address. */
        fun street1(street1: String) = street1(JsonField.of(street1))

        /** Street of the address. */
        fun street1(street1: JsonField<String>) = apply { this.street1 = street1 }

        /** Apartment, suite, etc. of the address. */
        fun street2(street2: String) = street2(JsonField.of(street2))

        /** Apartment, suite, etc. of the address. */
        fun street2(street2: JsonField<String>) = apply { this.street2 = street2 }

        /** City of the address. */
        fun city(city: String) = city(JsonField.of(city))

        /** City of the address. */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** Province or state of the address. */
        fun province(province: String) = province(JsonField.of(province))

        /** Province or state of the address. */
        fun province(province: JsonField<String>) = apply { this.province = province }

        /** ISO 3166-1 alpha-2 country code of the address. */
        fun country(country: String) = country(JsonField.of(country))

        /** ISO 3166-1 alpha-2 country code of the address. */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Zip code of the address. */
        fun zip(zip: String) = zip(JsonField.of(zip))

        /** Zip code of the address. */
        fun zip(zip: JsonField<String>) = apply { this.zip = zip }

        /** Phone number of the recipient. */
        fun phone(phone: String) = phone(JsonField.of(phone))

        /** Phone number of the recipient. */
        fun phone(phone: JsonField<String>) = apply { this.phone = phone }

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

        fun build(): Address =
            Address(
                id,
                name,
                street1,
                street2,
                city,
                province,
                country,
                zip,
                phone,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Address && id == other.id && name == other.name && street1 == other.street1 && street2 == other.street2 && city == other.city && province == other.province && country == other.country && zip == other.zip && phone == other.phone && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, street1, street2, city, province, country, zip, phone, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Address{id=$id, name=$name, street1=$street1, street2=$street2, city=$city, province=$province, country=$country, zip=$zip, phone=$phone, additionalProperties=$additionalProperties}"
}
