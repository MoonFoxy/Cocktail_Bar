package com.moonfoxy.surf_cocktail_bar.data.local.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.moonfoxy.surf_cocktail_bar.data.local.util.LocalConstants

@Entity(tableName = LocalConstants.COCKTAIL_TABLE_NAME)
data class CocktailEntity(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    @ColumnInfo(name = "title_name") val titleName: String,
    val description: String,
    val recipe: String,
    val ingredients: List<String>,
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    val image: ByteArray,
)