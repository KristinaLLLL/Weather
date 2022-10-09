package com.example.weather.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.weather.ui.theme.WeatherTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SettingsScreen(navController: NavHostController){
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ){
            Text(text="Настройки")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prevSettingsScreen(){
    WeatherTheme() {
        SettingsScreen(navController = rememberNavController())
    }
}