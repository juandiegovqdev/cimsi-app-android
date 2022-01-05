package com.cimsi.project.ui.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.cimsi.project.R
import com.cimsi.project.services.Config
import com.google.android.gms.auth.api.signin.GoogleSignIn

class App : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
    }

    override fun onStart() {
        super.onStart()
        Handler().postDelayed({
            if (GoogleSignIn.getLastSignedInAccount(this) != null) {
                Config.id = GoogleSignIn.getLastSignedInAccount(this)!!.id
                if (GoogleSignIn.getLastSignedInAccount(this)!!.photoUrl.toString()
                        .isNotEmpty() && GoogleSignIn.getLastSignedInAccount(this)!!.photoUrl.toString()
                        .isNotBlank()
                ) {
                    Config.photoUrl =
                        GoogleSignIn.getLastSignedInAccount(this)!!.photoUrl.toString()
                }
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                startActivity(Intent(this, SignInActivity::class.java))
                finish()
            }
        }, 1000)
    }
}