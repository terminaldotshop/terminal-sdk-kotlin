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

/** Physical address associated with a Terminal shop user. */
@JsonDeserialize(builder = Address.Builder::class)
@NoAutoDetect
class Address
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val street1: JsonField<String>,
    private val street2: JsonField<String>,
    private val city: JsonField<String>,
    private val province: JsonField<String>,
    private val country: JsonField<String>,
    private val zip: JsonField<String>,
    private val phone: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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
            this.id = address.id
            this.name = address.name
            this.street1 = address.street1
            this.street2 = address.street2
            this.city = address.city
            this.province = address.province
            this.country = address.country
            this.zip = address.zip
            this.phone = address.phone
            additionalProperties(address.additionalProperties)
        }

        /** Unique object identifier. The format and length of IDs may change over time. */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique object identifier. The format and length of IDs may change over time. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The recipient's name. */
        fun name(name: String) = name(JsonField.of(name))

        /** The recipient's name. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Street of the address. */
        fun street1(street1: String) = street1(JsonField.of(street1))

        /** Street of the address. */
        @JsonProperty("street1")
        @ExcludeMissing
        fun street1(street1: JsonField<String>) = apply { this.street1 = street1 }

        /** Apartment, suite, etc. of the address. */
        fun street2(street2: String) = street2(JsonField.of(street2))

        /** Apartment, suite, etc. of the address. */
        @JsonProperty("street2")
        @ExcludeMissing
        fun street2(street2: JsonField<String>) = apply { this.street2 = street2 }

        /** City of the address. */
        fun city(city: String) = city(JsonField.of(city))

        /** City of the address. */
        @JsonProperty("city")
        @ExcludeMissing
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** Province or state of the address. */
        fun province(province: String) = province(JsonField.of(province))

        /** Province or state of the address. */
        @JsonProperty("province")
        @ExcludeMissing
        fun province(province: JsonField<String>) = apply { this.province = province }

        /** ISO 3166-1 alpha-2 country code of the address. */
        fun country(country: String) = country(JsonField.of(country))

        /** ISO 3166-1 alpha-2 country code of the address. */
        @JsonProperty("country")
        @ExcludeMissing
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Zip code of the address. */
        fun zip(zip: String) = zip(JsonField.of(zip))

        /** Zip code of the address. */
        @JsonProperty("zip")
        @ExcludeMissing
        fun zip(zip: JsonField<String>) = apply { this.zip = zip }

        /** Phone number of the recipient. */
        fun phone(phone: String) = phone(JsonField.of(phone))

        /** Phone number of the recipient. */
        @JsonProperty("phone")
        @ExcludeMissing
        fun phone(phone: JsonField<String>) = apply { this.phone = phone }

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
