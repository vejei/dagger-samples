package com.example.daggerandroidsample.di

import android.app.Application
import com.example.daggerandroidsample.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityBindingModule::class]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(application: MainApplication)
}