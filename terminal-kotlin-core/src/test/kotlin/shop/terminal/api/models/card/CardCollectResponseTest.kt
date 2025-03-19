// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

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
}
