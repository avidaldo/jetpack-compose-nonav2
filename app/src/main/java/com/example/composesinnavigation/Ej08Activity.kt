package com.example.composesinnavigation

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Ej08Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ContenidoEj08()
        }
    }

}


@Preview
@Composable
private fun ContenidoEj08() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = {
            Toast
                .makeText(context, "Botón pulsado", Toast.LENGTH_SHORT)
                .show()
        }) {
            Text(text = "Botón")
        }


        TextConvertidoEnButtonMedianteModifier("Texto")
    }
}

/* https://www.jetpackcompose.net/buttons-in-jetpack-compose */

@Composable
fun TextConvertidoEnButtonMedianteModifier(text: String = "Button") {
    val context = LocalContext.current

    Text(text = text,
        Modifier
            .clickable {
                Toast
                    .makeText(context, "Texto pulsado", Toast.LENGTH_SHORT)
                    .show()
            }
            .clip(shape = RoundedCornerShape(30.dp))
            .border(width = 2.dp, color = Color.Blue, shape = RoundedCornerShape(30.dp))
            .background(Color.Cyan)
            .padding(
                horizontal = 16.dp, vertical = 8.dp
            )
    )


}


