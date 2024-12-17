// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.client

import shop.terminal.api.services.blocking.AddressService
import shop.terminal.api.services.blocking.AppService
import shop.terminal.api.services.blocking.CardService
import shop.terminal.api.services.blocking.CartService
import shop.terminal.api.services.blocking.EmailService
import shop.terminal.api.services.blocking.OrderService
import shop.terminal.api.services.blocking.ProductService
import shop.terminal.api.services.blocking.ProfileService
import shop.terminal.api.services.blocking.SubscriptionService
import shop.terminal.api.services.blocking.TokenService
import shop.terminal.api.services.blocking.ViewService

interface TerminalClient {

    fun async(): TerminalClientAsync

    fun product(): ProductService

    fun profile(): ProfileService

    fun address(): AddressService

    fun card(): CardService

    fun cart(): CartService

    fun order(): OrderService

    fun subscription(): SubscriptionService

    fun token(): TokenService

    fun app(): AppService

    fun email(): EmailService

    fun view(): ViewService
}
