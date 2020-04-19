package com.example.daggerandroidsample.account

import com.example.daggerandroidsample.data.UserRepository
import javax.inject.Inject

class AccountViewModel @Inject constructor(private val repository: UserRepository) {

    fun enter(): String {
        return "enter account activity"
    }
}