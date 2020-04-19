package com.example.daggerandroidsample.account

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AccountBindingModule {
    @ContributesAndroidInjector
    abstract fun contributeSignUpFragment(): SignUpFragment
}