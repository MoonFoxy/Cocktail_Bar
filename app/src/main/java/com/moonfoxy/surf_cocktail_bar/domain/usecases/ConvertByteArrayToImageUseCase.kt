package com.moonfoxy.surf_cocktail_bar.domain.usecases

import android.graphics.Bitmap
import android.graphics.BitmapFactory

class ConvertByteArrayToImageUseCase {
    operator fun invoke(byteArray: ByteArray): Bitmap {
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
    }
}