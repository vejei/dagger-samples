package com.example.daggerbasicsample.di

import android.app.Application
import com.example.daggerbasicsample.account.AccountActivity
import com.example.daggerbasicsample.main.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@Component(modules = [AppModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun mainComponent(): MainComponent.Builder
    fun accountComponent(): AccountComponent.Builder
}

@Subcomponent
interface MainComponent {
    @Subcomponent.Builder
    interface Builder {
        fun build(): MainComponent
    }

    fun inject(activity: MainActivity)
}

@Subcomponent
interface AccountComponent {
    @Subcomponent.Builder
    interface Builder {
        fun build(): AccountComponent
    }

    fun inject(activity: AccountActivity)
}