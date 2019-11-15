package com.example.deeplinkdispatcherexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.airbnb.deeplinkdispatch.DeepLink
import com.example.deeplinkdispatcherexample.custom.SafariDeepLink

@SafariDeepLink("/rsch")
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("DLPExample", "SecondActivity")
    }
}
