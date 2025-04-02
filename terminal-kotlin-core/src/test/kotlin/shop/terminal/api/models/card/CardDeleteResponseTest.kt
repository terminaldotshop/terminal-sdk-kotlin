// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class CardDeleteResponseTest {

    @Test
    fun create() {
        val cardDeleteResponse =
            CardDeleteResponse.builder().data(CardDeleteResponse.Data.OK).build()

        assertThat(cardDeleteResponse.data()).isEqualTo(CardDeleteResponse.Data.OK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardDeleteResponse =
            CardDeleteResponse.builder().data(CardDeleteResponse.Data.OK).build()

        val roundtrippedCardDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardDeleteResponse),
                jacksonTypeRef<CardDeleteResponse>(),
            )

        assertThat(roundtrippedCardDeleteResponse).isEqualTo(cardDeleteResponse)
    }
}
