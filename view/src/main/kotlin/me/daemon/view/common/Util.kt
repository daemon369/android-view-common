package me.daemon.view.common

import android.content.Context

/**
 * @author yc
 * @since 2019-06-27 11:17
 */

fun dp2px(context: Context, dp: Float): Float {
    val density = context.resources.displayMetrics.density
    return density * dp
}

fun px2dp(context: Context, px: Float): Float {
    val density = context.resources.displayMetrics.density
    return px / density
}

fun sp2px(context: Context, sp: Float): Float {
    val scaleDensity = context.resources.displayMetrics.scaledDensity
    return scaleDensity * sp
}

fun px2sp(context: Context, px: Float): Float {
    val scaleDensity = context.resources.displayMetrics.scaledDensity
    return px / scaleDensity
}
