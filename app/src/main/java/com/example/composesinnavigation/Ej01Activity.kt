package com.example.composesinnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class Ej01Activity : ComponentActivity() {  /* ComponentActivity tiene todas las funcionalidades necesarias
 para una UI implementada con Compose, así que no es necesaria AppCompatActiviy */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Ya no utilizaremos setContentView ya que ya no referenciaremos ningún layout en XML
        setContent {
            HolaMundoSimple(saludarA = "Jetpack Come")  // (1)
        }
    }


}

/* Todas las funciones "composables" deben declararse con la anotación @Composable
Las funciones Composable se inician en mayúsculas. */
@Composable
fun HolaMundoSimple(saludarA: String) {
    Text(
        text = "Hola, " + saludarA,
        modifier = Modifier.padding(20.dp),
        /* El objeto Modifier cuenta con funciones para definir comportamientos o decoraciones */
    )
}


/* Podemos utilizar la anotación @Preview para poder ir viendo las modificaciones que realizamos en nuestra
interfaz. En este caso, creamos una función para previsualizar y a esta le pasamos lo mismo que pasabamos al
setContent. */
@Preview
@Composable
fun DefaultPreviewEj01() {
    HolaMundoSimple("Jetpack Cose")
}


/* (1) Kotlin permite utilizar argumentos nombrados (named arguments), que pueden mejorar la legibilidad
del código y nos permitirían también pasarlos en cualquier orden.
https://kotlinlang.org/docs/functions.html#named-arguments */