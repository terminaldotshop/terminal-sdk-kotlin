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
import shop.terminal.services.async.ProfileServiceAsync
import shop.terminal.services.async.ProfileServiceAsyncImpl
import shop.terminal.services.async.SubscriptionServiceAsync
import shop.terminal.services.async.SubscriptionServiceAsyncImpl

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

    private val product: ProductServiceAsync by lazy {
        ProductServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val profile: ProfileServiceAsync by lazy {
        ProfileServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val address: AddressServiceAsync by lazy {
        AddressServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val card: CardServiceAsync by lazy { CardServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val cart: CartServiceAsync by lazy { CartServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val order: OrderServiceAsync by lazy {
        OrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val subscription: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val email: EmailServiceAsync by lazy {
        EmailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): TerminalClient = sync

    override fun product(): ProductServiceAsync = product

    override fun profile(): ProfileServiceAsync = profile

    override fun address(): AddressServiceAsync = address

    override fun card(): CardServiceAsync = card

    override fun cart(): CartServiceAsync = cart

    override fun order(): OrderServiceAsync = order

    override fun subscription(): SubscriptionServiceAsync = subscription

    override fun email(): EmailServiceAsync = email
}
