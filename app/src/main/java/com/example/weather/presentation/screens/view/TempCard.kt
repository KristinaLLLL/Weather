package com.example.weather.presentation.screens.view


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather.ui.theme.Purple500
import com.example.weather.ui.theme.White
import kotlin.math.roundToInt

@Composable
fun TempCard(
    tempValue: Double,
    tempMin: Double,
    tempMax: Double,
    weatherInfo: String
) {

    Surface(
        modifier = Modifier.fillMaxWidth()
            .background(Purple500),
        color = MaterialTheme.colors.surface
    ) {
        Row(
            modifier = Modifier.padding(10.dp, 10.dp)
                .background(Purple500)
            //verticalArrangement = Arrangement.SpaceBetween,
            //horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "%d°".format(tempValue.roundToInt()),
                style = MaterialTheme.typography.overline,
                fontSize = 60.sp,
                textAlign = TextAlign.Left,
                color = Color.White
            )
            Column(
                modifier = Modifier.padding(30.dp, 20.dp)
            ) {
                Text(
                    text = weatherInfo,
                    style = MaterialTheme.typography.body1,
                    textAlign = TextAlign.Right,
                    color = Color.White
                )
                Text(
                    text = "Мин. %d° Макс. %d°".format(tempMin.roundToInt(), tempMax.roundToInt()),
                    style = MaterialTheme.typography.body1,
                    color = Color.White
                )
            }

        }
    }
}



@Preview
@Composable
fun prevTemp() {
    TempCard(25.0, 21.0, 27.0, "Переменная облачноть")
}