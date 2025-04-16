# Changelog

## 2.1.0 (2025-04-16)

Full Changelog: [v2.0.0...v2.1.0](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v2.0.0...v2.1.0)

### Features

* **api:** include created timestamps ([ad4816c](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/ad4816c24c18e6dc71e155b012a2dd2925b64d64))
* **client:** support setting base URL via env var ([39f358c](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/39f358c5584f013d8012b049136812512d358e7d))


### Bug Fixes

* **client:** bump to better jackson version ([e651123](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/e651123c791e78d4a2ff00497b36170998320eb5))


### Chores

* **internal:** expand CI branch coverage ([99c203a](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/99c203a467d310b18a214a2130da555d179aa713))
* **internal:** reduce CI branch coverage ([143fa0e](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/143fa0ed7647d77624494332e74e1984f78c9f9a))


### Documentation

* **client:** update jackson compat error message ([1606e25](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/1606e259485e45b1b0c78426a0078677f0728cd1))
* explain jackson compat in readme ([46ca9f1](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/46ca9f1677cf433d0b4f89fa6447b64070722ca2))
* update documentation links to be more uniform ([1a2cf7b](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/1a2cf7baddd2ed0e34b2fddaeca4edbf97875cac))

## 2.0.0 (2025-04-09)

Full Changelog: [v1.6.1...v2.0.0](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v1.6.1...v2.0.0)

### ⚠ BREAKING CHANGES

