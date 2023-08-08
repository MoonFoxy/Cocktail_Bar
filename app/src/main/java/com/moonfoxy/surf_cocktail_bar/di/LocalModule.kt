package com.moonfoxy.surf_cocktail_bar.di

import android.content.Context
import com.moonfoxy.surf_cocktail_bar.data.local.dao.CocktailDao
import com.moonfoxy.surf_cocktail_bar.data.local.database.CocktailBarDatabase
import com.moonfoxy.surf_cocktail_bar.data.local.repository.LocalRepositoryImpl
import com.moonfoxy.surf_cocktail_bar.domain.repository.LocalRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocalModule {
    @Binds
    @Singleton
    abstract fun provideLocalRepositoryImpl(impl: LocalRepositoryImpl): LocalRepository

    companion object {
        @Provides
        @Singleton
        fun provideDatabase(@ApplicationContext context: Context): CocktailBarDatabase {
            return CocktailBarDatabase.getInstance(context)
        }

        @Provides
        @Singleton
        fun provideCharacterDao(cocktailBarDatabase: CocktailBarDatabase): CocktailDao {
            return cocktailBarDatabase.getCocktailDao()
        }
    }
}