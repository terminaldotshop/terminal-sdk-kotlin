// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.TestServerExtension
import shop.terminal.client.okhttp.TerminalOkHttpClient
import shop.terminal.models.EmailCreateParams

@ExtendWith(TestServerExtension::class)
class EmailServiceTest {

    @Test
    fun callCreate() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val emailService = client.emails()
        val emailCreateResponse =
            emailService.create(EmailCreateParams.builder().email("john@example.com").build())
        println(emailCreateResponse)
        emailCreateResponse.validate()
    }
}
