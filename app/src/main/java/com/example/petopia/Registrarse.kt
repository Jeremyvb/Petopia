package com.example.petopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registrarse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)
        val btnregistrar : Button = findViewById(R.id.RegistrarseBotonFinal)
        val btnregresar: Button = findViewById(R.id.botonRegresar)
        btnregistrar.setOnClickListener()
        {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
        btnregresar.setOnClickListener()
        {
            val j = Intent(this,MainActivity::class.java)
            startActivity(j)
        }
    }
}