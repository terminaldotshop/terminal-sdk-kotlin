// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.email

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class EmailCreateResponseTest {

    @Test
    fun create() {
        val emailCreateResponse =
            EmailCreateResponse.builder().data(EmailCreateResponse.Data.OK).build()

        assertThat(emailCreateResponse.data()).isEqualTo(EmailCreateResponse.Data.OK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailCreateResponse =
            EmailCreateResponse.builder().data(EmailCreateResponse.Data.OK).build()

        val roundtrippedEmailCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailCreateResponse),
                jacksonTypeRef<EmailCreateResponse>(),
            )

        assertThat(roundtrippedEmailCreateResponse).isEqualTo(emailCreateResponse)
    }
}
