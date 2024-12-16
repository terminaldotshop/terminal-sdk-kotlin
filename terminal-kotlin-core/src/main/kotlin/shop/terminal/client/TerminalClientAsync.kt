// File generated from our OpenAPI spec by Stainless.

package shop.terminal.client

import shop.terminal.services.async.AddressServiceAsync
import shop.terminal.services.async.CardServiceAsync
import shop.terminal.services.async.CartServiceAsync
import shop.terminal.services.async.EmailServiceAsync
import shop.terminal.services.async.OrderServiceAsync
import shop.terminal.services.async.ProductServiceAsync
import shop.terminal.services.async.SubscriptionServiceAsync
import shop.terminal.services.async.UserServiceAsync

interface TerminalClientAsync {

    fun sync(): TerminalClient

    fun products(): ProductServiceAsync

    fun users(): UserServiceAsync

    fun addresses(): AddressServiceAsync

    fun cards(): CardServiceAsync

    fun cart(): CartServiceAsync

    fun orders(): OrderServiceAsync

    fun subscriptions(): SubscriptionServiceAsync

    fun emails(): EmailServiceAsync
}
