package com.example.appdesign.fragments

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.appdesign.R

class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //User Logged In Navigation
        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        val userLoggedIn = sharedPref.getBoolean("userLoggedIn", false)

        Handler(Looper.getMainLooper()).postDelayed({

            if (userLoggedIn) {
                view.findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
            } else {
                view.findNavController().navigate(R.id.action_splashFragment_to_signInFragment)
            }

        }, 3000)
    }
}