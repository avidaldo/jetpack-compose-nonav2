package com.example.composesinnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class Ej02bActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ColumnaBasica(saludarA = getString(R.string.jetpack_compose))
        }
    }

}

@Composable
fun ColumnaBasica(
    saludarA: String
) {
    Column(
        Modifier.fillMaxSize(), // (1)
        verticalArrangement = Arrangement.Center,  // (2)
        horizontalAlignment = Alignment.CenterHorizontally,
        content = { /* El atributo content permite recibir una función Composable */
            Text(text = "Hola, ")
            Text(text = saludarA, modifier = Modifier.background(Color.Yellow))
        })
}


/* La anotación puede recibir parámetros para indicar de qué modo mostrar la Preview */
@Preview(showSystemUi = true) // Mostramos la pantalla completa
@Composable
fun DefaultPreviewEj02b() {
    DosTextosEnColumna(saludarA = "JetPack Compose")
}

/*
(1)
Pasamos un modifier que hace que la columna se extienda para ocupar toda la pantalla

(2)

Arrangment permite posicionar

(3)
Indicamos la alineación horizontal que tendrán los elementos de la columna. Es un parámentro de
Column porque afecta a su contenido. No tendría sentido una alineación vertical, ya que eso
vendrá indicado por la propia naturaleza de la columna (apila los elementos verticalmente).

(4)
Sin embargo, siempre tendrá más prioridad el modificador de cada elemento. Al estar dentro de
ColumnScope, este Text puede usar la función de extensión
(https://kotlinlang.org/docs/extensions.html) align, que solo puede recibir una alineación
horizontal. No tendría sentido una vertical.


 */