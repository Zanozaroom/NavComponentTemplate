package com.example.navigatorexample.fragment

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
            findNavController().navigate(R.id.action_tab2_to_fragmentTab2_1)
        }
    }
}