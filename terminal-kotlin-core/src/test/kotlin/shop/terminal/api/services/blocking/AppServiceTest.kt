// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.App
import shop.terminal.api.models.AppCreateParams
import shop.terminal.api.models.AppDeleteParams
import shop.terminal.api.models.AppGetParams

@ExtendWith(TestServerExtension::class)
class AppServiceTest {

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
                    .app(
                        App.builder()
                            .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .name("Example App")
                            .redirectUri("https://example.com/callback")
                            .secret("sec_******XXXX")
                            .build()
                    )
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

        val app = appService.list()

        app.validate()
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
