// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.ProfileMeParams
import shop.terminal.api.models.ProfileUpdateParams

@ExtendWith(TestServerExtension::class)
class ProfileServiceTest {

    @Test
    fun callUpdate() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val profileService = client.profile()
        val profileUpdateResponse =
            profileService.update(
                ProfileUpdateParams.builder().email("john@example.com").name("John Doe").build()
            )
        println(profileUpdateResponse)
        profileUpdateResponse.validate()
    }

    @Test
    fun callMe() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val profileService = client.profile()
        val profileMeResponse = profileService.me(ProfileMeParams.builder().build())
        println(profileMeResponse)
        profileMeResponse.validate()
    }
}
