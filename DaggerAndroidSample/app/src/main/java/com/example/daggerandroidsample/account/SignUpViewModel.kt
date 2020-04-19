package com.example.daggerandroidsample.account

import com.example.daggerandroidsample.data.UserRepository
import javax.inject.Inject

class SignUpViewModel @Inject constructor(private val repository: UserRepository) {

    fun signUp(): String {
        return repository.signUp()
    }
}