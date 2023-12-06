package com.example.appdesign.fragments

import android.content.Context
import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.appdesign.R
import com.example.appdesign.databinding.FragmentSignInBinding
import com.google.android.material.snackbar.Snackbar

class SignInFragment : Fragment() {

    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Email Focus Listener
        emailInputListener()
        //Password Focus Listener
        passwordInputListener()

        //Sign In Click
        binding.signInBtn.setOnClickListener {

            if (isEmailValid() && isPasswordValid()) {

                //Save Login User
                loginUser()
                //Navigate to Home Screen
                it.findNavController().navigate(R.id.action_signInFragment_to_homeFragment)

            } else {
                Snackbar.make(binding.root, "Invalid Email or Password", Snackbar.LENGTH_SHORT)
                    .show()
            }
        }

        //Sign Up
        binding.signUpDirectBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }
    }


    private fun emailInputListener() {

        binding.emailInput.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_NEXT) {
                binding.emailInput.clearFocus()
            }
            return@setOnEditorActionListener false
        }

        binding.emailInput.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                binding.emailLayout.error = null
            }
        }
    }

    private fun isEmailValid(): Boolean {

        val emailText = binding.emailInput.text.toString()

        val validEmail: Boolean = Patterns.EMAIL_ADDRESS.matcher(emailText).matches()

        if (!validEmail) {
            binding.emailLayout.error = "Invalid Email Address"
        }

        return validEmail
    }

    private fun passwordInputListener() {

        binding.passwordInput.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                binding.passwordInput.clearFocus()
            }
            return@setOnEditorActionListener false
        }

        binding.passwordInput.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                binding.passwordLayout.error = null
            }
        }
    }

    private fun isPasswordValid(): Boolean {

        val passwordText = binding.passwordInput.text.toString()

        return if (passwordText.length < 8) {
            binding.passwordLayout.error = "Minimum 8 Character Password"
            false
        } else if (!passwordText.matches(".*[A-Z].*".toRegex())) {
            binding.passwordLayout.error = "Must Contain 1 Upper-case Character"
            false
        } else if (!passwordText.matches(".*[a-z].*".toRegex())) {
            binding.passwordLayout.error = "Must Contain 1 Lower-case Character"
            false
        } else {
            true
        }
    }

    private fun loginUser() {
        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putBoolean("userLoggedIn", true)
            apply()
        }
    }
}