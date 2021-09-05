package me.daemon.view.common

import android.content.Context

/**
 * @author daemon
 * @since 2019-06-27 11:17
 */

@Deprecated("use Context.dp2px instead", ReplaceWith("dp2px(dp)"))
fun dp2px(context: Context, dp: Float): Float = context.dp2px(dp)

@Deprecated("use Context.px2dp instead", ReplaceWith("px2dp(px)"))
fun px2dp(context: Context, px: Float): Float = context.px2dp(px)

@Deprecated("use Context.sp2px instead", ReplaceWith("sp2px(sp)"))
fun sp2px(context: Context, sp: Float): Float = context.sp2px(sp)

@Deprecated("use Context.px2sp instead", ReplaceWith("px2sp(px)"))
fun px2sp(context: Context, px: Float): Float = context.px2sp(px)
