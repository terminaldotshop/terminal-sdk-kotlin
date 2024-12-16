// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartSetCardParamsTest {

    @Test
    fun createCartSetCardParams() {
        CartSetCardParams.builder().cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun getBody() {
        val params = CartSetCardParams.builder().cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CartSetCardParams.builder().cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }
}
