// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardCreateParamsTest {

    @Test
    fun createCardCreateParams() {
        CardCreateParams.builder().token("tok_1N3T00LkdIwHu7ixt44h1F8k").build()
    }

    @Test
    fun getBody() {
        val params = CardCreateParams.builder().token("tok_1N3T00LkdIwHu7ixt44h1F8k").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("tok_1N3T00LkdIwHu7ixt44h1F8k")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CardCreateParams.builder().token("tok_1N3T00LkdIwHu7ixt44h1F8k").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.token()).isEqualTo("tok_1N3T00LkdIwHu7ixt44h1F8k")
    }
}
