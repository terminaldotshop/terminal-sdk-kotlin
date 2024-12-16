// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import shop.terminal.TestServerExtension
import shop.terminal.client.okhttp.TerminalOkHttpClient
import shop.terminal.models.ProductListParams

@ExtendWith(TestServerExtension::class)
class ProductServiceTest {

    @Test
    fun callList() {
        val client =
            TerminalOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.products()
        val productListResponse = productService.list(ProductListParams.builder().build())
        println(productListResponse)
        productListResponse.validate()
    }
}
