// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import shop.terminal.api.client.okhttp.TerminalOkHttpClient
import shop.terminal.api.core.jsonMapper
import shop.terminal.api.models.product.Product
import shop.terminal.api.models.product.ProductVariant
import shop.terminal.api.models.view.Region

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/terminal-kotlin-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = TerminalOkHttpClient.builder().bearerToken("My Bearer Token").build()

        assertThat(client).isNotNull()
        assertThat(client.product()).isNotNull()
        assertThat(client.profile()).isNotNull()
        assertThat(client.address()).isNotNull()
        assertThat(client.card()).isNotNull()
        assertThat(client.cart()).isNotNull()
        assertThat(client.order()).isNotNull()
        assertThat(client.subscription()).isNotNull()
        assertThat(client.token()).isNotNull()
        assertThat(client.app()).isNotNull()
        assertThat(client.email()).isNotNull()
        assertThat(client.view()).isNotNull()
    }

    @Test
    fun productRoundtrip() {
        val jsonMapper = jsonMapper()
        val product =
            Product.builder()
                .id("prd_XXXXXXXXXXXXXXXXXXXXXXXXX")
                .description(
                    "The interpolation of Caturra and Castillo varietals from Las Cochitas creates this refreshing citrusy and complex coffee."
                )
                .name("[object Object]")
                .addVariant(
                    ProductVariant.builder()
                        .id("var_XXXXXXXXXXXXXXXXXXXXXXXXX")
                        .name("12oz")
                        .price(2200L)
                        .tags(
                            ProductVariant.Tags.builder()
                                .app("app")
                                .marketEu(true)
                                .marketGlobal(true)
                                .marketNa(true)
                                .build()
                        )
                        .build()
                )
                .order(100L)
                .subscription(Product.Subscription.ALLOWED)
                .tags(
                    Product.Tags.builder()
                        .app("app")
                        .color("color")
                        .featured(true)
                        .marketEu(true)
                        .marketGlobal(true)
                        .marketNa(true)
                        .build()
                )
                .timeHidden("timeHidden")
                .build()

        val roundtrippedProduct =
            jsonMapper.readValue(jsonMapper.writeValueAsString(product), jacksonTypeRef<Product>())

        assertThat(roundtrippedProduct).isEqualTo(product)
    }

    @Test
    fun regionRoundtrip() {
        val jsonMapper = jsonMapper()
        val region = Region.NA

        val roundtrippedRegion =
            jsonMapper.readValue(jsonMapper.writeValueAsString(region), jacksonTypeRef<Region>())

        assertThat(roundtrippedRegion).isEqualTo(region)
    }
}
