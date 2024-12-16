// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.TestServerExtension
import shop.terminal.client.okhttp.TerminalOkHttpClient
import shop.terminal.models.UserInitParams
import shop.terminal.models.UserMeParams
import shop.terminal.models.UserUpdateParams

@ExtendWith(TestServerExtension::class)
class UserServiceTest {

    @Test
    fun callUpdate() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val userService = client.users()
        val userUpdateResponse =
            userService.update(
                UserUpdateParams.builder().email("john@example.com").name("John Doe").build()
            )
        println(userUpdateResponse)
        userUpdateResponse.validate()
    }

    @Test
    fun callInit() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val userService = client.users()
        val userInitResponse = userService.init(UserInitParams.builder().build())
        println(userInitResponse)
        userInitResponse.validate()
    }

    @Test
    fun callMe() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val userService = client.users()
        val userMeResponse = userService.me(UserMeParams.builder().build())
        println(userMeResponse)
        userMeResponse.validate()
    }
}
