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
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentDirection: Fragment(R.layout.fragment_direction) {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("AAA", "onAttach")

        val callback = object :OnBackPressedCallback(
            true // default to enabled
        ) {
            override fun handleOnBackPressed() {
                Log.i("AAA", "handleOnBackPressed")
                val navHostFragment = childFragmentManager.findFragmentById(R.id.mainFragmentAHost) as NavHostFragment
                Log.i("AAA", "${navHostFragment.childFragmentManager.backStackEntryCount}")
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

        val navHostFragment = childFragmentManager.findFragmentById(R.id.mainFragmentAHost) as NavHostFragment
        val btmNav = view.findViewById<BottomNavigationView>(R.id.bottomNavigation)
        val navController = navHostFragment.findNavController()

       NavigationUI.setupWithNavController(btmNav, navController)
    }
}