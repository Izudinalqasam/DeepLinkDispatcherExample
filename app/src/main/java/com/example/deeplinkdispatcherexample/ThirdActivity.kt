package com.example.deeplinkdispatcherexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.airbnb.deeplinkdispatch.DeepLink

@DeepLink("rg://example/{student}")
class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        Log.d("DLPExample", "ThirdActivity")

        if (intent.getBooleanExtra(DeepLink.IS_DEEP_LINK, false)){
            val parameter = intent.extras

            if (parameter != null && !parameter.getString("student").isNullOrEmpty()){
                Log.d("DLPExample", "ThirdActivity has student ${parameter.getString("student")} name")
            }
        }
    }

}
