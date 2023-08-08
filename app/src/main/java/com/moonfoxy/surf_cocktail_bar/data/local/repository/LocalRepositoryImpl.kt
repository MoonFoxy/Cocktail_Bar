package com.moonfoxy.surf_cocktail_bar.data.local.repository

import com.moonfoxy.surf_cocktail_bar.data.local.dao.CocktailDao
import com.moonfoxy.surf_cocktail_bar.data.local.mappers.CocktailMapper
import com.moonfoxy.surf_cocktail_bar.data.models.Cocktail
import com.moonfoxy.surf_cocktail_bar.domain.repository.LocalRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LocalRepositoryImpl @Inject constructor(
    private val cocktailDao: CocktailDao, private val cocktailMapper: CocktailMapper
) : LocalRepository {
    override fun getCocktailList(): Flow<List<Cocktail>> {
        return cocktailDao.getCocktailList().map { cocktailEntities ->
            cocktailEntities.map {
                cocktailMapper.mapTo(it)
            }
        }
    }

    override fun getCocktail(id: Int): Flow<Cocktail> {
        return cocktailDao.getCocktail(id).map {
            cocktailMapper.mapTo(it)
        }
    }

    override fun saveCocktail(cocktail: Cocktail): Flow<Unit> = flow {
        cocktailDao.insertCocktail(cocktailMapper.mapTo(cocktail))
    }

    override fun deleteAll(): Flow<Unit> = flow {
        cocktailDao.deleteAll()
    }
}