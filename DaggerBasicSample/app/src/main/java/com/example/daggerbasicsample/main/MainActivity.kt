package com.example.daggerbasicsample.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.daggerbasicsample.MainApplication
import com.example.daggerbasicsample.R
import com.example.daggerbasicsample.account.AccountActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var viewModel: MainViewModel
    private lateinit var helloWorldButton: Button
    private lateinit var signUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MainApplication).component
            .mainComponent()
            .build()
            .inject(this)

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
