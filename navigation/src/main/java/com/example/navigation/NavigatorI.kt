package com.example.navigation

import androidx.activity.OnBackPressedCallback

/**
 * Этот интерфейс должна реализовывать MainActivity для управления навигацией
 */
interface NavigatorI {
    fun navigateToFlow(flow: NavigationFlow)
}