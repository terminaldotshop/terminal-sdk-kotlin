// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.email

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmailCreateResponseTest {

    @Test
    fun createEmailCreateResponse() {
        val emailCreateResponse =
            EmailCreateResponse.builder().data(EmailCreateResponse.Data.OK).build()
        assertThat(emailCreateResponse).isNotNull
        assertThat(emailCreateResponse.data()).isEqualTo(EmailCreateResponse.Data.OK)
    }
}
