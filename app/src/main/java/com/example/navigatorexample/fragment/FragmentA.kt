package com.example.navigatorexample.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.navigatorexample.R

class FragmentA: Fragment(R.layout.fragment_a) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar = view.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.fragmentAMenu))
        toolbar.setupWithNavController(findNavController(), appBarConfiguration)
        val button = view.findViewById<Button>(R.id.bOpenA2)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_A_to_fragmentA_A2)
        }
    }
}