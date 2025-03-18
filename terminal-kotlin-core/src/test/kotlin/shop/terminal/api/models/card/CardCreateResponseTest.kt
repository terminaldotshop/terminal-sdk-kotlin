// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardCreateResponseTest {

    @Test
    fun createCardCreateResponse() {
        val cardCreateResponse =
            CardCreateResponse.builder().data("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        assertThat(cardCreateResponse).isNotNull
        assertThat(cardCreateResponse.data()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }
}
