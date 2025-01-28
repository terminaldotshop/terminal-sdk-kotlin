// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.client

import shop.terminal.api.core.ClientOptions
import shop.terminal.api.core.getPackageVersion
import shop.terminal.api.services.async.AddressServiceAsync
import shop.terminal.api.services.async.AddressServiceAsyncImpl
import shop.terminal.api.services.async.AppServiceAsync
import shop.terminal.api.services.async.AppServiceAsyncImpl
import shop.terminal.api.services.async.CardServiceAsync
import shop.terminal.api.services.async.CardServiceAsyncImpl
import shop.terminal.api.services.async.CartServiceAsync
import shop.terminal.api.services.async.CartServiceAsyncImpl
import shop.terminal.api.services.async.EmailServiceAsync
import shop.terminal.api.services.async.EmailServiceAsyncImpl
import shop.terminal.api.services.async.OrderServiceAsync
import shop.terminal.api.services.async.OrderServiceAsyncImpl
import shop.terminal.api.services.async.ProductServiceAsync
import shop.terminal.api.services.async.ProductServiceAsyncImpl
import shop.terminal.api.services.async.ProfileServiceAsync
import shop.terminal.api.services.async.ProfileServiceAsyncImpl
import shop.terminal.api.services.async.SubscriptionServiceAsync
import shop.terminal.api.services.async.SubscriptionServiceAsyncImpl
import shop.terminal.api.services.async.TokenServiceAsync
import shop.terminal.api.services.async.TokenServiceAsyncImpl
import shop.terminal.api.services.async.ViewServiceAsync
import shop.terminal.api.services.async.ViewServiceAsyncImpl

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

    private val token: TokenServiceAsync by lazy {
        TokenServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val app: AppServiceAsync by lazy { AppServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val email: EmailServiceAsync by lazy {
        EmailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val view: ViewServiceAsync by lazy { ViewServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): TerminalClient = sync

    override fun product(): ProductServiceAsync = product

    override fun profile(): ProfileServiceAsync = profile

    override fun address(): AddressServiceAsync = address

    override fun card(): CardServiceAsync = card

    override fun cart(): CartServiceAsync = cart

    override fun order(): OrderServiceAsync = order

    override fun subscription(): SubscriptionServiceAsync = subscription

    override fun token(): TokenServiceAsync = token

    override fun app(): AppServiceAsync = app

    override fun email(): EmailServiceAsync = email

    override fun view(): ViewServiceAsync = view

    override fun close() = clientOptions.httpClient.close()
}
