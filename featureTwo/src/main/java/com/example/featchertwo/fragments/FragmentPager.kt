package com.example.featchertwo.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.featchertwo.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class FragmentPager: Fragment(R.layout.fragment_pager) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar = view.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val appBarConfiguration = AppBarConfiguration(setOf(com.example.bottommenu.R.id.feature_two_graph))
        toolbar.setupWithNavController(findNavController(), appBarConfiguration)

        val listFragment = listOf(FragmentTab1(), FragmentTab2())
        val listFragment1 = listOf(FragmentTab1::class.java, FragmentTab2::class.java)
        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
        val adapterView = AdapterView(this@FragmentPager, listFragment1)
        val viewPager2 = view.findViewById<ViewPager2>(R.id.pager)
        viewPager2.adapter = adapterView
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Tab1"
                }
                1 -> {
                    tab.text = "Tab2"
                }
            }
        }.attach()
    }

    private class AdapterView(
        fragment: Fragment,
        private val listFragment: List<Class<out Fragment>>
        ): FragmentStateAdapter(fragment){

        override fun getItemCount(): Int = listFragment.count()

        override fun createFragment(position: Int): Fragment {
            return listFragment[position].newInstance()
        }
    }
}