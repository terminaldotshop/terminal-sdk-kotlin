// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.TestServerExtension
import shop.terminal.client.okhttp.TerminalOkHttpClient
import shop.terminal.models.ViewInitParams

@ExtendWith(TestServerExtension::class)
class ViewServiceTest {

    @Test
    fun callInit() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val viewService = client.view()
        val viewInitResponse = viewService.init(ViewInitParams.builder().build())
        println(viewInitResponse)
        viewInitResponse.validate()
    }
}
