package com.example.ui_e_commerce_jetpack.di

import com.example.ui_e_commerce_jetpack.data.demo_db.DemoDB
import com.example.ui_e_commerce_jetpack.data.repository.ProductRepositoryImp
import com.example.ui_e_commerce_jetpack.domain.repository.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Provides
    @Singleton
    fun provideProductRepository(demoDB: DemoDB): ProductRepository {
        return ProductRepositoryImp(demoDB)
    }

}