package com.example.navigatorexample.fragment

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.navigatorexample.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentDirection: Fragment(R.layout.fragment_direction_home) {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        val callback = object :OnBackPressedCallback(
            true // default to enabled
        ) {
            override fun handleOnBackPressed() {
                val navHostFragment = childFragmentManager.findFragmentById(R.id.mainFragmentAHost) as NavHostFragment
                if(navHostFragment.childFragmentManager.backStackEntryCount >= 1)
                    navHostFragment.findNavController().popBackStack()

                      else requireActivity().finish()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(
            this, // LifecycleOwner
            callback)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btmNav = view.findViewById<BottomNavigationView>(R.id.bottomNavigation)
       val navHostFragment = childFragmentManager.findFragmentById(R.id.mainFragmentAHost) as NavHostFragment
       val navController = navHostFragment.findNavController()
        NavigationUI.setupWithNavController(btmNav, navController)
    }
}