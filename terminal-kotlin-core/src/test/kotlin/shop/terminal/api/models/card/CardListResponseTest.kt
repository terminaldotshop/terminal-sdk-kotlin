// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class CardListResponseTest {

    @Test
    fun create() {
        val cardListResponse =
            CardListResponse.builder()
                .addData(
                    Card.builder()
                        .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .brand("Visa")
                        .expiration(Card.Expiration.builder().month(12L).year(2023L).build())
                        .last4("1234")
                        .build()
                )
                .build()

        assertThat(cardListResponse.data())
            .containsExactly(
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
        val cardListResponse =
            CardListResponse.builder()
                .addData(
                    Card.builder()
                        .id("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .brand("Visa")
                        .expiration(Card.Expiration.builder().month(12L).year(2023L).build())
                        .last4("1234")
                        .build()
                )
                .build()

        val roundtrippedCardListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardListResponse),
                jacksonTypeRef<CardListResponse>(),
            )

        assertThat(roundtrippedCardListResponse).isEqualTo(cardListResponse)
    }
}
