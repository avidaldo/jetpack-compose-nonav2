package com.example.composesinnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class Ej06Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ColumnaConFilas()
        }
    }


}


@Composable
fun ColumnaConFilas() {
    Column(
        modifier = Modifier
            .background(Color.LightGray),
        // quitamos el arrangement
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(modifier = Modifier.weight(25f)) {
            Text(
                text = "Texto 1",
                modifier = Modifier
                    .background(Color.Red)
                    .weight(1f)
            )
            Text(
                text = "Texto 2",
                Modifier
                    .background(Color.Green)
                    .weight(2f),
                fontSize = 32.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
            )

        }
        Text(
            text = "Texto 3",
            Modifier
                .background(Color.Yellow)
                .weight(25f)
                .fillMaxSize()
        )
        Image(
            painter = painterResource(id = R.drawable.function),
            contentDescription = "Descripción para personas con problemas de visión",
            modifier = Modifier
                .weight(50f)
                .fillMaxSize()
        )

    }
}


@Preview(showSystemUi = true)
@Composable
fun DefaultPreviewEj06() {
    ColumnaConFilas()
}
