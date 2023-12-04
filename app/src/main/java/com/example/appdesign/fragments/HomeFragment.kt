package com.example.appdesign.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.appdesign.R
import com.example.appdesign.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.homeUserImage.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }

        binding.searchBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_searchFragment)
        }

        binding.listItem1.root.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_productDetailFragment)
        }

        binding.listItem2.root.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_productDetailFragment)
        }

        binding.listItem3.root.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_productDetailFragment)
        }

        binding.featuredItem1.root.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_productDetailFragment)
        }

        binding.featuredItem2.root.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_productDetailFragment)
        }

        binding.featuredItem3.root.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_productDetailFragment)
        }

        binding.featuredItem4.root.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_productDetailFragment)
        }
    }
}