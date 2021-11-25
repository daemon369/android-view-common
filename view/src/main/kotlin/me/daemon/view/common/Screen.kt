@file:JvmName("Screen")

package me.daemon.view.common

import android.app.Dialog
import android.content.Context
import android.content.res.Resources
import android.view.View
import android.view.WindowManager
import androidx.fragment.app.Fragment


val WindowManager.screenWidth: Int
    get() {
        @Suppress("ImplicitThis")
        defaultDisplay.getMetrics(tempMetrics)
        return tempMetrics.widthPixels
    }

val WindowManager.screenHeight: Int
    get() {
        @Suppress("ImplicitThis")
        defaultDisplay.getMetrics(tempMetrics)
        return tempMetrics.heightPixels
    }

val Context.screenWidth: Int
    get() = (getSystemService(Context.WINDOW_SERVICE) as WindowManager).screenWidth

val Context.screenHeight: Int
    get() = (getSystemService(Context.WINDOW_SERVICE) as WindowManager).screenHeight


inline val View.screenWidth: Int
    get() = context.screenWidth

inline val Fragment.screenWidth: Int
    get() = requireContext().screenWidth

inline val Dialog.screenWidth: Int
    get() = context.screenWidth


inline val Resources.screenHeight: Int
    get() = displayMetrics.heightPixels

inline val View.screenHeight: Int
    get() = context.screenHeight

inline val Fragment.screenHeight: Int
    get() = requireContext().screenHeight

inline val Dialog.screenHeight: Int
    get() = context.screenHeight

