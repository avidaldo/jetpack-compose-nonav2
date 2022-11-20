package com.example.composesinnavigation

import android.content.res.Configuration
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview

class Ej09Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ContenidoEj09()
        }
    }

}


@Preview(showSystemUi = true)
@Composable
private fun ContenidoEj09() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Row() {
                Text("Landscape", Modifier.weight(1f))
                CajaConCosas(Modifier.weight(2f).fillMaxSize())
            }
        }
        else -> {
            Column() {
                Text("Portrait", Modifier.weight(1f))
                CajaConCosas(Modifier.weight(2f).fillMaxWidth())
            }
        }
    }
}


@Preview (widthDp = 150, heightDp = 150)
@Composable
private fun CajaConCosas(
    modifier: Modifier = Modifier,
) {
    Box(modifier.background(Color.LightGray)) {
        Text(text = "Texto en TopStart", Modifier.align(Alignment.TopStart).background(Color.Cyan))
        Text(text = "Texto en BottomEnd", Modifier.align(Alignment.BottomEnd).background(Color.Green))

    }
}





