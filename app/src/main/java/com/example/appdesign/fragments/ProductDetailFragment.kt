package com.example.appdesign.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.appdesign.R
import com.example.appdesign.databinding.FragmentProductDetailBinding

class ProductDetailFragment : Fragment() {

    private var _binding: FragmentProductDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentProductDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val overviewFragment = OverviewFragment()
        val featureFragment = FeatureFragment()

        binding.pdOverViewBtn.setOnClickListener {

            parentFragmentManager.beginTransaction()
                .replace(binding.pdFragmentContainerView.id, overviewFragment).commit()

            binding.pdOverViewSelected.visibility = View.VISIBLE
            binding.pdFeatureSelected.visibility = View.GONE
        }

        binding.pdFeaturesBtn.setOnClickListener {

            parentFragmentManager.beginTransaction()
                .replace(binding.pdFragmentContainerView.id, featureFragment).commit()

            binding.pdFeatureSelected.visibility = View.VISIBLE
            binding.pdOverViewSelected.visibility = View.GONE
        }

        binding.pdBack.setOnClickListener {
            it.findNavController().popBackStack()
        }

        binding.pdCart.setOnClickListener {
            it.findNavController().navigate(R.id.action_productDetailFragment_to_cartFragment)
        }

        binding.pdAddToCartBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_productDetailFragment_to_cartFragment)
        }

    }
}