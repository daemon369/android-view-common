@file:Suppress("NOTHING_TO_INLINE")

package me.daemon.view.common

import kotlin.math.max
import kotlin.math.min

inline fun between(min: Double, max: Double, value: Double): Double = max(min, min(max, value))
inline fun between(min: Float, max: Float, value: Float): Float = max(min, min(max, value))
inline fun between(min: Int, max: Int, value: Int): Int = max(min, min(max, value))
inline fun between(min: Long, max: Long, value: Long): Long = max(min, min(max, value))
inline fun between(min: UInt, max: UInt, value: UInt): UInt = max(min, min(max, value))
inline fun between(min: ULong, max: ULong, value: ULong): ULong = max(min, min(max, value))

