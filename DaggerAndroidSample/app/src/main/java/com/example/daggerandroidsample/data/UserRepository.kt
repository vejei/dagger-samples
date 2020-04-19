package com.example.daggerandroidsample.data

import javax.inject.Inject

class UserRepository @Inject constructor(service: UserService) {

    fun signUp(): String {
        return "success"
    }
}