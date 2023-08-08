package com.moonfoxy.surf_cocktail_bar.data.local.mappers

interface Mapper<M, E> {
    fun mapTo(type: M): E
    fun mapTo(type: E): M
}