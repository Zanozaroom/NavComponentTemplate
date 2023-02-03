package com.example.baseui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavHost
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.NavigationFlow
import com.example.navigation.Navigator
import com.example.navigation.NavigatorI

class MainActivity : AppCompatActivity(), NavigatorI {
    val navigator: Navigator = Navigator()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("AAA", "onCreate")
        setContentView(R.layout.activity_main)

        val navHost =  supportFragmentManager.findFragmentById(R.id.mainNavHost) as NavHostFragment
        Log.i("AAA", "$navHost")
        val navController = navHost.findNavController()
        Log.i("AAA", "$navController")
        navigator.navController = navController
    }

    override fun navigateToFlow(flow: NavigationFlow) {
        navigator.navigateToFlow(flow)
    }
}