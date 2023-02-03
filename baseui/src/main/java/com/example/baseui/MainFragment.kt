package com.example.baseui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigation.BottomMenuFlow
import com.example.navigation.NavigatorI

class MainFragment: Fragment(R.layout.main_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as NavigatorI).navigateToFlow(BottomMenuFlow)
    }
}