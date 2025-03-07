// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shop.terminal.api.client.TerminalClient
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.models.ProductListParams
import shop.terminal.api.models.ProductListResponse
import shop.terminal.api.models.ProductVariant
import shop.terminal.api.models.SubscriptionCreateParams
import shop.terminal.api.models.SubscriptionCreateResponse

@WireMockTest
internal class ServiceParamsTest {

    private lateinit var client: TerminalClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            TerminalOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
    }

    @Test
    fun list() {
        val productService = client.product()
        stubFor(get(anyUrl()).willReturn(ok("{}")))

        productService.list(
            ProductListParams.builder()
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            getRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }

    @Test
    fun productsListWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            ProductListParams.builder()
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            ProductListResponse.builder()
                .addData(
                    Product.builder()
                        .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .description(
                            "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                        )
                        .addFilter(Product.Filter.EU)
                        .name("[object Object]")
                        .addVariant(
                            ProductVariant.builder()
                                .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                .name("12oz")
                                .price(2200L)
                                .build()
                        )
                        .order(100L)
                        .subscription(Product.Subscription.ALLOWED)
                        .tags(
                            Product.Tags.builder()
                                .putAdditionalProperty("featured", JsonValue.from("true"))
                                .build()
                        )
                        .build()
                )
                .build()

        stubFor(
            get(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.product().list(params)

        verify(getRequestedFor(anyUrl()))
    }
}
