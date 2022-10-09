package com.example.weather.presentation.screens.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather.ui.theme.Purple500
import kotlin.math.roundToInt

@Composable
fun WindCard(
    windValue: Double,
    winddir: String
) {

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .background(Purple500),

    ) {
        Column(modifier = Modifier
            .padding(10.dp, 10.dp)
            .background(Purple500)
            .fillMaxWidth()) {
            Text(
                text = "Ветер",
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .padding(10.dp, 0.dp),
                color = Color.White
            )
            Row(
                modifier = Modifier
                    .padding(10.dp, 10.dp)
                    .background(Purple500)
                    .fillMaxWidth()

            ) {
                Text(
                    text = "%d м/с  ".format(windValue.roundToInt()),
                    style = MaterialTheme.typography.body1,
                    textAlign = TextAlign.Right,
                    color = Color.White
                )
                Text(
                    text = winddir,
                    style = MaterialTheme.typography.body1,
                    color = Color.White
                )
            }
        }
    }
}



@Preview
@Composable
fun prevWind() {
    WindCard(windValue = 5.0, winddir = "западный")
}