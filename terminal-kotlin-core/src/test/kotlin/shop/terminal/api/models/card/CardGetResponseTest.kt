// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class CardGetResponseTest {

    @Test
    fun create() {
        val cardGetResponse =
            CardGetResponse.builder()
                .data(
                    Card.builder()
                        .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .brand("Visa")
                        .expiration(Card.Expiration.builder().month(12L).year(2023L).build())
                        .last4("1234")
                        .build()
                )
                .build()

        assertThat(cardGetResponse.data())
            .isEqualTo(
                Card.builder()
                    .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .brand("Visa")
                    .expiration(Card.Expiration.builder().month(12L).year(2023L).build())
                    .last4("1234")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardGetResponse =
            CardGetResponse.builder()
                .data(
                    Card.builder()
                        .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .brand("Visa")
                        .expiration(Card.Expiration.builder().month(12L).year(2023L).build())
                        .last4("1234")
                        .build()
                )
                .build()

        val roundtrippedCardGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardGetResponse),
                jacksonTypeRef<CardGetResponse>(),
            )

        assertThat(roundtrippedCardGetResponse).isEqualTo(cardGetResponse)
    }
}
