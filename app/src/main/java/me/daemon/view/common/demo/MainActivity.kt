package me.daemon.view.common.demo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import me.daemon.view.common.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MainActivity", "screenWidth=$screenWidth")
        Log.e("MainActivity", "screenHeight=$screenHeight")
        Log.e("MainActivity", "dp2px(1)=${dp2px(1f)}")
        Log.e("MainActivity", "sp2px(1)=${sp2px(1f)}")
        Log.e("MainActivity", "px2dp(1)=${px2dp(1f)}")
        Log.e("MainActivity", "px2sp(1)=${px2sp(1f)}")
    }
}
