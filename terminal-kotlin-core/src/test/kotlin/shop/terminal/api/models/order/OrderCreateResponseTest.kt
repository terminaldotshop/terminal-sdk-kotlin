// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.order

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrderCreateResponseTest {

    @Test
    fun createOrderCreateResponse() {
        val orderCreateResponse =
            OrderCreateResponse.builder().data("ord_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        assertThat(orderCreateResponse).isNotNull
        assertThat(orderCreateResponse.data()).isEqualTo("ord_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }
}
