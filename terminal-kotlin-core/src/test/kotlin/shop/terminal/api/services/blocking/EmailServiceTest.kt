// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.EmailCreateParams

@ExtendWith(TestServerExtension::class)
class EmailServiceTest {

    @Test
    fun callCreate() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val emailService = client.email()
        val emailCreateResponse =
            emailService.create(EmailCreateParams.builder().email("john@example.com").build())
        println(emailCreateResponse)
        emailCreateResponse.validate()
    }
}
