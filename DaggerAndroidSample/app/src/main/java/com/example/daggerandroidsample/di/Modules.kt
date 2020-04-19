package com.example.daggerandroidsample.di

import com.example.daggerandroidsample.account.AccountActivity
import com.example.daggerandroidsample.account.AccountBindingModule
import com.example.daggerandroidsample.data.UserService
import com.example.daggerandroidsample.main.MainActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import retrofit2.Retrofit

@Module
class AppModule {
    @Provides
    fun provideService(): UserService {
        return Retrofit.Builder()
            .baseUrl("https://example.com/").build()
            .create(UserService::class.java)
    }
}

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [AccountBindingModule::class])
    abstract fun contributeAccountActivity(): AccountActivity
}