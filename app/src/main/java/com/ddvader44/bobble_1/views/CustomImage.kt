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
    private val middleRect = Rect()
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas: Canvas) {

        //base rectangle reference
        rect.left = 10
        rect.right = rect.left + 100
        rect.top = 10
        rect.bottom = rect.top + 100
        paint.color = Color.GRAY
       // canvas.drawRect(rect,paint)

       //first circle

        val radius = 100f

        val cx = 150f
        val cy : Float = rect.top.toFloat() + (rect.height())
       canvas.drawCircle(cx,cy,radius,paint)

        //second circle

        val radius2 = 100f
        val cx2 = 340f
        val cy2 : Float = rect.top.toFloat() + (rect.height())
        canvas.drawCircle(cx2,cy2,radius2,paint)

        //middle rectangle

        middleRect.left = cx.toInt()
        middleRect.right = cx2.toInt()
        middleRect.top = (cx - middleRect.height()/2).toInt() + 45
        middleRect.bottom = (cx2 - middleRect.height()/2).toInt() + 45
        canvas.drawRect(middleRect,paint)


    }

}