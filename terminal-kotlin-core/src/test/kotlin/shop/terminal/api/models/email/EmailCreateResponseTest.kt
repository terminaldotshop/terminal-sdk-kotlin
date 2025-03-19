// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.email

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailCreateResponseTest {

    @Test
    fun create() {
        val emailCreateResponse =
            EmailCreateResponse.builder().data(EmailCreateResponse.Data.OK).build()

        assertThat(emailCreateResponse.data()).isEqualTo(EmailCreateResponse.Data.OK)
    }
}
