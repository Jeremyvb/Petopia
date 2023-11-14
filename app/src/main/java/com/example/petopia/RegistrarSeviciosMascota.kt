package com.example.petopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrarSeviciosMascota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regisrar_sevicios_mascota)
        val btnFinalizarRegistroServicio: Button = findViewById(R.id.botonFinalRegistarServicio)
        btnFinalizarRegistroServicio.setOnClickListener()
        {
            val i = Intent(this,ServiciosMascotasMenu::class.java)
            startActivity(i)
        }
    }
}