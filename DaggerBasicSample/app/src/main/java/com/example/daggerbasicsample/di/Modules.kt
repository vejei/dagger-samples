package com.example.daggerbasicsample.di

import com.example.daggerbasicsample.data.UserService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module(subcomponents = [MainComponent::class, AccountComponent::class])
class AppModule {
    @Provides
    fun provideService(): UserService {
        return Retrofit.Builder()
            .baseUrl("https://example.com/").build()
            .create(UserService::class.java)
    }
}