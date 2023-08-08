package com.moonfoxy.surf_cocktail_bar.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.moonfoxy.surf_cocktail_bar.data.local.models.CocktailEntity
import com.moonfoxy.surf_cocktail_bar.data.local.util.LocalConstants
import kotlinx.coroutines.flow.Flow

@Dao
interface CocktailDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCocktail(cocktail: CocktailEntity): Flow<Unit>

    @Query("SELECT * FROM ${LocalConstants.COCKTAIL_TABLE_NAME}")
    fun getCocktailList(): Flow<List<CocktailEntity>>

    @Query("SELECT * FROM ${LocalConstants.COCKTAIL_TABLE_NAME} WHERE id = :id")
    fun getCocktail(id: Int): Flow<CocktailEntity>

    @Query("DELETE FROM ${LocalConstants.COCKTAIL_TABLE_NAME}")
    fun deleteAll(): Flow<Unit>
}