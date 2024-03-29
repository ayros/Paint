package com.ayros.painter.shapes

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.shapes.OvalShape
import android.os.Build
import androidx.annotation.RequiresApi

class OvalShape(canvas: Canvas? = null, color: Int = Color.BLACK) : Shape(canvas, color) {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun draw() {
        canvas?.drawOval(x1,y1,x2,y2,paint)
    }

}