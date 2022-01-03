package com.cimsi.project.ui

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
                Config.account = GoogleSignIn.getLastSignedInAccount(this)!!.account.toString()
                Config.id = GoogleSignIn.getLastSignedInAccount(this)!!.id
                Config.displayName = GoogleSignIn.getLastSignedInAccount(this)!!.displayName
                Config.email = GoogleSignIn.getLastSignedInAccount(this)!!.email
                Config.familyName = GoogleSignIn.getLastSignedInAccount(this)!!.familyName
                Config.givenName = GoogleSignIn.getLastSignedInAccount(this)!!.givenName
                Config.photoUrl = GoogleSignIn.getLastSignedInAccount(this)!!.photoUrl.toString()
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                startActivity(Intent(this, SignInActivity::class.java))
                finish()
            }
        }, 1000)
    }
}