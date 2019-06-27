package me.daemon.view.common

import android.content.Context

/**
 * @author yc
 * @since 2019-06-27 11:17
 */

fun dp2px(context: Context, dp: Float): Int {
    val density = context.resources.displayMetrics.density
    return (density * dp + 0.5f).toInt()
}

fun px2dp(context: Context, px: Float): Int {
    val density = context.resources.displayMetrics.density
    return (px / density + 0.5f).toInt()
}

fun sp2px(context: Context, sp: Float): Int {
    val scaleDensity = context.resources.displayMetrics.scaledDensity
    return (scaleDensity * sp + 0.5f).toInt()
}

fun px2sp(context: Context, px: Float): Int {
    val scaleDensity = context.resources.displayMetrics.scaledDensity
    return (px / scaleDensity + 0.5f).toInt()
}