* **client:** refactor exception structure and methods ([#144](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/144))

### Features

* **api:** include shipment tracking info on order ([#162](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/162)) ([8b7f320](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/8b7f3208f5f98c67abe432c21826a5fd84d6ca9e))
* **client:** add enum validation method ([a95f436](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a95f436acd43b98ec56cc7969db87335f00e3431))
* **client:** expose request body setter and getter ([#157](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/157)) ([4ede5bd](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/4ede5bd7dcc01b54ed366207ce53c926e2ad8103))
* **client:** make datetime deserialization more lenient ([#156](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/156)) ([514a5b8](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/514a5b851c4c6027ee47626cf7f189b84ce6b692))
* **client:** make union deserialization more robust ([#155](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/155)) ([a95f436](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a95f436acd43b98ec56cc7969db87335f00e3431))
* **client:** support a lower jackson version ([#149](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/149)) ([642a57d](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/642a57dce8e18246d332e27a8e9ff0012186a712))
* **client:** throw on incompatible jackson version ([642a57d](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/642a57dce8e18246d332e27a8e9ff0012186a712))


### Bug Fixes

* **client:** don't call `validate()` during deserialization if we don't have to ([#151](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/151)) ([cbabcd5](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/cbabcd5a23b5fe9194fc478a19f5b57504528d51))
* **client:** limit json deserialization coercion ([#152](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/152)) ([d77aa7e](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/d77aa7ea279b36452917dfa5e03fc0da34305de1))
* **client:** map deserialization bug ([394d071](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/394d071c3f53c0ac657f61b043ff91be792c6ef3))
* pluralize `list` response variables ([#154](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/154)) ([4e0fecc](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/4e0fecc26b39eb5e9e9fad90725bc860a34e7ad2))
* remove trailing / for environments ([#153](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/153)) ([70d7774](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/70d7774984e70b0d8bbb9315ef4860c24e9a950c))


### Performance Improvements

* **client:** cached parsed type in `HttpResponseFor` ([#158](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/158)) ([fa5712d](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/fa5712da58ffe14a636e61b55e75b4abb3a0c1d8))


### Chores

* **api:** more examples ([#142](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/142)) ([865c486](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/865c4862913eff986af2c5634068076de0eef96d))
* **client:** refactor exception structure and methods ([#144](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/144)) ([2dfb04c](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/2dfb04cd76ddfdba4eb3ede63fc839208f491ac5))
* **client:** remove unnecessary json state from some query param classes ([a95f436](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a95f436acd43b98ec56cc7969db87335f00e3431))
* **internal:** add invalid json deserialization tests ([a95f436](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a95f436acd43b98ec56cc7969db87335f00e3431))
* **internal:** add json roundtripping tests ([a95f436](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a95f436acd43b98ec56cc7969db87335f00e3431))
* **internal:** add missing release please block ([#143](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/143)) ([cc32863](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/cc32863a557137982bac2b3c65b1699725c68d7a))
* **internal:** delete unused methods and annotations ([#150](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/150)) ([394d071](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/394d071c3f53c0ac657f61b043ff91be792c6ef3))
* **internal:** make multipart assertions more robust ([1bac7ac](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/1bac7acc9e9aef942a0be030309f5cfde1ac4acf))
* **internal:** refactor enum query param serialization ([#140](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/140)) ([404cc0b](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/404cc0bc51dc16d6ded9370de7b3119d98ba0060))
* **internal:** remove unnecessary `assertNotNull` calls ([1bac7ac](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/1bac7acc9e9aef942a0be030309f5cfde1ac4acf))
* **internal:** remove unnecessary import ([#146](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/146)) ([a4b23e0](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a4b23e097052afac70c7ac3a8b86967592ddf99a))
* **tests:** improve enum examples ([#161](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/161)) ([14ec1dc](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/14ec1dc65d84e96099587f245e32bc249003a9ec))


### Documentation

* add comments to `JsonField` classes ([#159](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/159)) ([8a95934](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/8a95934aefee42bc20d145fa776341b27eada61a))
* document how to forcibly omit required field ([5827e5e](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/5827e5eb1c742f0d5ed4288bc352d773d4b934b9))
* minor readme tweak ([#148](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/148)) ([9443821](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/94438212f96e7ec9a17d7e459ca0a22576871689))
* refine comments on multipart params ([#145](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/145)) ([1bac7ac](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/1bac7acc9e9aef942a0be030309f5cfde1ac4acf))
* swap examples used in readme ([#160](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/160)) ([5827e5e](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/5827e5eb1c742f0d5ed4288bc352d773d4b934b9))
* update readme exception docs ([#147](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/147)) ([142a8b2](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/142a8b2fd8d0e90f4808a5168298d08bb1243e4c))

## 1.6.1 (2025-03-19)

Full Changelog: [v1.6.0...v1.6.1](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v1.6.0...v1.6.1)

### Bug Fixes

* **client:** support kotlin 1.8 runtime ([#139](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/139)) ([6eb9e26](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/6eb9e26f0cd39b8eb6e0de78f8719cb6b6316321))


### Chores

* **internal:** codegen related update ([#135](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/135)) ([6407d8f](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/6407d8f9f099a54e17afc5cba93051bdfebc7862))
* **internal:** delete duplicate tests ([0b08996](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/0b089965d006f74891472426896e620f7926c2eb))
* **internal:** generate more tests ([592cc21](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/592cc21cf3a9b2ad2d72728bd40fc630f350a049))
* **internal:** refactor some test assertions ([0b08996](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/0b089965d006f74891472426896e620f7926c2eb))
* **internal:** reformat some tests ([#138](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/138)) ([592cc21](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/592cc21cf3a9b2ad2d72728bd40fc630f350a049))
* **internal:** remove extra empty newlines ([#133](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/133)) ([266e394](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/266e3943f2181718e6e6b3f8bac39fe9091dae17))
* **internal:** rename `getPathParam` ([#137](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/137)) ([0b08996](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/0b089965d006f74891472426896e620f7926c2eb))
* **internal:** reorder some params methodsc ([0b08996](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/0b089965d006f74891472426896e620f7926c2eb))
* **internal:** version bump ([#131](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/131)) ([61e7f7d](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/61e7f7d94fd225ed07db032b75d1adc722c5047b))


### Documentation

* add `build` method comments ([#136](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/136)) ([e044267](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/e0442676988e657cc04c08bf7d4d9e961d24ce38))
* deduplicate and refine comments ([#134](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/134)) ([c5687b9](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/c5687b9744ebbe90a6c196468bc9b30b6159a256))

## 1.6.0 (2025-03-13)

Full Changelog: [v1.5.0...v1.6.0](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v1.5.0...v1.6.0)

### Features

* **api:** region model ([#130](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/130)) ([2e68142](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/2e6814280d2c560ceef68c29a324fddeb9878db6))


### Chores

* **internal:** version bump ([#128](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/128)) ([b405583](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/b405583b0b3b2774fef5ae531a06dbae2dedee82))

## 1.5.0 (2025-03-13)

Full Changelog: [v1.4.0...v1.5.0](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v1.4.0...v1.5.0)

### Features

* **api:** region type ([#127](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/127)) ([28f790d](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/28f790d7b52adc33de8f573fa4c05c92b97e949b))


### Chores

* **internal:** version bump ([#125](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/125)) ([1e9f4c3](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/1e9f4c3f94fbf5b85869d3103c639317f4ea3445))

## 1.4.0 (2025-03-13)

Full Changelog: [v1.3.0...v1.4.0](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v1.3.0...v1.4.0)

### Features

* **api:** add region to `GET /view/init` ([#124](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/124)) ([e1fdc46](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/e1fdc468de57e45783d49eedc73b72ccad518e65))


### Chores

* **internal:** version bump ([#122](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/122)) ([8a203ce](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/8a203ce56a19a071105264836c3b8b56ec754131))

## 1.3.0 (2025-03-13)

Full Changelog: [v1.2.0...v1.3.0](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v1.2.0...v1.3.0)

### Features

* **api:** remove gift cards ([#121](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/121)) ([4522484](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/4522484f0e53edb25fa8dd74f766ac35bb35f5ea))


### Chores

* **internal:** version bump ([#119](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/119)) ([007908c](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/007908c01544c72632232696ffc2711376ffe8b7))

## 1.2.0 (2025-03-13)

Full Changelog: [v1.1.0...v1.2.0](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v1.1.0...v1.2.0)

### Features

* **api:** clear cart api ([#118](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/118)) ([5de62a7](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/5de62a7c1f7c0b4db705e84ea756a0508028a5f7))


### Chores

* **internal:** codegen related update ([#112](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/112)) ([56e910e](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/56e910ef66376e50878cab6513cea626fd468eed))
* **internal:** codegen related update ([#113](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/113)) ([3065c22](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/3065c22952eeb0b2c602a77eabf5d47220aa6c29))
* **internal:** codegen related update ([#114](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/114)) ([5a0e889](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/5a0e889abe3d0b725faa0d2c791d01c9ba696455))
* **internal:** codegen related update ([#115](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/115)) ([658f86d](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/658f86dda8d421afbd9c22bdd486bb21e8b98a09))
* **internal:** codegen related update ([#116](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/116)) ([d94b492](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/d94b4927a308ab53cfeda2bca234274a520a87b0))
* **internal:** codegen related update ([#117](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/117)) ([79f35f2](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/79f35f29af0ac2e247fc899ad0263a77f67bae0e))
* update SDK settings ([#110](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/110)) ([3d5506a](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/3d5506a6baa424a1d39e472c3b6514f061824083))

## 1.1.0 (2025-03-11)

Full Changelog: [v1.0.0...v1.1.0](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v1.0.0...v1.1.0)

### ⚠ BREAKING CHANGES

* **client:** move classes into subpackages and shorten names ([#108](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/108))

### Features

* **api:** gift cards ([#109](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/109)) ([8332d32](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/8332d32141c4433c6b2771ed265b798f6af0ff0b))


### Chores

* **client:** move classes into subpackages and shorten names ([#108](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/108)) ([685c6c7](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/685c6c777f34ad8f3f549bf79b561e913c361c59))
* **internal:** version bump ([#104](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/104)) ([9455b1d](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/9455b1d231ff5a6fd458343a6c93a295c09ad5d4))


### Documentation

* document `JsonValue` construction in readme ([#107](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/107)) ([0f9b722](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/0f9b722cc51bf8072107e9e82aedb47050597580))
* revise readme docs about nested params ([#106](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/106)) ([8790bdd](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/8790bdd50b237ec41bde071f7edd989489f00906))

## 1.0.0 (2025-03-10)

Full Changelog: [v0.1.0-alpha.7...v1.0.0](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v0.1.0-alpha.7...v1.0.0)

### ⚠ BREAKING CHANGES

* **client:** refactor multipart formdata impl ([#93](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/93))

### Features

* **api:** manual updates ([#66](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/66)) ([7183993](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/71839934cc4426ee1a9d4fd349d011ffb610f6d2))
* **api:** manual updates ([#80](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/80)) ([f3449f2](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/f3449f2e27d97f8e11c779d9460f73c24e40077e))
* **api:** manual updates ([#83](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/83)) ([19e0a12](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/19e0a122c5ddba31a33097968cd82f6f630bdd4b))
* **api:** manual updates ([#88](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/88)) ([b4c9ac5](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/b4c9ac537abb6961ca00d8b97489f585ee1970e6))
* **api:** manual updates ([#89](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/89)) ([651a89c](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/651a89ce271c613e8923b9431ef814b73b4c1cf2))
* **api:** manual updates ([#98](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/98)) ([cef7902](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/cef790262610535f3a73d70578e767a09948f83d))
* **client:** allow omitting params object when none required ([#81](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/81)) ([ad3463f](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/ad3463f54350daab6aec152b76f59306b9f2d5e2))
* **client:** detect binary incompatible jackson versions ([#97](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/97)) ([397a2a4](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/397a2a4f859e5a9a7a39ce4050f1a164054d481e))
* **client:** support `JsonField#asX()` for known values ([#71](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/71)) ([b0251b5](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/b0251b52a2f0b69a2db96cf3e27d1b345aa68118))
* **client:** support raw response access ([#92](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/92)) ([8151f46](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/8151f46ed85709e628bee7322ba0c2af09fef34e))
* **client:** update enum `asX` methods ([#70](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/70)) ([99b5884](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/99b5884a33e3bc0018b5f8c6eec5586696851d56))
* generate and publish docs ([#101](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/101)) ([399ccf9](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/399ccf929ed5b0e63f9ce3ea0ac5ed19aadfd500))


### Bug Fixes

* **client:** mark some request bodies as optional ([#77](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/77)) ([6c247f7](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/6c247f7b533883a627a8eba5e23f326373c63158))
* conflict ([1484d67](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/1484d672e7a7b8e880a2dc95641be4b6f616812e))


### Chores

* **client:** refactor multipart formdata impl ([#93](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/93)) ([f8b27ac](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/f8b27ac0b05f40d3dd7d622f1e5eedaf79f38919))
* **client:** remove checked exception related code ([#75](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/75)) ([1633c51](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/1633c51068e6e650cdca527e16b7145df7b89b89))
* **client:** use deep identity methods for primitive array types ([#85](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/85)) ([2548c5b](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/2548c5b8a79a0814b917309513957729b71ffd89))
* **docs:** add faq to readme ([#76](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/76)) ([2dbe14b](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/2dbe14be2cc2e71ce536136ce0d0b456a361c0c5))
* **docs:** reorganize readme ([#72](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/72)) ([2047f7d](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/2047f7d40464bb96dd47be0e629bce871427150f))
* **internal:** add `.kotlin` to `.gitignore` ([#102](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/102)) ([4088b38](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/4088b38f6c154b0328264e275ea7f362ffee1499))
* **internal:** add async service tests ([#84](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/84)) ([55760a5](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/55760a519d461b6510d124ff7801ebdb8178104c))
* **internal:** codegen related update ([#103](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/103)) ([3dd86bb](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/3dd86bb5ca552e8075ba91027702b14ada6cf58a))
* **internal:** codegen related update ([#73](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/73)) ([a16c2ac](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a16c2ac5827b321dfb007ca99a9384e20f6e47ee))
* **internal:** codegen related update ([#74](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/74)) ([d7d6622](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/d7d66220f3c6aa7956e5f1fdcb59050980118293))
* **internal:** codegen related update ([#91](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/91)) ([f3ddfc2](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/f3ddfc28fa35fb0f5b34aa37b56d96b49373eda6))
* **internal:** codegen related update ([#96](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/96)) ([33d6603](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/33d6603be6e04442db309ae4558786c82654dec7))
* **internal:** improve sync service tests ([55760a5](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/55760a519d461b6510d124ff7801ebdb8178104c))
* **internal:** make body class constructors private ([a71e847](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a71e8475b6bb47eb4cab783755515a1c53854f6a))
* **internal:** make body classes for multipart requests ([a71e847](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a71e8475b6bb47eb4cab783755515a1c53854f6a))
* **internal:** misc formatting changes ([a71e847](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a71e8475b6bb47eb4cab783755515a1c53854f6a))
* **internal:** optimize build and test perf ([d95fd24](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/d95fd24c5f1a7cca489191892aa5e3d73fe88ac8))
* **internal:** refactor `ErrorHandlingTest` ([#90](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/90)) ([9a56543](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/9a56543bdcbde45ef84968e10e5b2f1dd881c3ae))
* **internal:** refactor `ServiceParamsTest` ([#86](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/86)) ([bb5527c](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/bb5527c4076621e22ef6755e4cd545b591c4ecad))
* **internal:** remove unnecessary non-null asserts in tests ([6c247f7](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/6c247f7b533883a627a8eba5e23f326373c63158))
* **internal:** rename internal body classes ([a71e847](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a71e8475b6bb47eb4cab783755515a1c53854f6a))
* **internal:** update formatter ([#68](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/68)) ([d95fd24](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/d95fd24c5f1a7cca489191892aa5e3d73fe88ac8))
* **internal:** update some formatting in `Values.kt` ([b0251b5](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/b0251b52a2f0b69a2db96cf3e27d1b345aa68118))
* **internal:** use `assertNotNull` in tests for type narrowing ([6c247f7](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/6c247f7b533883a627a8eba5e23f326373c63158))
* **internal:** use better test example values ([#69](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/69)) ([a71e847](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a71e8475b6bb47eb4cab783755515a1c53854f6a))


### Documentation

* add immutability explanation to readme ([#78](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/78)) ([b327323](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/b3273236c6c1488d823f6405741a70263a12f1ef))
* add raw response readme documentation ([#94](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/94)) ([df8743e](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/df8743e38e4eb6f758beb60ebc9811c07c872b96))
* add source file links to readme ([#79](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/79)) ([344dded](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/344ddedbb7a2cd76de2cb7edfeda55dcef8e37ed))
* note required fields in `builder` javadoc ([#95](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/95)) ([e1ae0c2](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/e1ae0c279ccfc65adb8dd8eb7f5bd86b076f2a0d))
* readme parameter tweaks ([55760a5](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/55760a519d461b6510d124ff7801ebdb8178104c))
* update URLs from stainlessapi.com to stainless.com ([#87](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/87)) ([74a5c1a](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/74a5c1a9312c62b9bd1c39254fa15c6e57ff31f2))

## 0.1.0-alpha.7 (2025-02-16)

Full Changelog: [v0.1.0-alpha.6...v0.1.0-alpha.7](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v0.1.0-alpha.6...v0.1.0-alpha.7)

### Features

* **api:** manual updates ([#62](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/62)) ([4ab96c4](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/4ab96c4afa68ac0fdc3894694fefc6a713a6c980))

## 0.1.0-alpha.6 (2025-02-16)

Full Changelog: [v0.1.0-alpha.5...v0.1.0-alpha.6](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v0.1.0-alpha.5...v0.1.0-alpha.6)

### Features

* **api:** manual updates ([#60](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/60)) ([27cbf79](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/27cbf79a14f20b3eb7c94548680bee3db7ca0883))


### Documentation

* add more phantom reachability docs ([#58](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/58)) ([f16949f](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/f16949fe6343eff4f7dc3311251fab3806eebbf7))

## 0.1.0-alpha.5 (2025-02-06)

Full Changelog: [v0.1.0-alpha.4...v0.1.0-alpha.5](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v0.1.0-alpha.4...v0.1.0-alpha.5)

### Features

* **api:** manual updates ([#56](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/56)) ([a8e5ed3](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a8e5ed3ff7d437a5442bf233eaeb2153e06997f7))
* **client:** send client-side timeout headers ([#54](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/54)) ([e97ba66](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/e97ba6680d39bf027f9ffff89d43df5198b61d7c))


### Chores

* **internal:** codegen related update ([#55](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/55)) ([05454d6](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/05454d60ca4d9f3a0d119bb4835b406b3a5568da))


### Documentation

* fix incorrect additional properties info ([#52](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/52)) ([30cd298](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/30cd298b6d44ebb0035a23b43d51c2bb2e3bd24c))

## 0.1.0-alpha.4 (2025-01-30)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

### Features

* **client:** add `_queryParams` and `_headers` methods ([#47](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/47)) ([f7b944c](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/f7b944c4c69412c2a2914bca8cbd1aa4a89bced5))


### Bug Fixes

* **client:** don't leak responses when retrying ([#49](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/49)) ([e483935](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/e483935e8e6487b965fb2f0a9c043042057c616e))


### Chores

* **internal:** improve `RetryingHttpClientTest` ([#48](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/48)) ([99c9509](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/99c9509e6a4a2536f22fdcb8805394f175b36381))


### Documentation

* builder, enum, and union comments ([#45](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/45)) ([6ea7157](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/6ea7157ac2785a86ebe9b96ecef7f645e18052c7))


### Refactors

* **internal:** extract request preparation logic ([f7b944c](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/f7b944c4c69412c2a2914bca8cbd1aa4a89bced5))

## 0.1.0-alpha.3 (2025-01-28)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### Features

* **client:** add `close` method ([#40](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/40)) ([738397f](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/738397f4c0d15af2cf9902a16d608ad9f96c8455))


### Bug Fixes

* **client:** make some classes and constructors non-public ([#43](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/43)) ([f8ef89c](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/f8ef89cc1151bd15a3186bc29a4ff9ca916f810a))


### Chores

* add max retries to test ([#39](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/39)) ([2124226](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/2124226ec34ef1904b7a6b37ac1c338a5836ade9))
* **internal:** codegen related update ([#37](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/37)) ([fc33875](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/fc33875bb1fcc115d375c398b29f6b7405af7633))
* **internal:** remove some unnecessary `constructor` keywords ([f8ef89c](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/f8ef89cc1151bd15a3186bc29a4ff9ca916f810a))


### Documentation

* `async` and `sync` method comments ([#42](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/42)) ([27575f3](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/27575f3fcf2d8653ced40afda7d78cafb4496bdb))
* add client documentation ([#41](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/41)) ([c8883c3](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/c8883c384ea0e053e362e0f1e61a685700e94e93))

## 0.1.0-alpha.2 (2025-01-10)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### Features

* **api:** manual updates ([#21](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/21)) ([a828477](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a8284770c0f147a14936f8c3600638edc1ecf0a7))


### Bug Fixes

* **client:** allow passing null for nullable fields where missing ([#32](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/32)) ([ce74ba4](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/ce74ba47032a023e9b186b2b16853ca0b722e34a))


### Chores

* **docs:** add example project ([#23](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/23)) ([0606f50](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/0606f50183fcc0c26688ed0fa175efd99559582c))
* **docs:** add example project ([#25](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/25)) ([47257ac](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/47257ac782ed2d3991d0ff8b0dc932582be42178))
* **docs:** update readme ([#22](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/22)) ([63d0cce](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/63d0ccee57bcbb1d046dea151a034fcebe620446))
* **internal:** codegen related update ([#19](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/19)) ([7bd875a](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/7bd875a0caca078baed1bacb4b209a18d980d141))
* **internal:** codegen related update ([#24](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/24)) ([6d86992](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/6d869923d4ad6b8ab4c06e9aa294204edf01e7f3))
* **internal:** codegen related update ([#26](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/26)) ([ee53d31](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/ee53d31bcbf7d93ff6e58d9291a73cdf3c2c44c9))
* **internal:** codegen related update ([#27](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/27)) ([ca0b336](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/ca0b33649ddcd45155edd7645bcbcbb747b02dbb))
* **internal:** codegen related update ([#29](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/29)) ([eb73b10](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/eb73b10d14e048cc9ee12e387d7feba8faecd22a))
* **internal:** codegen related update ([#30](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/30)) ([6bf3181](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/6bf3181df2550894ce9d2ef94e2533b66a66ae85))
* **internal:** codegen related update ([#33](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/33)) ([5e6934b](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/5e6934b2af26d5b68cd82d485dff34dff61cc974))
* **internal:** codegen related update ([#34](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/34)) ([9535d49](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/9535d49c14056afb7a67fee974e241f3b313f6b2))
* **internal:** codegen related update ([#35](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/35)) ([6e3a148](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/6e3a1485914effa05dfb5cec9327254b6af7b637))


### Styles

* **internal:** sort fields ([#31](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/31)) ([c6fff95](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/c6fff957c3989d3e576ef5e9b3c38fa2f4c4449e))

## 0.1.0-alpha.1 (2024-12-17)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/terminaldotshop/terminal-sdk-kotlin/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **api:** java and kotlin ([16cff14](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/16cff14c3b4442f61d2337d8b9bf2ca3eb4ece86))
* **api:** manual updates ([#1](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/1)) ([40f2296](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/40f2296d4f472b3dff6990938178c089e1c2b259))
* **api:** manual updates ([#3](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/3)) ([802ab90](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/802ab90c4ca167bfbba16270c9b549cde4eb439d))
* **api:** manual updates ([#4](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/4)) ([7e6561b](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/7e6561b4826be5cea4c014213992c1964583bfc8))
* **api:** manual updates ([#5](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/5)) ([a64f06b](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/a64f06b00b263936922b6e2a34f86fb119e9892c))
* **api:** manual updates ([#6](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/6)) ([f1b8845](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/f1b88453bf41a59590936f6e85523b583ab58bb7))
* **api:** manual updates ([#7](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/7)) ([5168316](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/5168316b0d70d45ac55630ca35fb13017ae3db8f))
* **api:** manual updates ([#8](https://github.com/terminaldotshop/terminal-sdk-kotlin/issues/8)) ([ad5bb8b](https://github.com/terminaldotshop/terminal-sdk-kotlin/commit/ad5bb8bbf999a49e730e7b77bff72a7a0d3c7dbb))
