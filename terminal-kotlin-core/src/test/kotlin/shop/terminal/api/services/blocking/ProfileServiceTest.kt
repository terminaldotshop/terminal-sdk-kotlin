// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.profile.ProfileUpdateParams

@ExtendWith(TestServerExtension::class)
class ProfileServiceTest {

    @Test
    fun update() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val profileService = client.profile()

        val profile =
            profileService.update(
                ProfileUpdateParams.builder().email("john@example.com").name("John Doe").build()
            )

        profile.validate()
    }

    @Test
    fun me() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val profileService = client.profile()

        val response = profileService.me()

        response.validate()
    }
}
