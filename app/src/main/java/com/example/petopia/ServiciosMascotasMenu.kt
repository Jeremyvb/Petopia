package com.example.petopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ServiciosMascotasMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicios_mascotas_menu)
        val btnpublicarServicioMascota: Button = findViewById(R.id.botonPublicarServicioMascota)
        val btnBuscarServiciosmascota : Button = findViewById(R.id.botonBuscadorServiciosMascota)
        val btnMenuSM: Button = findViewById(R.id.botonVolverMenuSM)
        btnpublicarServicioMascota.setOnClickListener()
        {
            val i = Intent(this,RegisrarSeviciosMascota::class.java)
            startActivity(i)
        }
        btnBuscarServiciosmascota.setOnClickListener()
        {
            val j = Intent(this,BuscadorServiciosMascota::class.java)
            startActivity(j)
        }
        btnMenuSM .setOnClickListener()
        {
            val j = Intent(this,MenuApp::class.java)
            startActivity(j)
        }
    }

}