// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.profile

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProfileMeResponseTest {

    @Test
    fun createProfileMeResponse() {
        val profileMeResponse =
            ProfileMeResponse.builder()
                .data(
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
                )
                .build()
        assertThat(profileMeResponse).isNotNull
        assertThat(profileMeResponse.data())
            .isEqualTo(
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
            )
    }
}
