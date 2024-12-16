// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.TestServerExtension
import shop.terminal.client.okhttp.TerminalOkHttpClient
import shop.terminal.models.ProfileMeParams
import shop.terminal.models.ProfileUpdateParams

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
            profileService.update(ProfileUpdateParams.builder().email("email").name("name").build())
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
