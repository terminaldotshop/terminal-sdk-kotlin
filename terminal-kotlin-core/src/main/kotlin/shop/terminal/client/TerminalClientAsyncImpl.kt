// File generated from our OpenAPI spec by Stainless.

package shop.terminal.client

import shop.terminal.core.ClientOptions
import shop.terminal.core.getPackageVersion
import shop.terminal.services.async.AddressServiceAsync
import shop.terminal.services.async.AddressServiceAsyncImpl
import shop.terminal.services.async.CardServiceAsync
import shop.terminal.services.async.CardServiceAsyncImpl
import shop.terminal.services.async.CartServiceAsync
import shop.terminal.services.async.CartServiceAsyncImpl
import shop.terminal.services.async.EmailServiceAsync
import shop.terminal.services.async.EmailServiceAsyncImpl
import shop.terminal.services.async.OrderServiceAsync
import shop.terminal.services.async.OrderServiceAsyncImpl
import shop.terminal.services.async.ProductServiceAsync
import shop.terminal.services.async.ProductServiceAsyncImpl
import shop.terminal.services.async.SubscriptionServiceAsync
import shop.terminal.services.async.SubscriptionServiceAsyncImpl
import shop.terminal.services.async.UserServiceAsync
import shop.terminal.services.async.UserServiceAsyncImpl

class TerminalClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TerminalClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: TerminalClient by lazy { TerminalClientImpl(clientOptions) }

    private val products: ProductServiceAsync by lazy {
        ProductServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val addresses: AddressServiceAsync by lazy {
        AddressServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cards: CardServiceAsync by lazy { CardServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val cart: CartServiceAsync by lazy { CartServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val orders: OrderServiceAsync by lazy {
        OrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val emails: EmailServiceAsync by lazy {
        EmailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): TerminalClient = sync

    override fun products(): ProductServiceAsync = products

    override fun users(): UserServiceAsync = users

    override fun addresses(): AddressServiceAsync = addresses

    override fun cards(): CardServiceAsync = cards

    override fun cart(): CartServiceAsync = cart

    override fun orders(): OrderServiceAsync = orders

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    override fun emails(): EmailServiceAsync = emails
}
