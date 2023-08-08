package com.moonfoxy.surf_cocktail_bar.di

import com.moonfoxy.surf_cocktail_bar.data.repository.DataRepositoryImpl
import com.moonfoxy.surf_cocktail_bar.domain.repository.DataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    @Singleton
    abstract fun provideDataRepository(impl: DataRepositoryImpl): DataRepository
}