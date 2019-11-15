package com.example.deeplinkdispatcherexample.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.airbnb.deeplinkdispatch.DeepLinkHandler

class DeepLinkReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val deepLinkUri = intent?.getStringExtra(DeepLinkHandler.EXTRA_URI)

        if (intent?.getBooleanExtra(DeepLinkHandler.EXTRA_SUCCESSFUL, false) == true){
            Log.d("DLPExample", "ThirdActivity has uri $deepLinkUri")
        }else{
            Log.d("DLPExample", "ThirdActivity has error ${intent?.getStringExtra(DeepLinkHandler.EXTRA_ERROR_MESSAGE)}")
        }
    }
}