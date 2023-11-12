package com.example.petopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrarMascotasAdopcion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_mascotas_adopcion)
        val btnFinalizarRegistroAdopcion: Button = findViewById(R.id.botonFinalRegistroAdopcion)
        btnFinalizarRegistroAdopcion.setOnClickListener()
        {
            val i = Intent(this,AdopcionMascotasMenu::class.java)
            startActivity(i)
        }
    }
}