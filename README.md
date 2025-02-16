# Terminal Kotlin API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/shop.terminal.api/terminal-kotlin)](https://central.sonatype.com/artifact/shop.terminal.api/terminal-kotlin/0.1.0-alpha.6)

<!-- x-release-please-end -->

The Terminal Kotlin SDK provides convenient access to the Terminal REST API from applications written in Kotlin.

The Terminal Kotlin SDK is similar to the Terminal Java SDK but with minor differences that make it more ergonomic for use in Kotlin, such as nullable values instead of `Optional`, `Sequence` instead of `Stream`, and suspend functions instead of `CompletableFuture`.

It is generated with [Stainless](https://www.stainlessapi.com/).

The REST API documentation can be found on [terminal.shop](https://terminal.shop/docs).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("shop.terminal.api:terminal-kotlin:0.1.0-alpha.6")
```

### Maven

```xml
<dependency>
    <groupId>shop.terminal.api</groupId>
    <artifactId>terminal-kotlin</artifactId>
    <version>0.1.0-alpha.6</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

### Configure the client

Use `TerminalOkHttpClient.builder()` to configure the client. At a minimum you need to set `.bearerToken()`:

```kotlin
import shop.terminal.api.client.TerminalClient
import shop.terminal.api.client.okhttp.TerminalOkHttpClient

val client: TerminalClient = TerminalOkHttpClient.builder()
    .bearerToken("My Bearer Token")
    .build()
```

Alternately, set the environment with `TERMINAL_BEARER_TOKEN`, and use `TerminalOkHttpClient.fromEnv()` to read from the environment.

```kotlin
import shop.terminal.api.client.TerminalClient
import shop.terminal.api.client.okhttp.TerminalOkHttpClient

val client: TerminalClient = TerminalOkHttpClient.fromEnv()

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
val client: TerminalClient = TerminalOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build()
```

| Property    | Environment variable    | Required | Default value |
| ----------- | ----------------------- | -------- | ------------- |
| bearerToken | `TERMINAL_BEARER_TOKEN` | true     | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new product, first use the `ProductListParams` builder to specify attributes, then pass that to the `list` method of the `product` service.

```kotlin
import shop.terminal.api.models.ProductListParams
import shop.terminal.api.models.ProductListResponse

val params: ProductListParams = ProductListParams.builder().build()
val product: ProductListResponse = client.product().list(params)
```

---

## Requests

### Parameters and bodies

To make a request to the Terminal API, you generally build an instance of the appropriate `Params` class.

See [Undocumented request params](#undocumented-request-params) for how to send arbitrary parameters.

## Responses

### Response validation

When receiving a response, the Terminal Kotlin SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Kotlin type. If you directly access the mistaken property, the SDK will throw an unchecked `TerminalInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```kotlin
import shop.terminal.api.models.ProductListResponse

val product: ProductListResponse = client.product().list().validate()
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```kotlin
import java.util.Optional
import shop.terminal.api.core.JsonField

val field: JsonField = responseObj._field

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  val jsonString: String? = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  val myObj: MyClass = responseObj._field.asUnknown()?.convert(MyClass.class)
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```kotlin
import shop.terminal.api.core.JsonValue

val secret: JsonValue = product._additionalProperties().get("secret_field")
```

---

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`TerminalException`** - Base exception for all exceptions

- **`TerminalServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

  | 400    | BadRequestException           |
  | ------ | ----------------------------- |
  | 401    | AuthenticationException       |
  | 403    | PermissionDeniedException     |
  | 404    | NotFoundException             |
  | 422    | UnprocessableEntityException  |
  | 429    | RateLimitException            |
  | 5xx    | InternalServerException       |
  | others | UnexpectedStatusCodeException |

- **`TerminalIoException`** - I/O networking errors
- **`TerminalInvalidDataException`** - any other exceptions on the client side, e.g.:
  - We failed to serialize the request body
  - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default. You can provide a `maxRetries` on the client builder to configure this:

```kotlin
import shop.terminal.api.client.TerminalClient
import shop.terminal.api.client.okhttp.TerminalOkHttpClient

val client: TerminalClient = TerminalOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```kotlin
import java.time.Duration
import shop.terminal.api.client.TerminalClient
import shop.terminal.api.client.okhttp.TerminalOkHttpClient

val client: TerminalClient = TerminalOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```kotlin
import java.net.InetSocketAddress
import java.net.Proxy
import shop.terminal.api.client.TerminalClient
import shop.terminal.api.client.okhttp.TerminalOkHttpClient

val client: TerminalClient = TerminalOkHttpClient.builder()
    .fromEnv()
    .proxy(Proxy(Proxy.Type.HTTP, InetSocketAddress("example.com", 8080)))
    .build()
```

### Environments

Requests are made to the production environment by default. You can connect to other environments, like `dev`, via the client builder:

```kotlin
import shop.terminal.api.client.TerminalClient
import shop.terminal.api.client.okhttp.TerminalOkHttpClient

val client: TerminalClient = TerminalOkHttpClient.builder()
    .fromEnv()
    .dev()
    .build()
```

## Making custom/undocumented requests

This library is typed for convenient access to the documented API. If you need to access undocumented params or response properties, the library can still be used.

### Undocumented request params

In [Example: creating a resource](#example-creating-a-resource) above, we used the `ProductListParams.builder()` to pass to the `list` method of the `product` service.

Sometimes, the API may support other properties that are not yet supported in the Kotlin SDK types. In that case, you can attach them using raw setters:

```kotlin
import shop.terminal.api.core.JsonValue
import shop.terminal.api.models.ProductListParams

val params: ProductListParams = ProductListParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build()
```

You can also use the `putAdditionalProperty` method on nested headers, query params, or body objects.

### Undocumented response properties

To access undocumented response properties, you can use `res._additionalProperties()` on a response object to get a map of untyped fields of type `Map<String, JsonValue>`. You can then access fields like `res._additionalProperties().get("secret_prop").asString()` or use other helpers defined on the `JsonValue` class to extract it to a desired type.

## Logging

We use the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

You can enable logging by setting the environment variable `TERMINAL_LOG` to `info`.

```sh
$ export TERMINAL_LOG=info
```

Or to `debug` for more verbose logging.

```sh
$ export TERMINAL_LOG=debug
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/terminaldotshop/terminal-sdk-kotlin/issues) with questions, bugs, or suggestions.
