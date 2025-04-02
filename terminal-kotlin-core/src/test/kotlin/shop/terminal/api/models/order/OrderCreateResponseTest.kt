// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.order

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class OrderCreateResponseTest {

    @Test
    fun create() {
        val orderCreateResponse =
            OrderCreateResponse.builder().data("ord_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        assertThat(orderCreateResponse.data()).isEqualTo("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderCreateResponse =
            OrderCreateResponse.builder().data("ord_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        val roundtrippedOrderCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderCreateResponse),
                jacksonTypeRef<OrderCreateResponse>(),
            )

        assertThat(roundtrippedOrderCreateResponse).isEqualTo(orderCreateResponse)
    }
}
