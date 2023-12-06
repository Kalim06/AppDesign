package com.example.appdesign.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.appdesign.R
import com.example.appdesign.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.profileBack.setOnClickListener {
            it.findNavController().popBackStack()
        }

        binding.logOut.setOnClickListener {

            val sharedPref =
                activity?.getPreferences(Context.MODE_PRIVATE) ?: return@setOnClickListener
            with(sharedPref.edit()) {
                putBoolean("userLoggedIn", false)
                apply()
            }

            it.findNavController().navigate(R.id.action_profileFragment_to_signInFragment)
        }

    }
}