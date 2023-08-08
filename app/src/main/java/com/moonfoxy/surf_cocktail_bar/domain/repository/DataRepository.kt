package com.moonfoxy.surf_cocktail_bar.domain.repository

import com.moonfoxy.surf_cocktail_bar.data.models.Cocktail
import kotlinx.coroutines.flow.Flow

interface DataRepository {
    fun getCocktailList(): Flow<List<Cocktail>>
    fun getCocktail(id: Int): Flow<Cocktail>
    fun saveCocktail(cocktail: Cocktail): Flow<Unit>
}