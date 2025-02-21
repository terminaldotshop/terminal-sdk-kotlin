// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProfileUpdateParamsTest {

    @Test
    fun create() {
        ProfileUpdateParams.builder().email("john@example.com").name("John Doe").build()
    }

    @Test
    fun body() {
        val params =
            ProfileUpdateParams.builder().email("john@example.com").name("John Doe").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.email()).isEqualTo("john@example.com")
        assertThat(body.name()).isEqualTo("John Doe")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProfileUpdateParams.builder().build()

        val body = params._body()

        assertNotNull(body)
    }
}
