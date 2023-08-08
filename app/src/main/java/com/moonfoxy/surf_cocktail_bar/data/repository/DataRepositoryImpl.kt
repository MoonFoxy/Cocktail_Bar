package com.moonfoxy.surf_cocktail_bar.data.repository

import com.moonfoxy.surf_cocktail_bar.data.models.Cocktail
import com.moonfoxy.surf_cocktail_bar.domain.repository.DataRepository
import com.moonfoxy.surf_cocktail_bar.domain.repository.LocalRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DataRepositoryImpl @Inject constructor(
    private val localRepository: LocalRepository
) : DataRepository {
    override fun getCocktailList(): Flow<List<Cocktail>> {
        return localRepository.getCocktailList()
    }

    override fun getCocktail(id: Int): Flow<Cocktail> {
        return localRepository.getCocktail(id)
    }

    override fun saveCocktail(cocktail: Cocktail): Flow<Unit> {
        return localRepository.saveCocktail(cocktail)
    }
}