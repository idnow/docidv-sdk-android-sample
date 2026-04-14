package io.idnow.docidv.sample.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.idnow.docidv.sample.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    // =============================================================================================
    // Private properties
    // =============================================================================================
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    // =============================================================================================
    // Fragment methods
    // =============================================================================================
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.idnPrimaryButton.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToStartFragment(binding.idnIdentId.text.toString()))
        }
    }
}