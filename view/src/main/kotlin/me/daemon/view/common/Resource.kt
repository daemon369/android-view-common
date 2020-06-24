@file:Suppress("NOTHING_TO_INLINE")

package me.daemon.view.common

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.view.View
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment


inline val Resources.screenWidth: Int
    get() = displayMetrics.widthPixels

inline val Context.screenWidth: Int
    get() = resources.screenWidth

inline val View.screenWidth: Int
    get() = resources.screenWidth

inline val Fragment.screenWidth: Int
    get() = resources.screenWidth


inline val Resources.screenHeight: Int
    get() = displayMetrics.heightPixels

inline val Context.screenHeight: Int
    get() = resources.screenHeight

inline val View.screenHeight: Int
    get() = resources.screenHeight

inline val Fragment.screenHeight: Int
    get() = resources.screenHeight


inline fun Resources.color(@ColorRes resId: Int): Int =
    ResourcesCompat.getColor(this, resId, null)

inline fun Context.color(@ColorRes resId: Int): Int = resources.color(resId)

inline fun View.color(@ColorRes resId: Int): Int = resources.color(resId)

inline fun Fragment.color(@ColorRes resId: Int): Int = resources.color(resId)


inline fun Resources.dimen(@DimenRes resId: Int): Float = getDimension(resId)

inline fun Context.dimen(@DimenRes resId: Int): Float = resources.dimen(resId)

inline fun View.dimen(@DimenRes resId: Int): Float = resources.dimen(resId)

inline fun Fragment.dimen(@DimenRes resId: Int): Float = resources.dimen(resId)


inline fun Resources.drawable(@DrawableRes resId: Int): Drawable =
    ResourcesCompat.getDrawable(this, resId, null)!!

inline fun Context.drawable(@DrawableRes resId: Int): Drawable =
    resources.drawable(resId)

inline fun View.drawable(@DrawableRes resId: Int): Drawable =
    resources.drawable(resId)

inline fun Fragment.drawable(@DrawableRes resId: Int): Drawable =
    resources.drawable(resId)








