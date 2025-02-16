// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import shop.terminal.api.client.TerminalClient
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.core.JsonValue
import shop.terminal.api.core.http.Headers
import shop.terminal.api.core.jsonMapper
import shop.terminal.api.errors.BadRequestException
import shop.terminal.api.errors.InternalServerException
import shop.terminal.api.errors.NotFoundException
import shop.terminal.api.errors.PermissionDeniedException
import shop.terminal.api.errors.RateLimitException
import shop.terminal.api.errors.TerminalError
import shop.terminal.api.errors.TerminalException
import shop.terminal.api.errors.UnauthorizedException
import shop.terminal.api.errors.UnexpectedStatusCodeException
import shop.terminal.api.errors.UnprocessableEntityException
import shop.terminal.api.models.SubscriptionCreateParams
import shop.terminal.api.models.SubscriptionCreateResponse

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
    fun subscriptionsCreate200() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .schedule(
                    SubscriptionCreateParams.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(SubscriptionCreateParams.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
                .build()

        val expected =
            SubscriptionCreateResponse.builder().data(SubscriptionCreateResponse.Data.OK).build()

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.subscription().create(params)).isEqualTo(expected)
    }

    @Test
    fun subscriptionsCreate400() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .schedule(
                    SubscriptionCreateParams.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(SubscriptionCreateParams.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.subscription().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().put("Foo", "Bar").build(), TERMINAL_ERROR)
            })
    }

    @Test
    fun subscriptionsCreate401() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .schedule(
                    SubscriptionCreateParams.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(SubscriptionCreateParams.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.subscription().create(params) })
            .satisfies({ e ->
                assertUnauthorized(e, Headers.builder().put("Foo", "Bar").build(), TERMINAL_ERROR)
            })
    }

    @Test
    fun subscriptionsCreate403() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .schedule(
                    SubscriptionCreateParams.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(SubscriptionCreateParams.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.subscription().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    TERMINAL_ERROR
                )
            })
    }

    @Test
    fun subscriptionsCreate404() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .schedule(
                    SubscriptionCreateParams.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(SubscriptionCreateParams.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.subscription().create(params) })
            .satisfies({ e ->
                assertNotFound(e, Headers.builder().put("Foo", "Bar").build(), TERMINAL_ERROR)
            })
    }

    @Test
    fun subscriptionsCreate422() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .schedule(
                    SubscriptionCreateParams.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(SubscriptionCreateParams.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.subscription().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    TERMINAL_ERROR
                )
            })
    }

    @Test
    fun subscriptionsCreate429() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .schedule(
                    SubscriptionCreateParams.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(SubscriptionCreateParams.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.subscription().create(params) })
            .satisfies({ e ->
                assertRateLimit(e, Headers.builder().put("Foo", "Bar").build(), TERMINAL_ERROR)
            })
    }

    @Test
    fun subscriptionsCreate500() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .schedule(
                    SubscriptionCreateParams.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(SubscriptionCreateParams.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.subscription().create(params) })
            .satisfies({ e ->
                assertInternalServer(e, Headers.builder().put("Foo", "Bar").build(), TERMINAL_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .schedule(
                    SubscriptionCreateParams.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(SubscriptionCreateParams.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(TERMINAL_ERROR)))
        )

        assertThatThrownBy({ client.subscription().create(params) })
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
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .schedule(
                    SubscriptionCreateParams.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(SubscriptionCreateParams.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
                .build()

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.subscription().create(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(TerminalException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params =
            SubscriptionCreateParams.builder()
                .id("sub_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .addressId("shp_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .frequency(SubscriptionCreateParams.Frequency.FIXED)
                .productVariantId("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .quantity(1L)
                .next("2025-02-01T19:36:19.000Z")
                .schedule(
                    SubscriptionCreateParams.Schedule.UnionMember1.builder()
                        .interval(3L)
                        .type(SubscriptionCreateParams.Schedule.UnionMember1.Type.WEEKLY)
                        .build()
                )
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.subscription().create(params) })
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
