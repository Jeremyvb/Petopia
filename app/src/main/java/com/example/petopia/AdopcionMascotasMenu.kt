package com.example.petopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AdopcionMascotasMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adopcion_mascotas_menu)
        val btnpublicarAdopcion: Button = findViewById(R.id.botonPublicarAdopcionMascotas)
        val btnBuscarAvisosAdopcion : Button = findViewById(R.id.botonAvisosAdopcionMascotas)
        val btnMenuA: Button = findViewById(R.id.botonVolverMenuA)
        btnpublicarAdopcion.setOnClickListener()
        {
            val i = Intent(this,RegistrarMascotasAdopcion::class.java)
            startActivity(i)
        }
        btnBuscarAvisosAdopcion.setOnClickListener()
        {
            val j = Intent(this,BuscadorMascotasAdopcion::class.java)
            startActivity(j)
        }
        btnMenuA .setOnClickListener()
        {
            val j = Intent(this,MenuApp::class.java)
            startActivity(j)
        }
    }
}