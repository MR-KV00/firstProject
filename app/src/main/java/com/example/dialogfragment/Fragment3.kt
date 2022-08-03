package com.example.dialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dialogfragment.databinding.Fragment1Binding
import com.example.dialogfragment.databinding.Fragment3Binding

class Fragment3:Fragment() {

    lateinit var binding: Fragment3Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment3Binding.inflate(layoutInflater,container,false)
        return binding.root
    }

}