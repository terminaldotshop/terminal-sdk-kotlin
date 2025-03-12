// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardListResponseTest {

    @Test
    fun createCardListResponse() {
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
        assertThat(cardListResponse).isNotNull
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
}
