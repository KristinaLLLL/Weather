package com.example.weather.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weather.presentation.screens.HomeScreen
import com.example.weather.presentation.screens.SettingsScreen

sealed class NavRoute(val route: String){
    object Home: NavRoute("home_screen")
    object Settings: NavRoute("settings_screen")
}

@Composable
fun WeatherNavHost(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoute.Home.route){
        composable(NavRoute.Home.route){HomeScreen(navController = navController) }
        composable(NavRoute.Settings.route){ SettingsScreen(navController = navController)}
    }
}