// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClientAsync
import shop.terminal.api.models.app.AppCreateParams
import shop.terminal.api.models.app.AppDeleteParams
import shop.terminal.api.models.app.AppGetParams

@ExtendWith(TestServerExtension::class)
class AppServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val app =
            appServiceAsync.create(
                AppCreateParams.builder()
                    .name("Example App")
                    .redirectUri("https://example.com/callback")
                    .build()
            )

        app.validate()
    }

    @Test
    suspend fun list() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val app = appServiceAsync.list()

        app.validate()
    }

    @Test
    suspend fun delete() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val app =
            appServiceAsync.delete(
                AppDeleteParams.builder().id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
            )

        app.validate()
    }

    @Test
    suspend fun get() {
        val client =
            TerminalOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appServiceAsync = client.app()

        val app =
            appServiceAsync.get(AppGetParams.builder().id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX").build())

        app.validate()
    }
}
