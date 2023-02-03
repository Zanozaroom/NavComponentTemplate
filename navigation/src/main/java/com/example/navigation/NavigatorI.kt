package com.example.navigation

/**
 * Этот интерфейс должна реализовывать MainActivity для управления навигацией
 */
interface NavigatorI {
    fun navigateToFlow(flow: NavigationFlow)
}