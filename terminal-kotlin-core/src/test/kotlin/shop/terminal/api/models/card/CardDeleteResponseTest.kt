// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class CardDeleteResponseTest {

    @Test
    fun create() {
        val cardDeleteResponse = CardDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardDeleteResponse = CardDeleteResponse.builder().build()

        val roundtrippedCardDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardDeleteResponse),
                jacksonTypeRef<CardDeleteResponse>(),
            )

        assertThat(roundtrippedCardDeleteResponse).isEqualTo(cardDeleteResponse)
    }
}
