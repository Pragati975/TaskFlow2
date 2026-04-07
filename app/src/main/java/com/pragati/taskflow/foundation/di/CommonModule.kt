package com.pragati.taskflow.foundation.di

import com.pragati.taskflow.foundation.wrapper.DateTimeProvider
import com.pragati.taskflow.foundation.wrapper.DateTimeProviderImpl
import com.pragati.taskflow.foundation.wrapper.IdProvider
import com.pragati.taskflow.foundation.wrapper.IdProviderImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CommonModule {

    @Singleton
    @Provides
    fun provideIdProvider(): IdProvider {
        return IdProviderImpl()
    }

    @Singleton
    @Provides
    fun provideDateTimeProvider(): DateTimeProvider {
        return DateTimeProviderImpl()
    }

}
