// File generated from our OpenAPI spec by Stainless.

package shop.terminal.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProfileTest {

    @Test
    fun createProfile() {
        val profile =
            Profile.builder()
                .user(
                    Profile.User.builder()
                        .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .email("john@example.com")
                        .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                        .name("John Doe")
                        .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                        .build()
                )
                .build()
        assertThat(profile).isNotNull
        assertThat(profile.user())
            .isEqualTo(
                Profile.User.builder()
                    .id("usr_XXXXXXXXXXXXXXXXXXXXXXXXX")
                    .email("john@example.com")
                    .fingerprint("183ded44-24d0-480e-9908-c022eff8d111")
                    .name("John Doe")
                    .stripeCustomerId("cus_XXXXXXXXXXXXXXXXX")
                    .build()
            )
    }
}
