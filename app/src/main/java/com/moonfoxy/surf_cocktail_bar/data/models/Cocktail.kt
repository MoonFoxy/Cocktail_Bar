package com.moonfoxy.surf_cocktail_bar.data.models

data class Cocktail(
    val id: Int? = null,
    val titleName: String,
    val description: String,
    val recipe: String,
    val ingredients: List<String>,
    val image: ByteArray
)
