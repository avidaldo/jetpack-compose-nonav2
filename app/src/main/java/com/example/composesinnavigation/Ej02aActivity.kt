package com.example.composesinnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Ej02aActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ColumnaBasica(saludarA = getString(R.string.jetpack_compose))
        }
    }

}

@Preview
@Composable
fun ColumnaBasica() {
    Column {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

/* Elementos como Column, Row o Box cumplen una función similar a la de los Layouts, permiten posicionar
los elementos internos de un determinado modo. La función Text no permite, por sí sola, recibir la
posición en que debe estar en pantalla, pero sí pasa a tener ese atributo cuando
 */
