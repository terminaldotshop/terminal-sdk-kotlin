// File generated from our OpenAPI spec by Stainless.

package shop.terminal.client

import shop.terminal.services.async.AddressServiceAsync
import shop.terminal.services.async.CardServiceAsync
import shop.terminal.services.async.CartServiceAsync
import shop.terminal.services.async.EmailServiceAsync
import shop.terminal.services.async.OrderServiceAsync
import shop.terminal.services.async.ProductServiceAsync
import shop.terminal.services.async.ProfileServiceAsync
import shop.terminal.services.async.SubscriptionServiceAsync
import shop.terminal.services.async.ViewServiceAsync

interface TerminalClientAsync {

    fun sync(): TerminalClient

    fun product(): ProductServiceAsync

    fun profile(): ProfileServiceAsync

    fun address(): AddressServiceAsync

    fun card(): CardServiceAsync

    fun cart(): CartServiceAsync

    fun order(): OrderServiceAsync

    fun subscription(): SubscriptionServiceAsync

    fun email(): EmailServiceAsync

    fun view(): ViewServiceAsync
}
