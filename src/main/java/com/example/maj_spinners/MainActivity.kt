package com.example.maj_spinners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var selectedLanguage: String = "" // Variable global para almacenar el idioma seleccionado

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewLanguage: TextView = findViewById(R.id.textView_language)
        val spinner: Spinner = findViewById(R.id.spinner_1)
        val buttonWelcome: Button = findViewById(R.id.button_welcome)

        // Ajustar el tamaño del texto y centrarlo
        textViewLanguage.textSize = 24f
        textViewLanguage.gravity = View.TEXT_ALIGNMENT_CENTER

        val items = resources.getStringArray(R.array.spinner_items)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                selectedLanguage = items[position] // Almacenar el idioma seleccionado en la variable global

                when (selectedLanguage) {
                    "USA" -> {
                        textViewLanguage.text = "Select your Country"
                        buttonWelcome.text = "Next"
                        Toast.makeText(this@MainActivity, "Welcome", Toast.LENGTH_SHORT).show()
                    }
                    "México" -> {
                        textViewLanguage.text = "Selecciona tu país"
                        buttonWelcome.text = "Siguiente"
                        Toast.makeText(this@MainActivity, "Bienvenido", Toast.LENGTH_SHORT).show()
                    }
                    "Brasil" -> {
                        textViewLanguage.text = "Selecione seu país"
                        buttonWelcome.text = "Seguinte"
                        Toast.makeText(this@MainActivity, "Bem-vindo", Toast.LENGTH_SHORT).show()
                    }
                    "France" -> {
                        textViewLanguage.text = "Sélectionnez votre pays"
                        buttonWelcome.text = "Suivant"
                        Toast.makeText(this@MainActivity, "Bienvenue", Toast.LENGTH_SHORT).show()
                    }
                    "Deutschland" -> {
                        textViewLanguage.text = "Wählen Sie Ihr Land"
                        buttonWelcome.text = "Folgende"
                        Toast.makeText(this@MainActivity, "Willkommen", Toast.LENGTH_SHORT).show()
                    }
                    "Italia" -> {
                        textViewLanguage.text = "Seleziona il tuo paese"
                        buttonWelcome.text = "Seguente"
                        Toast.makeText(this@MainActivity, "Benvenuto", Toast.LENGTH_SHORT).show()
                    }
                    else -> {
                        textViewLanguage.text = "Select an option"
                        buttonWelcome.text = "-----"
                        Toast.makeText(this@MainActivity, "/(=^.-'=)|", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle empty selection
            }
        }

        // Agregar listener al botón
        buttonWelcome.setOnClickListener {
            when (selectedLanguage) {
                "USA" -> {
                    Toast.makeText(this@MainActivity, "Welcome", Toast.LENGTH_SHORT).show()
                }
                "México" -> {
                    Toast.makeText(this@MainActivity, "Bienvenido", Toast.LENGTH_SHORT).show()
                }
                "Brasil" -> {
                    Toast.makeText(this@MainActivity, "Bem-vindo", Toast.LENGTH_SHORT).show()
                }
                "France" -> {
                    Toast.makeText(this@MainActivity, "Bienvenue", Toast.LENGTH_SHORT).show()
                }
                "Deutschland" -> {
                    Toast.makeText(this@MainActivity, "Willkommen", Toast.LENGTH_SHORT).show()
                }
                "Italia" -> {
                    Toast.makeText(this@MainActivity, "Benvenuto", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(this@MainActivity, "/(=^.-'=)|", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
