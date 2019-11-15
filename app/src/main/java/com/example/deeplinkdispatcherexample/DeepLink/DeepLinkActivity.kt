package com.example.deeplinkdispatcherexample.DeepLink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.deeplinkdispatch.DeepLinkHandler
import com.example.deeplinkdispatcherexample.R
import kotlin.reflect.KClass

@DeepLinkHandler(value = [AppLinkModule::class])
class DeepLinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deep_link)

      val deepLinkDelegate = DeepLinkDelegate(AppLinkModuleLoader())
        deepLinkDelegate.dispatchFrom(this)
    }
}
