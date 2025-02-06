// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartSetCardParamsTest {

    @Test
    fun create() {
        CartSetCardParams.builder().cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
    }

    @Test
    fun body() {
        val params = CartSetCardParams.builder().cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CartSetCardParams.builder().cardId("crd_XXXXXXXXXXXXXXXXXXXXXXXXX").build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("crd_XXXXXXXXXXXXXXXXXXXXXXXXX")
    }
}
