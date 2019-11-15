package com.example.deeplinkdispatcherexample.custom

import com.airbnb.deeplinkdispatch.DeepLinkSpec

@MustBeDocumented
@DeepLinkSpec(prefix = ["rg://webembedded"])
@Retention(AnnotationRetention.BINARY)
annotation class WebDeepLink(vararg val value: String)