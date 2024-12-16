// File generated from our OpenAPI spec by Stainless.

package shop.terminal.client

import shop.terminal.core.ClientOptions
import shop.terminal.core.getPackageVersion
import shop.terminal.services.blocking.AddressService
import shop.terminal.services.blocking.AddressServiceImpl
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
import shop.terminal.services.blocking.SubscriptionService
import shop.terminal.services.blocking.SubscriptionServiceImpl
import shop.terminal.services.blocking.UserService
import shop.terminal.services.blocking.UserServiceImpl

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

    private val products: ProductService by lazy { ProductServiceImpl(clientOptionsWithUserAgent) }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    private val addresses: AddressService by lazy { AddressServiceImpl(clientOptionsWithUserAgent) }

    private val cards: CardService by lazy { CardServiceImpl(clientOptionsWithUserAgent) }

    private val cart: CartService by lazy { CartServiceImpl(clientOptionsWithUserAgent) }

    private val orders: OrderService by lazy { OrderServiceImpl(clientOptionsWithUserAgent) }

    private val subscriptions: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptionsWithUserAgent)
    }

    private val emails: EmailService by lazy { EmailServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): TerminalClientAsync = async

    override fun products(): ProductService = products

    override fun users(): UserService = users

    override fun addresses(): AddressService = addresses

    override fun cards(): CardService = cards

    override fun cart(): CartService = cart

    override fun orders(): OrderService = orders

    override fun subscriptions(): SubscriptionService = subscriptions

    override fun emails(): EmailService = emails
}
