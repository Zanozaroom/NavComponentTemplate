package com.example.navigatorexample.fragment.pager_fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigatorexample.R

class FragmentTab1:Fragment(R.layout.fragment_tab1){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_open_tab1).setOnClickListener {
        findNavController().navigate(R.id.action_viewPager_to_fragmentTab1_1)
        }
    }
    companion object{
        fun newInstance(): FragmentTab1{
            return FragmentTab1()
        }
    }

}