package ua.zp.smartscanfoods

import android.graphics.RectF

data class DetectionResult(
    val boundingBox: RectF,
    val text: String)
