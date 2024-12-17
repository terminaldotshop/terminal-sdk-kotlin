// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import shop.terminal.api.core.ExcludeMissing
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.NoAutoDetect
import shop.terminal.api.core.http.Headers
import shop.terminal.api.core.http.QueryParams
import shop.terminal.api.core.toImmutable

class AddressCreateParams
constructor(
    private val city: String,
    private val country: String,
    private val name: String,
    private val street1: String,
    private val zip: String,
    private val phone: String?,
    private val province: String?,
    private val street2: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun city(): String = city

    fun country(): String = country

    fun name(): String = name

    fun street1(): String = street1

    fun zip(): String = zip

    fun phone(): String? = phone

    fun province(): String? = province

    fun street2(): String? = street2

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): AddressCreateBody {
        return AddressCreateBody(
            city,
            country,
            name,
            street1,
            zip,
            phone,
            province,
            street2,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    /** Address information. */
    @JsonDeserialize(builder = AddressCreateBody.Builder::class)
    @NoAutoDetect
    class AddressCreateBody
    internal constructor(
        private val city: String?,
        private val country: String?,
        private val name: String?,
        private val street1: String?,
        private val zip: String?,
        private val phone: String?,
        private val province: String?,
        private val street2: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** City of the address. */
        @JsonProperty("city") fun city(): String? = city

        /** ISO 3166-1 alpha-2 country code of the address. */
        @JsonProperty("country") fun country(): String? = country

        /** The recipient's name. */
        @JsonProperty("name") fun name(): String? = name

        /** Street of the address. */
        @JsonProperty("street1") fun street1(): String? = street1

        /** Zip code of the address. */
        @JsonProperty("zip") fun zip(): String? = zip

        /** Phone number of the recipient. */
        @JsonProperty("phone") fun phone(): String? = phone

        /** Province or state of the address. */
        @JsonProperty("province") fun province(): String? = province

        /** Apartment, suite, etc. of the address. */
        @JsonProperty("street2") fun street2(): String? = street2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var city: String? = null
            private var country: String? = null
            private var name: String? = null
            private var street1: String? = null
            private var zip: String? = null
            private var phone: String? = null
            private var province: String? = null
            private var street2: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addressCreateBody: AddressCreateBody) = apply {
                this.city = addressCreateBody.city
                this.country = addressCreateBody.country
                this.name = addressCreateBody.name
                this.street1 = addressCreateBody.street1
                this.zip = addressCreateBody.zip
                this.phone = addressCreateBody.phone
                this.province = addressCreateBody.province
                this.street2 = addressCreateBody.street2
                additionalProperties(addressCreateBody.additionalProperties)
            }

            /** City of the address. */
            @JsonProperty("city") fun city(city: String) = apply { this.city = city }

            /** ISO 3166-1 alpha-2 country code of the address. */
            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

            /** The recipient's name. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Street of the address. */
            @JsonProperty("street1") fun street1(street1: String) = apply { this.street1 = street1 }

            /** Zip code of the address. */
            @JsonProperty("zip") fun zip(zip: String) = apply { this.zip = zip }

            /** Phone number of the recipient. */
            @JsonProperty("phone") fun phone(phone: String) = apply { this.phone = phone }

            /** Province or state of the address. */
            @JsonProperty("province")
            fun province(province: String) = apply { this.province = province }

            /** Apartment, suite, etc. of the address. */
            @JsonProperty("street2") fun street2(street2: String) = apply { this.street2 = street2 }

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

            fun build(): AddressCreateBody =
                AddressCreateBody(
                    checkNotNull(city) { "`city` is required but was not set" },
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(street1) { "`street1` is required but was not set" },
                    checkNotNull(zip) { "`zip` is required but was not set" },
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
    class Builder {

        private var city: String? = null
        private var country: String? = null
        private var name: String? = null
        private var street1: String? = null
        private var zip: String? = null
        private var phone: String? = null
        private var province: String? = null
        private var street2: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(addressCreateParams: AddressCreateParams) = apply {
            city = addressCreateParams.city
            country = addressCreateParams.country
            name = addressCreateParams.name
            street1 = addressCreateParams.street1
            zip = addressCreateParams.zip
            phone = addressCreateParams.phone
            province = addressCreateParams.province
            street2 = addressCreateParams.street2
            additionalHeaders = addressCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = addressCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = addressCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** City of the address. */
        fun city(city: String) = apply { this.city = city }

        /** ISO 3166-1 alpha-2 country code of the address. */
        fun country(country: String) = apply { this.country = country }

        /** The recipient's name. */
        fun name(name: String) = apply { this.name = name }

        /** Street of the address. */
        fun street1(street1: String) = apply { this.street1 = street1 }

        /** Zip code of the address. */
        fun zip(zip: String) = apply { this.zip = zip }

        /** Phone number of the recipient. */
        fun phone(phone: String) = apply { this.phone = phone }

        /** Province or state of the address. */
        fun province(province: String) = apply { this.province = province }

        /** Apartment, suite, etc. of the address. */
        fun street2(street2: String) = apply { this.street2 = street2 }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): AddressCreateParams =
            AddressCreateParams(
                checkNotNull(city) { "`city` is required but was not set" },
                checkNotNull(country) { "`country` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(street1) { "`street1` is required but was not set" },
                checkNotNull(zip) { "`zip` is required but was not set" },
                phone,
                province,
                street2,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AddressCreateParams && city == other.city && country == other.country && name == other.name && street1 == other.street1 && zip == other.zip && phone == other.phone && province == other.province && street2 == other.street2 && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(city, country, name, street1, zip, phone, province, street2, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "AddressCreateParams{city=$city, country=$country, name=$name, street1=$street1, zip=$zip, phone=$phone, province=$province, street2=$street2, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
