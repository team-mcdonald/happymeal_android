package com.example.di

import com.yongjincompany.data.remote.datasource.AuthDataSource
import com.yongjincompany.data.remote.datasource.AuthDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {
    @Binds
    abstract fun provideRemoteAuthDataSource(
        authDataSourceImpl: AuthDataSourceImpl
    ): AuthDataSource
}
