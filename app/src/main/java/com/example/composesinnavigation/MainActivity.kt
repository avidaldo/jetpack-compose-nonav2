package com.example.composesinnavigation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.composesinnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() { /* Activity tradicional que hereda de AppCompactActivity.
AppCompactActivity añade funcionalidades específicas para integrar la barra de Acción y los temas oscuros.
Hereda a su vez de FragmentActivity para permitir el uso de fragments.
Con Compose, estas funcionalidades no serán necesarias y podremos tomar como partida la siguiente clase
superior en la jerarquía. */

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button01.setOnClickListener {
            startActivity(Intent(this,
                Ej01Activity::class.java))
        }
        binding.button02a.setOnClickListener {
            startActivity(Intent(this,
                Ej02aActivity::class.java))
        }
        binding.button02b.setOnClickListener {
            startActivity(Intent(this,
                Ej02bActivity::class.java))
        }
        binding.button02c.setOnClickListener {
            startActivity(Intent(this,
                Ej02cActivity::class.java))
        }
        binding.button03.setOnClickListener {
            startActivity(Intent(this,
                Ej03Activity::class.java))
        }
        binding.button04.setOnClickListener {
            startActivity(Intent(this,
                Ej04Activity::class.java))
        }
        binding.button05.setOnClickListener {
            startActivity(Intent(this,
                Ej05Activity::class.java))
        }
        binding.button06.setOnClickListener {
            startActivity(Intent(this,
                Ej06Activity::class.java))
        }
        binding.button07.setOnClickListener {
            startActivity(Intent(this,
                Ej07Activity::class.java))
        }
        binding.button08.setOnClickListener {
            startActivity(Intent(this,
                Ej08Activity::class.java))
        }
             binding.button09.setOnClickListener { startActivity(Intent(this, Ej09Activity::class.java)) }
        /*   binding.buttonEjercicio01.setOnClickListener { startActivity(Intent(this, Ejercicio01Activity::class.java)) }
            binding.buttonEjercicio02.setOnClickListener { startActivity(Intent(this, Ejercicio02Activity::class.java)) }
            binding.buttonEjercicio03.setOnClickListener { startActivity(Intent(this, Ejercicio03Activity::class.java)) }*/
    }
}