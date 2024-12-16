// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmailCreateParamsTest {

    @Test
    fun createEmailCreateParams() {
        EmailCreateParams.builder().email("john@example.com").build()
    }

    @Test
    fun getBody() {
        val params = EmailCreateParams.builder().email("john@example.com").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.email()).isEqualTo("john@example.com")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = EmailCreateParams.builder().email("john@example.com").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.email()).isEqualTo("john@example.com")
    }
}
