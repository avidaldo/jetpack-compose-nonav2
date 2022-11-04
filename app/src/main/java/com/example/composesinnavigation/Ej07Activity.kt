package com.example.composesinnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Ej07Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppView07()
        }
    }

}


@Preview(showSystemUi = true)
@Composable
fun AppView07() {
    Column(
        Modifier
            //.fillMaxSize()
            .background(Color.Blue)
            .absolutePadding(top = 20.dp, bottom = 80.dp)
            .padding(horizontal = 20.dp)
            .background(Color(0xFF8BC34A)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "hola")
        Text(text = "mundo")
        Row() {
            Text(text = "hola")
            Box(Modifier.fillMaxWidth()) {
                Text(text = "mundo", Modifier.align(Alignment.CenterEnd))
            }
        }
        Row() {
            Text(text = "hola")
            Text(
                text = "mundo",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.End,
            )

        }
        Box(Modifier.fillMaxWidth()) {
            Text(text = "hola", Modifier.align(Alignment.CenterStart))
            Text(text = "mundo", Modifier.align(Alignment.CenterEnd))
        }

    }
}
