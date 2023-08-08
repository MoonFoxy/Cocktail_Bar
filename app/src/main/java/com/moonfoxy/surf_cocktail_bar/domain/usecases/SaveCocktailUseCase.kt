package com.moonfoxy.surf_cocktail_bar.domain.usecases

import com.moonfoxy.surf_cocktail_bar.data.models.Cocktail
import com.moonfoxy.surf_cocktail_bar.domain.repository.DataRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SaveCocktailUseCase @Inject constructor(
    private val dataRepository: DataRepository
) {
    operator fun invoke(cocktail: Cocktail): Flow<Unit> {
        return dataRepository.saveCocktail(cocktail)
    }
}