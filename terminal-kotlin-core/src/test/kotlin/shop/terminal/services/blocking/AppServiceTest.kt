// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.TestServerExtension
import shop.terminal.client.okhttp.TerminalOkHttpClient
import shop.terminal.models.AppCreateParams
import shop.terminal.models.AppDeleteParams
import shop.terminal.models.AppGetParams
import shop.terminal.models.AppListParams

@ExtendWith(TestServerExtension::class)
class AppServiceTest {

    @Test
    fun callCreate() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appService = client.app()
        val appCreateResponse =
            appService.create(
                AppCreateParams.builder()
                    .id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .name("Example App")
                    .redirectUri("https://example.com/callback")
                    .build()
            )
        println(appCreateResponse)
        appCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appService = client.app()
        val appListResponse = appService.list(AppListParams.builder().build())
        println(appListResponse)
        appListResponse.validate()
    }

    @Test
    fun callDelete() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appService = client.app()
        val appDeleteResponse =
            appService.delete(AppDeleteParams.builder().id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX").build())
        println(appDeleteResponse)
        appDeleteResponse.validate()
    }

    @Test
    fun callGet() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val appService = client.app()
        val appGetResponse =
            appService.get(AppGetParams.builder().id("cli_XXXXXXXXXXXXXXXXXXXXXXXXX").build())
        println(appGetResponse)
        appGetResponse.validate()
    }
}
