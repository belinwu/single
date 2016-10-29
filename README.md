# Single

[![JitPack](https://jitpack.io/v/com.wujilin/single.svg)](https://jitpack.io/#com.wujilin/single)
![Android](https://img.shields.io/badge/platform-Android-brightgreen.svg)
[![MIT](https://img.shields.io/dub/l/vibe-d.svg)](LICENSE)
![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg)

The single click wrapper for Android.

**DO NOT USE THIS LIBRARY IN PRODUCTION UNTIL `1.0.0` IS RELEASED.**

# Download

Single is available on `JitPack` repository.

In your root `build.gradle`:

```gradle
allprojects {
    repositories {
        // ...
        maven { url "https://jitpack.io" }
    }
}
```

In your app `build.gradle`:

```gradle
dependencies {
    compile 'com.wujilin:single:0.1.0'
}
```

# Getting started

```java
view.setOnClickListener(SingleClick.wrap(onClickListener));
```

# Compatibility

- **Android SDK**: Succession requires a minimum API level of 14.

# Dependency

```gradle
compile 'com.android.support:support-annotations:$latestVersion'
```

# Changelog

Checkout the [changelog](changelog.md) file.

# License

The MIT License.

Copyright (c) 2016 Belin Wu.