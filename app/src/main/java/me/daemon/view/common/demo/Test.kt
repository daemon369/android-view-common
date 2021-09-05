package me.daemon.view.common.demo

import android.content.Context
import android.util.Log
import me.daemon.view.common.dp2px

class Test {

    companion object {
        fun test(context: Context) {
            Log.e("Test", dp2px(context, 1f).toString())
            Log.e("Test", dp2px(1f).toString())
        }
    }
}