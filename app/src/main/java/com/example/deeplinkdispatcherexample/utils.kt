package com.example.deeplinkdispatcherexample

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.TaskStackBuilder
import com.airbnb.deeplinkdispatch.DeepLink
import com.example.deeplinkdispatcherexample.BacStackActivity.BackStackActiv1
import com.example.deeplinkdispatcherexample.BacStackActivity.BackStackActiv2

object utils {

    // disable so that another method can receive this deeplink
//    @JvmStatic
//    @DeepLink("rg://example/fromStaticMethod")
    fun startActivityWithObj(context: Context) : Intent {
//        Log.d("DLPExample", "Utils")
        return Intent(context, StaticReferenceActivitiy::class.java)
    }

    @JvmStatic
    @DeepLink("rg://example/fromStaticMethod")
    fun startActivityWithTaskBuilder(context: Context): TaskStackBuilder {
        Log.d("DLPExample", "Utils")
        val parent = Intent(context, BackStackActiv2::class.java)
        val child = Intent(context, BackStackActiv1::class.java)

        return TaskStackBuilder.create(context)
            .addNextIntent(parent)
            .addNextIntent(child)
    }
}