package com.example.deeplinkdispatcherexample

import android.app.Application
import android.content.IntentFilter
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.airbnb.deeplinkdispatch.DeepLinkHandler
import com.example.deeplinkdispatcherexample.service.DeepLinkReceiver

class MyDeepLinkApp : Application() {

    override fun onCreate() {
        super.onCreate()
        val intentFilter = IntentFilter(DeepLinkHandler.ACTION)
        LocalBroadcastManager.getInstance(this).registerReceiver(DeepLinkReceiver(), intentFilter)
    }
}