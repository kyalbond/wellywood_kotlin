package com.example.wellywood_kotlin.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.wellywood_kotlin.R
import com.example.wellywood_kotlin.services.FirebaseService

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailField: EditText = findViewById(R.id.email)
        val passField: EditText = findViewById(R.id.password)


        val btnLogin: Button = findViewById(R.id.buttonLogin)
        btnLogin.setOnClickListener {
            Toast.makeText(this, emailField.editableText.toString(), Toast.LENGTH_SHORT).show()
            val success: Boolean = FirebaseService.login(
                emailField.editableText.toString(), passField.editableText.toString())

            if (success) {
                Toast.makeText(this, "Successfully logged in!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, HomeActivity::class.java))
            } else {
                Toast.makeText(this, "Failed to login", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
