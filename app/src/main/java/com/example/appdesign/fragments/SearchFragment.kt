package com.example.appdesign.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.appdesign.R
import com.example.appdesign.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.searchBack.setOnClickListener {
            it.findNavController().popBackStack()
        }

        binding.searchCart.setOnClickListener {
            it.findNavController().navigate(R.id.action_searchFragment_to_cartFragment)
        }

        binding.searchItem1.root.setOnClickListener {
            it.findNavController().navigate(R.id.action_searchFragment_to_productDetailFragment)
        }

        binding.searchItem2.root.setOnClickListener {
            it.findNavController().navigate(R.id.action_searchFragment_to_productDetailFragment)
        }

        binding.searchItem3.root.setOnClickListener {
            it.findNavController().navigate(R.id.action_searchFragment_to_productDetailFragment)
        }

    }
}