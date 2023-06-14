package com.example.fragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.fragmentnavigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding:FragmentSecondBinding?=null
    private val binding get() = _binding!!
    private val args:SecondFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentSecondBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name=args.name
        val mail=args.mail
        binding.textView.text=name
        binding.textView2.text=mail
        binding.backButton.setOnClickListener {
            findNavController().navigate(R.id.secondFragment_to_firstFragment)
        }

    }


}