package com.example.firstandroidapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.firstandroidapp.databinding.FragmentShopBlankBinding


class ShopBlankFragment : Fragment() {

private var binding:FragmentShopBlankBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shop_blank, container, false)
        // Inflate the layout for this fragment

        return binding?.root

    }


}