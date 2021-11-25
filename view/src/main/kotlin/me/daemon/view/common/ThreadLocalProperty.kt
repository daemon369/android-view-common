package me.daemon.view.common

import android.graphics.Point
import android.graphics.PointF
import android.graphics.Rect
import android.graphics.RectF
import android.util.DisplayMetrics


private val tempMetricsThreadLocal = ThreadLocal<DisplayMetrics>()

val tempMetrics: DisplayMetrics
    get() = tempMetricsThreadLocal.get()
        ?: DisplayMetrics().apply { tempMetricsThreadLocal.set(this) }


private val tempPointThreadLocal = ThreadLocal<Point>()

val tempPoint: Point
    get() = tempPointThreadLocal.get() ?: Point().apply { tempPointThreadLocal.set(this) }


private val tempPointFThreadLocal = ThreadLocal<PointF>()

val tempPointF: PointF
    get() = tempPointFThreadLocal.get() ?: PointF().apply { tempPointFThreadLocal.set(this) }


private val tempRectThreadLocal = ThreadLocal<Rect>()

val tempRect: Rect
    get() = tempRectThreadLocal.get() ?: Rect().apply { tempRectThreadLocal.set(this) }


private val tempRectFThreadLocal = ThreadLocal<RectF>()

val tempRectF: RectF
    get() = tempRectFThreadLocal.get() ?: RectF().apply { tempRectFThreadLocal.set(this) }

