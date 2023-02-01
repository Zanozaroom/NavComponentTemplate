package com.example.navigatorexample.fragment.pager_fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigatorexample.R

class FragmentTab2:Fragment(R.layout.fragment_tab2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_openTab2).setOnClickListener {
            findNavController().navigate(R.id.action_viewPager_to_fragmentTab2_1)
        }
    }

    companion object {
        fun newInstance(): FragmentTab2 {
            return FragmentTab2()
        }
    }
}