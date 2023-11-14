package com.example.petopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrarMascotasPerdidas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_mascotas_perdidas)
        val btnFinalizarRegistroMascotasPerdidas: Button = findViewById(R.id.botonFinalRegisroMascotasPerdidas)

        btnFinalizarRegistroMascotasPerdidas.setOnClickListener()
        {
            val i = Intent(this,MascotasPerdidasMenu::class.java)
            startActivity(i)
        }

    }
}