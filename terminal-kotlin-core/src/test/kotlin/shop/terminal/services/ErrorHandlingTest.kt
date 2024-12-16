// File generated from our OpenAPI spec by Stainless.

package shop.terminal.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shop.terminal.client.TerminalClient
import shop.terminal.client.okhttp.TerminalOkHttpClient
import shop.terminal.core.JsonValue
import shop.terminal.core.http.Headers
import shop.terminal.core.jsonMapper
import shop.terminal.errors.BadRequestException
import shop.terminal.errors.InternalServerException
import shop.terminal.errors.NotFoundException
import shop.terminal.errors.PermissionDeniedException
import shop.terminal.errors.RateLimitException
import shop.terminal.errors.TerminalError
import shop.terminal.errors.TerminalException
import shop.terminal.errors.UnauthorizedException
import shop.terminal.errors.UnexpectedStatusCodeException
import shop.terminal.errors.UnprocessableEntityException
import shop.terminal.models.Product
import shop.terminal.models.ProductListParams
import shop.terminal.models.ProductListResponse
import shop.terminal.models.ProductVariant

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val TERMINAL_ERROR: TerminalError =
        TerminalError.builder().putAdditionalProperty("key", JsonValue.from("value")).build()

    private lateinit var client: TerminalClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            TerminalOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .bearerToken("My Bearer Token")
                .build()
    }

    @Test
    fun productsList200() {
        val params = ProductListParams.builder().build()

        val expected =
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

        stubFor(get(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.product().list(params)).isEqualTo(expected)
    }

    @Test
    fun productsList400() {
        val params = ProductListParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.product().list(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().put("Foo", "Bar").build(), TERMINAL_ERROR)
            })
    }

    @Test
    fun productsList401() {
        val params = ProductListParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.product().list(params) })
            .satisfies({ e ->
                assertUnauthorized(e, Headers.builder().put("Foo", "Bar").build(), TERMINAL_ERROR)
            })
    }

    @Test
    fun productsList403() {
        val params = ProductListParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.product().list(params) })
            .satisfies({ e ->
                assertPermissionDenied(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    TERMINAL_ERROR
                )
            })
    }

    @Test
    fun productsList404() {
        val params = ProductListParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.product().list(params) })
            .satisfies({ e ->
                assertNotFound(e, Headers.builder().put("Foo", "Bar").build(), TERMINAL_ERROR)
            })
    }

    @Test
    fun productsList422() {
        val params = ProductListParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.product().list(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    TERMINAL_ERROR
                )
            })
    }

    @Test
    fun productsList429() {
        val params = ProductListParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.product().list(params) })
            .satisfies({ e ->
                assertRateLimit(e, Headers.builder().put("Foo", "Bar").build(), TERMINAL_ERROR)
            })
    }

    @Test
    fun productsList500() {
        val params = ProductListParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.product().list(params) })
            .satisfies({ e ->
                assertInternalServer(e, Headers.builder().put("Foo", "Bar").build(), TERMINAL_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params = ProductListParams.builder().build()

        stubFor(
            get(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.product().list(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    Headers.builder().put("Foo", "Bar").build(),
                    toJson(TERMINAL_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params = ProductListParams.builder().build()

        stubFor(get(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.product().list(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(TerminalException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params = ProductListParams.builder().build()

        stubFor(get(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.product().list(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().build(), TerminalError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(throwable: Throwable, headers: Headers, error: TerminalError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(throwable: Throwable, headers: Headers, error: TerminalError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: Headers,
        error: TerminalError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(throwable: Throwable, headers: Headers, error: TerminalError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: Headers,
        error: TerminalError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(throwable: Throwable, headers: Headers, error: TerminalError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(throwable: Throwable, headers: Headers, error: TerminalError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
