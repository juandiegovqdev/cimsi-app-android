package com.cimsi.myapplication.services

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.cimsi.myapplication.R
import com.cimsi.myapplication.activities.SignInActivity
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class App : AppCompatActivity() {

    val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
        // Create a new user with a first and last name
        val user = hashMapOf(
            "first" to "Ada",
            "last" to "Lovelace",
            "born" to 1815
        )
        // Add a new document with a generated ID
        db.collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("TAG", "DocumentSnapshot added with ID: ${documentReference.id}")
                startActivity(Intent(applicationContext, SignInActivity::class.java))
            }
            .addOnFailureListener { e ->
                Log.w("TAG", "Error adding document", e)
            }

    }
}