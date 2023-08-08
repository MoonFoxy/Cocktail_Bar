package com.moonfoxy.surf_cocktail_bar.domain.usecases

import android.graphics.Bitmap
import java.io.ByteArrayOutputStream

class ConvertImageToByteArrayUseCase {
    operator fun invoke(bitmap: Bitmap): ByteArray {
        val outputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }
}