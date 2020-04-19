package com.example.daggerbasicsample

import android.app.Application
import com.example.daggerbasicsample.di.AppComponent
import com.example.daggerbasicsample.di.DaggerAppComponent

class MainApplication : Application() {
    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder().application(this).build()
    }
}