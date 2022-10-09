package com.example.weather.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.weather.ui.theme.WeatherTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController){

    Scaffold(modifier = Modifier
        .padding(10.dp, 10.dp)) {
        Column (
            modifier = Modifier.fillMaxSize()
                .padding(10.dp, 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ){
            Text(text="Погода")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun pevHomeScreen(){
    WeatherTheme() {
        HomeScreen(navController = rememberNavController())
    }
}