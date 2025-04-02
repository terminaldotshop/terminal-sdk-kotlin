// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class CardCollectResponseTest {

    @Test
    fun create() {
        val cardCollectResponse =
            CardCollectResponse.builder()
                .data(CardCollectResponse.Data.builder().url("https://trm.sh/XXXXXXXXXX").build())
                .build()

        assertThat(cardCollectResponse.data())
            .isEqualTo(CardCollectResponse.Data.builder().url("https://trm.sh/XXXXXXXXXX").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardCollectResponse =
            CardCollectResponse.builder()
                .data(CardCollectResponse.Data.builder().url("https://trm.sh/XXXXXXXXXX").build())
                .build()

        val roundtrippedCardCollectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardCollectResponse),
                jacksonTypeRef<CardCollectResponse>(),
            )

        assertThat(roundtrippedCardCollectResponse).isEqualTo(cardCollectResponse)
    }
}
