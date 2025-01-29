// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmailCreateParamsTest {

    @Test
    fun createEmailCreateParams() {
        EmailCreateParams.builder().email("john@example.com").build()
    }

    @Test
    fun body() {
        val params = EmailCreateParams.builder().email("john@example.com").build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.email()).isEqualTo("john@example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmailCreateParams.builder().email("john@example.com").build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.email()).isEqualTo("john@example.com")
    }
}
