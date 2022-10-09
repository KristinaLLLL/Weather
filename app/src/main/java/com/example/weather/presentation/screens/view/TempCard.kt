package com.example.weather.presentation.screens.view


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import kotlin.math.roundToInt

@Composable
fun TempCard(
    tempValue: Double,
    tempMin: Double,
    tempMax: Double,
    weatherInfo: String
) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colors.surface
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "%d°".format(tempValue.roundToInt()),
                style = MaterialTheme.typography.overline,
                fontSize = 60.sp
            )
            Text(
                text = weatherInfo,
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "Мин. %d° Макс. %d°".format(tempMin.roundToInt(), tempMax.roundToInt()),
                style = MaterialTheme.typography.body1
            )
        }
    }

}


@Preview
@Composable
fun prevTemp() {
    TempCard(25.0, 21.0, 27.0, "Переменная облачноть")
}