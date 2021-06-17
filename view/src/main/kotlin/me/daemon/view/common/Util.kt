package me.daemon.view.common

import android.content.Context

/**
 * @author daemon
 * @since 2019-06-27 11:17
 */

fun dp2px(context: Context, dp: Float): Float = context.dp2px(dp)

fun px2dp(context: Context, px: Float): Float = context.px2dp(px)

fun sp2px(context: Context, sp: Float): Float = context.sp2px(sp)

fun px2sp(context: Context, px: Float): Float = context.px2sp(px)
