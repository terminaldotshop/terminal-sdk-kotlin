// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserUpdateResponseTest {

    @Test
    fun createUserUpdateResponse() {
        val userUpdateResponse =
            UserUpdateResponse.builder()
                .data(
                    User.builder()
                        .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .email("john@example.com")
                        .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                        .name("John Doe")
                        .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                        .build()
                )
                .build()
        assertThat(userUpdateResponse).isNotNull
        assertThat(userUpdateResponse.data())
            .isEqualTo(
                User.builder()
                    .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .email("john@example.com")
                    .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                    .name("John Doe")
                    .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                    .build()
            )
    }
}
