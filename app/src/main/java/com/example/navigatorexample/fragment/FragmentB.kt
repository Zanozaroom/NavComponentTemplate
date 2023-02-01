package com.example.navigatorexample.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.navigatorexample.R
import com.google.android.material.tabs.TabLayout

class FragmentB: Fragment(R.layout.fragment_b) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar = view.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.fragmentBMenu))
        toolbar.setupWithNavController(findNavController(), appBarConfiguration)

        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
        val navHostFragment = childFragmentManager.findFragmentById(R.id.navHostBFragment) as NavHostFragment
        val navController = navHostFragment.findNavController()


        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab?.position){
                    0 -> {
                        Toast.makeText(requireContext(), "Tab1", Toast.LENGTH_SHORT).show()
                        navController.popBackStack()
                        navController.navigate(R.id.navigation)
                        Log.i("AAA", navHostFragment.childFragmentManager.backStackEntryCount.toString())
                    }
                    1 -> {
                        Toast.makeText(requireContext(), "Tab2", Toast.LENGTH_SHORT).show()
                        navController.popBackStack()
                        navController.navigate(R.id.navigation2)
                        Log.i("AAA", navHostFragment.childFragmentManager.backStackEntryCount.toString())
                    }
                }
                // Handle tab select
            }
            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Handle tab reselect
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Handle tab unselect
            }
        })
    }
}