package com.example.deeplinkdispatcherexample.custom

import com.airbnb.deeplinkdispatch.DeepLinkSpec

@MustBeDocumented
@DeepLinkSpec(prefix = ["rg://safariembedded"])
@Retention(AnnotationRetention.BINARY)
annotation class SafariDeepLink(vararg val value: String)