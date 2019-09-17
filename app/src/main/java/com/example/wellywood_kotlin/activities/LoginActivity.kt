package com.example.wellywood_kotlin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.wellywood_kotlin.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin: Button = findViewById(R.id.buttonLogin)
        btnLogin.setOnClickListener {
            Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show()
        }
    }

}
