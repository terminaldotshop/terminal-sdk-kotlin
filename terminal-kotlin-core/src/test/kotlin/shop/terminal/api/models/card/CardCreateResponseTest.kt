// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class CardCreateResponseTest {

    @Test
    fun create() {
        val cardCreateResponse =
            CardCreateResponse.builder().data("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        assertThat(cardCreateResponse.data()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardCreateResponse =
            CardCreateResponse.builder().data("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()

        val roundtrippedCardCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardCreateResponse),
                jacksonTypeRef<CardCreateResponse>(),
            )

        assertThat(roundtrippedCardCreateResponse).isEqualTo(cardCreateResponse)
    }
}
