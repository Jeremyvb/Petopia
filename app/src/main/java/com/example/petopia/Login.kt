package com.example.petopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        val btningresarlogin : Button = findViewById(R.id.iniciarsesionlogin)

        btningresarlogin.setOnClickListener()
        {
            val i = Intent(this,MenuApp::class.java)
            startActivity(i)
        }
    }
}