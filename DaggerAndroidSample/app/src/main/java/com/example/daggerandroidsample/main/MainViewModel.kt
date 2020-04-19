package com.example.daggerandroidsample.main

import javax.inject.Inject

class MainViewModel @Inject constructor() {

    fun helloWorld(): String {
        return "Hello World"
    }
}