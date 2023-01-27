package com.fablab.tensorflowcamerax.utils

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.View

@SuppressLint("ViewConstructor")
class Draw(context: Context?, var rect: Rect, var text: String): View(context) {

    lateinit var boundaryPaint: Paint
    lateinit var textPaint: Paint

    init {
        init()
    }

    private fun init(){
        boundaryPaint = Paint()
        boundaryPaint.color = Color.BLACK
        boundaryPaint.strokeWidth = 10f
        boundaryPaint.style = Paint.Style.STROKE

        textPaint = Paint()
        textPaint.color = Color.BLACK
        textPaint.textSize = 50f
        textPaint.style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawText(text, rect.centerX().toFloat(), rect.centerY().toFloat(),textPaint)
        canvas?.drawRect(rect.left.toFloat(), rect.top.toFloat(), rect.right.toFloat(), rect.bottom.toFloat(),boundaryPaint)
    }


}