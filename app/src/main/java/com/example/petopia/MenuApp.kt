package com.example.petopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_app)

        val btnBuscadorMascotas : Button = findViewById(R.id.botonMascotasPerdidas)
        val btnAdopcion : Button = findViewById(R.id.botonAdopcionDeMascotas)
        val btnServicios : Button= findViewById(R.id.botonServiciosMascotas)

        btnBuscadorMascotas.setOnClickListener()
        {
            val i = Intent(this,MascotasPerdidasMenu::class.java)
            startActivity(i)
        }
        btnAdopcion.setOnClickListener()
        {
            val j = Intent(this,AdopcionMascotasMenu::class.java)
            startActivity(j)
        }
        btnServicios.setOnClickListener()
        {
            val m = Intent(this,ServiciosMascotasMenu::class.java)
            startActivity(m)
        }
    }
}