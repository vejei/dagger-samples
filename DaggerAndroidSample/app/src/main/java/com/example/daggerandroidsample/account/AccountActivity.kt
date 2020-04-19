package com.example.daggerandroidsample.account

import android.os.Bundle
import android.widget.Toast
import com.example.daggerandroidsample.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AccountActivity : DaggerAppCompatActivity() {
    @Inject lateinit var viewModel: AccountViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Toast.makeText(this, viewModel.enter(), Toast.LENGTH_SHORT).show()

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, SignUpFragment())
                .commit()
        }
    }
}