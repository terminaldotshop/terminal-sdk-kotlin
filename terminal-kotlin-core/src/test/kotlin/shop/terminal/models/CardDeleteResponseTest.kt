// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDeleteResponseTest {

    @Test
    fun createCardDeleteResponse() {
        val cardDeleteResponse =
            CardDeleteResponse.builder().data(CardDeleteResponse.Data.OK).build()
        assertThat(cardDeleteResponse).isNotNull
        assertThat(cardDeleteResponse.data()).isEqualTo(CardDeleteResponse.Data.OK)
    }
}
