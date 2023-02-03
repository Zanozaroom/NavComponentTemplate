package com.example.featcherone.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.featcherone.R

class FragmentA2: Fragment(R.layout.fragment_a2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar = view.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val appBarConfiguration = AppBarConfiguration(findNavController().graph)
        toolbar.setupWithNavController(findNavController(), appBarConfiguration)
    }

}