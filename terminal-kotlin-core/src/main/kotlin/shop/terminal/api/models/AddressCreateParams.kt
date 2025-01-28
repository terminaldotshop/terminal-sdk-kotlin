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
import shop.terminal.api.core.checkRequired
import shop.terminal.api.core.http.Headers
import shop.terminal.api.core.http.QueryParams
import shop.terminal.api.core.immutableEmptyMap
import shop.terminal.api.core.toImmutable

/** Create and add a shipping address to the current user. */
class AddressCreateParams
private constructor(
    private val body: AddressCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** City of the address. */
    fun city(): String = body.city()

    /** ISO 3166-1 alpha-2 country code of the address. */
    fun country(): String = body.country()

    /** The recipient's name. */
    fun name(): String = body.name()

    /** Street of the address. */
    fun street1(): String = body.street1()

    /** Zip code of the address. */
    fun zip(): String = body.zip()

    /** Phone number of the recipient. */
    fun phone(): String? = body.phone()

    /** Province or state of the address. */
    fun province(): String? = body.province()

    /** Apartment, suite, etc. of the address. */
    fun street2(): String? = body.street2()

    /** City of the address. */
    fun _city(): JsonField<String> = body._city()

    /** ISO 3166-1 alpha-2 country code of the address. */
    fun _country(): JsonField<String> = body._country()

    /** The recipient's name. */
    fun _name(): JsonField<String> = body._name()

    /** Street of the address. */
    fun _street1(): JsonField<String> = body._street1()

    /** Zip code of the address. */
    fun _zip(): JsonField<String> = body._zip()

    /** Phone number of the recipient. */
    fun _phone(): JsonField<String> = body._phone()

    /** Province or state of the address. */
    fun _province(): JsonField<String> = body._province()

    /** Apartment, suite, etc. of the address. */
    fun _street2(): JsonField<String> = body._street2()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): AddressCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    /** Address information. */
    @NoAutoDetect
    class AddressCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("city")
        @ExcludeMissing
        private val city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street1")
        @ExcludeMissing
        private val street1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zip") @ExcludeMissing private val zip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone")
        @ExcludeMissing
        private val phone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("province")
        @ExcludeMissing
        private val province: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street2")
        @ExcludeMissing
        private val street2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** City of the address. */
        fun city(): String = city.getRequired("city")

        /** ISO 3166-1 alpha-2 country code of the address. */
        fun country(): String = country.getRequired("country")

        /** The recipient's name. */
        fun name(): String = name.getRequired("name")

        /** Street of the address. */
        fun street1(): String = street1.getRequired("street1")

        /** Zip code of the address. */
        fun zip(): String = zip.getRequired("zip")

        /** Phone number of the recipient. */
        fun phone(): String? = phone.getNullable("phone")

        /** Province or state of the address. */
        fun province(): String? = province.getNullable("province")

        /** Apartment, suite, etc. of the address. */
        fun street2(): String? = street2.getNullable("street2")

        /** City of the address. */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /** ISO 3166-1 alpha-2 country code of the address. */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /** The recipient's name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Street of the address. */
        @JsonProperty("street1") @ExcludeMissing fun _street1(): JsonField<String> = street1

        /** Zip code of the address. */
        @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

        /** Phone number of the recipient. */
        @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

        /** Province or state of the address. */
        @JsonProperty("province") @ExcludeMissing fun _province(): JsonField<String> = province

        /** Apartment, suite, etc. of the address. */
        @JsonProperty("street2") @ExcludeMissing fun _street2(): JsonField<String> = street2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AddressCreateBody = apply {
            if (validated) {
                return@apply
            }

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

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var street1: JsonField<String>? = null
            private var zip: JsonField<String>? = null
            private var phone: JsonField<String> = JsonMissing.of()
            private var province: JsonField<String> = JsonMissing.of()
            private var street2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addressCreateBody: AddressCreateBody) = apply {
                city = addressCreateBody.city
                country = addressCreateBody.country
                name = addressCreateBody.name
                street1 = addressCreateBody.street1
                zip = addressCreateBody.zip
                phone = addressCreateBody.phone
                province = addressCreateBody.province
                street2 = addressCreateBody.street2
                additionalProperties = addressCreateBody.additionalProperties.toMutableMap()
            }

            /** City of the address. */
            fun city(city: String) = city(JsonField.of(city))

            /** City of the address. */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** ISO 3166-1 alpha-2 country code of the address. */
            fun country(country: String) = country(JsonField.of(country))

            /** ISO 3166-1 alpha-2 country code of the address. */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** The recipient's name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The recipient's name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Street of the address. */
            fun street1(street1: String) = street1(JsonField.of(street1))

            /** Street of the address. */
            fun street1(street1: JsonField<String>) = apply { this.street1 = street1 }

            /** Zip code of the address. */
            fun zip(zip: String) = zip(JsonField.of(zip))

            /** Zip code of the address. */
            fun zip(zip: JsonField<String>) = apply { this.zip = zip }

            /** Phone number of the recipient. */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /** Phone number of the recipient. */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            /** Province or state of the address. */
            fun province(province: String) = province(JsonField.of(province))

            /** Province or state of the address. */
            fun province(province: JsonField<String>) = apply { this.province = province }

            /** Apartment, suite, etc. of the address. */
            fun street2(street2: String) = street2(JsonField.of(street2))

            /** Apartment, suite, etc. of the address. */
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

            fun build(): AddressCreateBody =
                AddressCreateBody(
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("name", name),
                    checkRequired("street1", street1),
                    checkRequired("zip", zip),
                    phone,
                    province,
                    street2,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddressCreateBody && city == other.city && country == other.country && name == other.name && street1 == other.street1 && zip == other.zip && phone == other.phone && province == other.province && street2 == other.street2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(city, country, name, street1, zip, phone, province, street2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddressCreateBody{city=$city, country=$country, name=$name, street1=$street1, zip=$zip, phone=$phone, province=$province, street2=$street2, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var body: AddressCreateBody.Builder = AddressCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(addressCreateParams: AddressCreateParams) = apply {
            body = addressCreateParams.body.toBuilder()
            additionalHeaders = addressCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = addressCreateParams.additionalQueryParams.toBuilder()
        }

        /** City of the address. */
        fun city(city: String) = apply { body.city(city) }

        /** City of the address. */
        fun city(city: JsonField<String>) = apply { body.city(city) }

        /** ISO 3166-1 alpha-2 country code of the address. */
        fun country(country: String) = apply { body.country(country) }

        /** ISO 3166-1 alpha-2 country code of the address. */
        fun country(country: JsonField<String>) = apply { body.country(country) }

        /** The recipient's name. */
        fun name(name: String) = apply { body.name(name) }

        /** The recipient's name. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Street of the address. */
        fun street1(street1: String) = apply { body.street1(street1) }

        /** Street of the address. */
        fun street1(street1: JsonField<String>) = apply { body.street1(street1) }

        /** Zip code of the address. */
        fun zip(zip: String) = apply { body.zip(zip) }

        /** Zip code of the address. */
        fun zip(zip: JsonField<String>) = apply { body.zip(zip) }

        /** Phone number of the recipient. */
        fun phone(phone: String) = apply { body.phone(phone) }

        /** Phone number of the recipient. */
        fun phone(phone: JsonField<String>) = apply { body.phone(phone) }

        /** Province or state of the address. */
        fun province(province: String) = apply { body.province(province) }

        /** Province or state of the address. */
        fun province(province: JsonField<String>) = apply { body.province(province) }

        /** Apartment, suite, etc. of the address. */
        fun street2(street2: String) = apply { body.street2(street2) }

        /** Apartment, suite, etc. of the address. */
        fun street2(street2: JsonField<String>) = apply { body.street2(street2) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): AddressCreateParams =
            AddressCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AddressCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AddressCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
