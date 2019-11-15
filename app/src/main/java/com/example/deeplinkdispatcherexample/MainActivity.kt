package com.example.deeplinkdispatcherexample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1 Simple to run deeplink
//        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("rg://example/sutarjo")))
        // 2 Run custom annotation deeplink
//        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("rg://safariembedded/rsch")))
        // 3 Static method reference
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("rg://example/fromStaticMethod")))
    }
}
