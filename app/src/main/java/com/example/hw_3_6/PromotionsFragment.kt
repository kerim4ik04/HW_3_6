package com.example.hw_3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_3_6.databinding.FragmentPromotionsBinding

class PromotionsFragment : Fragment() {
    private lateinit var dataFromMusikFragment: Musik

    private lateinit var binding: FragmentPromotionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPromotionsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataFromMusikFragment = arguments?.getSerializable("key") as Musik
        binding.tvAuthorName.text = dataFromMusikFragment.author
        binding.tvMusicName.text = dataFromMusikFragment.name
    }



}