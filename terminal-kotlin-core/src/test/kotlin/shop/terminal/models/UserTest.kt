// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserTest {

    @Test
    fun createUser() {
        val user =
            User.builder()
                .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .email("john@example.com")
                .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                .name("John Doe")
                .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                .build()
        assertThat(user).isNotNull
        assertThat(user.id()).isEqualTo("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
        assertThat(user.email()).isEqualTo("john@example.com")
        assertThat(user.fingerprint()).isEqualTo("183ded44-24d0-480e-9908-c022eff8d111")
        assertThat(user.name()).isEqualTo("John Doe")
        assertThat(user.stripeCustomerId()).isEqualTo("cus_XXXXXXXXXXXXXXXXX")
    }
}
