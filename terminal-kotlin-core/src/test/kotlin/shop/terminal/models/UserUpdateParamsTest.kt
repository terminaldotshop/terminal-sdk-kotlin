// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserUpdateParamsTest {

    @Test
    fun createUserUpdateParams() {
        UserUpdateParams.builder().email("john@example.com").name("John Doe").build()
    }

    @Test
    fun getBody() {
        val params = UserUpdateParams.builder().email("john@example.com").name("John Doe").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.email()).isEqualTo("john@example.com")
        assertThat(body.name()).isEqualTo("John Doe")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = UserUpdateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
