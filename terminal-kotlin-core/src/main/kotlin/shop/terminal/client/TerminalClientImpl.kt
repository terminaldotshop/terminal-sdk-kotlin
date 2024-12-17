// File generated from our OpenAPI spec by Stainless.

package shop.terminal.client

import shop.terminal.core.ClientOptions
import shop.terminal.core.getPackageVersion
import shop.terminal.services.blocking.AddressService
import shop.terminal.services.blocking.AddressServiceImpl
import shop.terminal.services.blocking.AppService
import shop.terminal.services.blocking.AppServiceImpl
import shop.terminal.services.blocking.CardService
import shop.terminal.services.blocking.CardServiceImpl
import shop.terminal.services.blocking.CartService
import shop.terminal.services.blocking.CartServiceImpl
import shop.terminal.services.blocking.EmailService
import shop.terminal.services.blocking.EmailServiceImpl
import shop.terminal.services.blocking.OrderService
import shop.terminal.services.blocking.OrderServiceImpl
import shop.terminal.services.blocking.ProductService
import shop.terminal.services.blocking.ProductServiceImpl
import shop.terminal.services.blocking.ProfileService
import shop.terminal.services.blocking.ProfileServiceImpl
import shop.terminal.services.blocking.SubscriptionService
import shop.terminal.services.blocking.SubscriptionServiceImpl
import shop.terminal.services.blocking.TokenService
import shop.terminal.services.blocking.TokenServiceImpl
import shop.terminal.services.blocking.ViewService
import shop.terminal.services.blocking.ViewServiceImpl

class TerminalClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : TerminalClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: TerminalClientAsync by lazy { TerminalClientAsyncImpl(clientOptions) }

    private val product: ProductService by lazy { ProductServiceImpl(clientOptionsWithUserAgent) }

    private val profile: ProfileService by lazy { ProfileServiceImpl(clientOptionsWithUserAgent) }

    private val address: AddressService by lazy { AddressServiceImpl(clientOptionsWithUserAgent) }

    private val card: CardService by lazy { CardServiceImpl(clientOptionsWithUserAgent) }

    private val cart: CartService by lazy { CartServiceImpl(clientOptionsWithUserAgent) }

    private val order: OrderService by lazy { OrderServiceImpl(clientOptionsWithUserAgent) }

    private val subscription: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptionsWithUserAgent)
    }

    private val token: TokenService by lazy { TokenServiceImpl(clientOptionsWithUserAgent) }

    private val app: AppService by lazy { AppServiceImpl(clientOptionsWithUserAgent) }

    private val email: EmailService by lazy { EmailServiceImpl(clientOptionsWithUserAgent) }

    private val view: ViewService by lazy { ViewServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): TerminalClientAsync = async

    override fun product(): ProductService = product

    override fun profile(): ProfileService = profile

    override fun address(): AddressService = address

    override fun card(): CardService = card

    override fun cart(): CartService = cart

    override fun order(): OrderService = order

    override fun subscription(): SubscriptionService = subscription

    override fun token(): TokenService = token

    override fun app(): AppService = app

    override fun email(): EmailService = email

    override fun view(): ViewService = view
}
