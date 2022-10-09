package com.example.weather.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.weather.presentation.navigation.NavRoute
import com.example.weather.ui.theme.WeatherTheme




@Composable
fun HomeScreen(navController: NavHostController){

}

@Preview(showBackground = true)
@Composable
fun pevHomeScreen(){
    WeatherTheme() {
        HomeScreen(navController = rememberNavController())
    }
}