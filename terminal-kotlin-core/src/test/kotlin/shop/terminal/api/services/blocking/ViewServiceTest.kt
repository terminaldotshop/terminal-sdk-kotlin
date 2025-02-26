// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.api.TestServerExtension
import shop.terminal.api.client.okhttp.TerminalOkHttpClient

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
        val viewInitResponse = viewService.init()
        println(viewInitResponse)
        viewInitResponse.validate()
    }
}
