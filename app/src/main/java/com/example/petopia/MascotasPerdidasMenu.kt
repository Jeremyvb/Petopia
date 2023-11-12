package com.example.petopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MascotasPerdidasMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mascotas_perdidas_menu)
        val btnpublicarAviso : Button = findViewById(R.id.botonPublicarMascotasPerdidas)
        val btnBuscarAviso : Button = findViewById(R.id.botonAvisosMascotasPerdidas)
        val btnMenuMp : Button = findViewById(R.id.botonVolverMenuMP)
        btnpublicarAviso.setOnClickListener()
        {
            val i = Intent(this,RegistrarMascotasPerdidas::class.java)
            startActivity(i)
        }
        btnBuscarAviso.setOnClickListener()
        {
            val j = Intent(this,BuscadorMascotasPerdidas::class.java)
            startActivity(j)
        }
        btnMenuMp .setOnClickListener()
        {
            val j = Intent(this,MenuApp::class.java)
            startActivity(j)
        }
    }
}