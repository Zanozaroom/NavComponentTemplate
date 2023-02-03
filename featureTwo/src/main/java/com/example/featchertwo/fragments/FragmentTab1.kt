package com.example.featchertwo.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.featchertwo.R

class FragmentTab1:Fragment(R.layout.fragment_tab1){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_open_tab1).setOnClickListener {
        findNavController().navigate(R.id.fragmentTab1_1)
        }
    }
    companion object{
        fun newInstance(): FragmentTab1 {
            return FragmentTab1()
        }
    }

}