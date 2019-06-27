package me.daemon.view.common

import android.content.Context

/**
 * @author yc
 * @since 2019-06-27 11:28
 */

fun Context.dp2px(dp: Float) = dp2px(this, dp)

fun Context.px2dp(px: Float) = px2dp(this, px)

fun Context.sp2px(sp: Float) = sp2px(this, sp)

fun Context.px2sp(px: Float) = px2sp(this, px)
