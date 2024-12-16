// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProfileUpdateParamsTest {

    @Test
    fun createProfileUpdateParams() {
        ProfileUpdateParams.builder().email("email").name("name").build()
    }

    @Test
    fun getBody() {
        val params = ProfileUpdateParams.builder().email("email").name("name").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.email()).isEqualTo("email")
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ProfileUpdateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
