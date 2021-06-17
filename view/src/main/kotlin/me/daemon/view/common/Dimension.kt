@file:Suppress("NOTHING_TO_INLINE", "unused")

package me.daemon.view.common

import android.app.Dialog
import android.content.Context
import android.content.res.Resources
import android.util.TypedValue
import android.view.View
import androidx.fragment.app.Fragment


inline fun Resources.dp2px(dp: Float): Float =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics)

inline fun Resources.px2dp(px: Float): Float = px / displayMetrics.density

inline fun Resources.sp2px(sp: Float): Float =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, displayMetrics)

inline fun Resources.px2sp(px: Float): Float = px / displayMetrics.scaledDensity


inline fun Context.dp2px(dp: Float): Float = resources.dp2px(dp)

inline fun Context.px2dp(px: Float): Float = resources.px2dp(px)

inline fun Context.sp2px(sp: Float): Float = resources.sp2px(sp)

inline fun Context.px2sp(px: Float): Float = resources.px2sp(px)


inline fun View.dp2px(dp: Float): Float = resources.dp2px(dp)

inline fun View.px2dp(px: Float): Float = resources.px2dp(px)

inline fun View.sp2px(sp: Float): Float = resources.sp2px(sp)

inline fun View.px2sp(px: Float): Float = resources.px2sp(px)


inline fun Fragment.dp2px(dp: Float): Float = resources.dp2px(dp)

inline fun Fragment.px2dp(px: Float): Float = resources.px2dp(px)

inline fun Fragment.sp2px(sp: Float): Float = resources.sp2px(sp)

inline fun Fragment.px2sp(px: Float): Float = resources.px2sp(px)


inline fun Dialog.dp2px(dp: Float): Float = context.dp2px(dp)

inline fun Dialog.px2dp(px: Float): Float = context.px2dp(px)

inline fun Dialog.sp2px(sp: Float): Float = context.sp2px(sp)

inline fun Dialog.px2sp(px: Float): Float = context.px2sp(px)
