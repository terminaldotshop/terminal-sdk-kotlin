// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shop.terminal.api.client.TerminalClient
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.jsonMapper
import shop.terminal.api.models.Product
import shop.terminal.api.models.ProductListParams
import shop.terminal.api.models.ProductListResponse
import shop.terminal.api.models.ProductVariant

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: TerminalClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            TerminalOkHttpClient.builder()
                .bearerToken("My Bearer Token")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
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
                .data(
                    listOf(
                        Product.builder()
                            .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                            .description(
                                "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                            )
                            .name("[object Object]")
                            .variants(
                                listOf(
                                    ProductVariant.builder()
                                        .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                                        .name("12oz")
                                        .price(2200L)
                                        .build()
                                )
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
