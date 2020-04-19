package com.example.daggerandroidsample.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.daggerandroidsample.R
import com.example.daggerandroidsample.account.AccountActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject lateinit var viewModel: MainViewModel
    private lateinit var helloWorldButton: Button
    private lateinit var signUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        helloWorldButton = findViewById(R.id.button_main_hello_world)
        signUpButton = findViewById(R.id.button_main_sign_up)

        helloWorldButton.setOnClickListener {
            Toast.makeText(this@MainActivity, viewModel.helloWorld(), Toast.LENGTH_SHORT).show()
        }

        signUpButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, AccountActivity::class.java))
        }
    }
}
