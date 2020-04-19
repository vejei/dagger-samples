package com.example.daggerandroidsample.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.daggerandroidsample.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SignUpFragment : DaggerFragment() {
    @Inject lateinit var viewModel: SignUpViewModel

    private lateinit var submitButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        submitButton = view.findViewById(R.id.button_account_submit)

        submitButton.setOnClickListener {
            activity?.finish()
            Toast.makeText(context, viewModel.signUp(), Toast.LENGTH_SHORT).show()
        }
    }
}