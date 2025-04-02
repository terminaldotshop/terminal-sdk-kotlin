// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.app.AppCreateParams
import shop.terminal.api.models.app.AppDeleteParams
import shop.terminal.api.models.app.AppGetParams

@ExtendWith(TestServerExtension::class)
internal class AppServiceTest {

    @Test
    fun create() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appService = client.app()

        val app =
            appService.create(
                AppCreateParams.builder()
                    .name("Example App")
                    .redirectUri("https://example.com/callback")
                    .build()
            )

        app.validate()
    }

    @Test
    fun list() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appService = client.app()

        val apps = appService.list()

        apps.validate()
    }

    @Test
    fun delete() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appService = client.app()

        val app =
            appService.delete(AppDeleteParams.builder().id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX").build())

        app.validate()
    }

    @Test
    fun get() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appService = client.app()

        val app = appService.get(AppGetParams.builder().id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX").build())

        app.validate()
    }
}
