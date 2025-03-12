// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardCollectResponseTest {

    @Test
    fun createCardCollectResponse() {
        val cardCollectResponse =
            CardCollectResponse.builder()
                .data(CardCollectResponse.Data.builder().url("https://trm.sh/XXXXXXXXXX").build())
                .build()
        assertThat(cardCollectResponse).isNotNull
        assertThat(cardCollectResponse.data())
            .isEqualTo(CardCollectResponse.Data.builder().url("https://trm.sh/XXXXXXXXXX").build())
    }
}
