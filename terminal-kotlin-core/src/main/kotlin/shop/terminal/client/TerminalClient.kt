// File generated from our OpenAPI spec by Stainless.

package shop.terminal.client

import shop.terminal.services.blocking.AddressService
import shop.terminal.services.blocking.CardService
import shop.terminal.services.blocking.CartService
import shop.terminal.services.blocking.EmailService
import shop.terminal.services.blocking.OrderService
import shop.terminal.services.blocking.ProductService
import shop.terminal.services.blocking.ProfileService
import shop.terminal.services.blocking.SubscriptionService
import shop.terminal.services.blocking.ViewService

interface TerminalClient {

    fun async(): TerminalClientAsync

    fun product(): ProductService

    fun profile(): ProfileService

    fun address(): AddressService

    fun card(): CardService

    fun cart(): CartService

    fun order(): OrderService

    fun subscription(): SubscriptionService

    fun email(): EmailService

    fun view(): ViewService
}
