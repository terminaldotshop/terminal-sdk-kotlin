// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.cart

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class CartSetCardResponseTest {

    @Test
    fun create() {
        val cartSetCardResponse =
            CartSetCardResponse.builder().data(CartSetCardResponse.Data.OK).build()

        assertThat(cartSetCardResponse.data()).isEqualTo(CartSetCardResponse.Data.OK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cartSetCardResponse =
            CartSetCardResponse.builder().data(CartSetCardResponse.Data.OK).build()

        val roundtrippedCartSetCardResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cartSetCardResponse),
                jacksonTypeRef<CartSetCardResponse>(),
            )

        assertThat(roundtrippedCartSetCardResponse).isEqualTo(cartSetCardResponse)
    }
}
