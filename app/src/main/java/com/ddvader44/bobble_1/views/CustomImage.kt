package com.ddvader44.bobble_1.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

class CustomImage @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val rect = Rect()
    private val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        rect.left = 10
        rect.right = rect.left + 100
        rect.top = 10
        rect.bottom = rect.right + 100
        paint.color = Color.GREEN
        canvas.drawRect(rect,paint)
    }

}