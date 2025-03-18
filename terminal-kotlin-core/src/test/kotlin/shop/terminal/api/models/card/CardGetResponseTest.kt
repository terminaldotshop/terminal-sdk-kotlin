// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.card

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardGetResponseTest {

    @Test
    fun createCardGetResponse() {
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
        assertThat(cardGetResponse).isNotNull
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
}
