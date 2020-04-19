package com.example.daggerandroidsample

import android.app.Application
import com.example.daggerandroidsample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject


class MainApplication : Application(), HasAndroidInjector {
    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any?>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().application(this).build().inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any?> {
        return dispatchingAndroidInjector
    }
}