package com.example.wellywood_kotlin.services

import android.content.ContentValues.TAG
import android.util.Log
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import java.lang.Exception

object FirebaseService {

    fun login(email: String, pass: String): Boolean {
        val mAuth: FirebaseAuth = FirebaseAuth.getInstance()
        try {
            val task: Task<AuthResult> = mAuth.signInWithEmailAndPassword(email, pass)
            task.addOnCompleteListener(OnCompleteListener {
                if (task.isSuccessful) {
                    Log.d(TAG, "Successfully logged in")
                } else {
                    Log.w(TAG, "Failed to login", task.exception)
                }
            })
        } catch (e: Exception) {
            println(e)
            return false
        }
        return true
    }

}