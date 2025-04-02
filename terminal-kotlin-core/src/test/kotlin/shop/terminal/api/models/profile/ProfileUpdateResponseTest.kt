// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.models.profile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.core.jsonMapper

internal class ProfileUpdateResponseTest {

    @Test
    fun create() {
        val profileUpdateResponse =
            ProfileUpdateResponse.builder()
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

        assertThat(profileUpdateResponse.data())
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileUpdateResponse =
            ProfileUpdateResponse.builder()
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

        val roundtrippedProfileUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileUpdateResponse),
                jacksonTypeRef<ProfileUpdateResponse>(),
            )

        assertThat(roundtrippedProfileUpdateResponse).isEqualTo(profileUpdateResponse)
    }
}
