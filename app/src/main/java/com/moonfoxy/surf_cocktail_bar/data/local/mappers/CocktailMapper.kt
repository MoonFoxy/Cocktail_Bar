package com.moonfoxy.surf_cocktail_bar.data.local.mappers

import com.moonfoxy.surf_cocktail_bar.data.local.models.CocktailEntity
import com.moonfoxy.surf_cocktail_bar.data.models.Cocktail

class CocktailMapper : Mapper<Cocktail, CocktailEntity> {
    override fun mapTo(type: Cocktail): CocktailEntity {
        return with(type) {
            CocktailEntity(
                id = id,
                titleName = titleName,
                description = description,
                recipe = recipe,
                ingredients = ingredients,
                image = image
            )
        }
    }

    override fun mapTo(type: CocktailEntity): Cocktail {
        return with(type) {
            Cocktail(
                id = id,
                titleName = titleName,
                description = description,
                recipe = recipe,
                ingredients = ingredients,
                image = image
            )
        }
    }

}