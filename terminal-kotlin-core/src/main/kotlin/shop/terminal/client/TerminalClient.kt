// File generated from our OpenAPI spec by Stainless.

package shop.terminal.client

import shop.terminal.services.blocking.AddressService
import shop.terminal.services.blocking.CardService
import shop.terminal.services.blocking.CartService
import shop.terminal.services.blocking.EmailService
import shop.terminal.services.blocking.OrderService
import shop.terminal.services.blocking.ProductService
import shop.terminal.services.blocking.SubscriptionService
import shop.terminal.services.blocking.UserService

interface TerminalClient {

    fun async(): TerminalClientAsync

    fun products(): ProductService

    fun users(): UserService

    fun addresses(): AddressService

    fun cards(): CardService

    fun cart(): CartService

    fun orders(): OrderService

    fun subscriptions(): SubscriptionService

    fun emails(): EmailService
}
