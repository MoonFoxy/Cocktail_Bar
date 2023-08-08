package com.moonfoxy.surf_cocktail_bar.domain.usecases

import com.moonfoxy.surf_cocktail_bar.data.models.Cocktail
import com.moonfoxy.surf_cocktail_bar.domain.repository.DataRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCocktailListUseCase @Inject constructor(
    private val dataRepository: DataRepository
) {
    operator fun invoke(): Flow<List<Cocktail>> {
        return dataRepository.getCocktailList()
    }
}