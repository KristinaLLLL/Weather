package com.example.weather.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.weather.presentation.navigation.NavRoute
import com.example.weather.presentation.screens.view.*
import com.example.weather.ui.theme.Purple200
import com.example.weather.ui.theme.Purple500
import com.example.weather.ui.theme.WeatherTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController){

   // val viewState by viewModel
    Scaffold(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)) {
        Column (
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ){

                LazyVerticalGrid(
                    columns = GridCells.Fixed(4),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    item(span = { GridItemSpan(maxLineSpan) }) {
                        TempCard(
                            23.0,
                            20.0,
                            24.0 ,
                            "Солнечно"
                        )
                    }

                    item(span = { GridItemSpan(maxLineSpan) }) { WindCard(windValue = 5.0, winddir = "северо-западный") }
                    item(span = { GridItemSpan(maxLineSpan) }) { HumidityCard(humidityValue = 90.0) }
                    item(span = { GridItemSpan(maxLineSpan) }) { UvindexCard(uvindexValue = 3) }
                    item(span = { GridItemSpan(maxLineSpan) }) { VisibilityCard(visibility = 10.0) }
                    item(span = { GridItemSpan(maxLineSpan) }) { PrecipprobCard(precipprob = 20) }
                }
            Row(
                modifier = Modifier
                    .background(Purple500),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom
            ) {
                Button(
                    onClick = {
                        navController.navigate(route = NavRoute.Home.route)
                    },
                    modifier = Modifier
                        .width(200.dp)
                        .padding(vertical = 8.dp, horizontal = 10.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)

                ) {
                    Text(text = "Погода",
                        color = Color.Black
                    )
                }
                Button(
                    onClick = {
                        navController.navigate(route = NavRoute.Settings.route)
                    },
                    modifier = Modifier
                        .width(200.dp)
                        .padding(vertical = 8.dp, horizontal = 10.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)

                ) {
                    Text(text = "Настройки",
                        color = Color.Black
                    )
                }
            }
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