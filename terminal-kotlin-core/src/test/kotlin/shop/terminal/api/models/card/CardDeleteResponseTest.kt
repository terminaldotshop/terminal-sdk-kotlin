// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDeleteResponseTest {

    @Test
    fun create() {
        val cardDeleteResponse =
            CardDeleteResponse.builder().data(CardDeleteResponse.Data.OK).build()

        assertThat(cardDeleteResponse.data()).isEqualTo(CardDeleteResponse.Data.OK)
    }
}
