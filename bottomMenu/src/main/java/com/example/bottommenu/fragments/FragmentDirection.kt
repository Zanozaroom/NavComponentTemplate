package com.example.bottommenu.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.baseui.MainActivity
import com.example.bottommenu.R
import com.example.navigation.NavigatorI
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentDirection: Fragment(R.layout.fragment_direction) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navHostFragment = childFragmentManager.findFragmentById(R.id.mainFragmentAHost) as NavHostFragment
        val btmNav = view.findViewById<BottomNavigationView>(R.id.bottomNavigation)
        val navController = navHostFragment.findNavController()
       NavigationUI.setupWithNavController(btmNav, navController)
    }
}