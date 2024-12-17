// File generated from our OpenAPI spec by Stainless.

package shop.terminal.api.client

import shop.terminal.api.services.async.AddressServiceAsync
import shop.terminal.api.services.async.AppServiceAsync
import shop.terminal.api.services.async.CardServiceAsync
import shop.terminal.api.services.async.CartServiceAsync
import shop.terminal.api.services.async.EmailServiceAsync
import shop.terminal.api.services.async.OrderServiceAsync
import shop.terminal.api.services.async.ProductServiceAsync
import shop.terminal.api.services.async.ProfileServiceAsync
import shop.terminal.api.services.async.SubscriptionServiceAsync
import shop.terminal.api.services.async.TokenServiceAsync
import shop.terminal.api.services.async.ViewServiceAsync

interface TerminalClientAsync {

    fun sync(): TerminalClient

    fun product(): ProductServiceAsync

    fun profile(): ProfileServiceAsync

    fun address(): AddressServiceAsync

    fun card(): CardServiceAsync

    fun cart(): CartServiceAsync

    fun order(): OrderServiceAsync

    fun subscription(): SubscriptionServiceAsync

    fun token(): TokenServiceAsync

    fun app(): AppServiceAsync

    fun email(): EmailServiceAsync

    fun view(): ViewServiceAsync
}
