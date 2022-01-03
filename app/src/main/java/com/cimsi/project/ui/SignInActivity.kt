package com.cimsi.project.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cimsi.project.R
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.SignInButton
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {

    lateinit var mGoogleSignInClient: GoogleSignInClient
    val Req_Code: Int = 123
    var firebaseAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        initializeVariables()
        initializeUIObjects()
        initializeListeners()
    }

    private fun initializeVariables() {
        // Configuramos Google Sign In dentro del método onCreate
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken("522814181367-0jp1og4om1epljq7r5bard90c8m5lfq7.apps.googleusercontent.com")
            .build()
        // Obtenemos el valor de gso dentro de GoogleSigninClient
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso)
        // Inicializamos la variable firebaseAuth
        firebaseAuth = FirebaseAuth.getInstance()
    }

    private fun initializeUIObjects() {
        sign_in_button.setSize(SignInButton.SIZE_STANDARD)
    }

    private fun initializeListeners() {
        sign_in_button.setOnClickListener {
            signInGoogle()
        }
    }

    private fun signInGoogle() {
        val signInIntent: Intent = mGoogleSignInClient.signInIntent
        startActivityForResult(signInIntent, Req_Code)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Req_Code) {
            val task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleResult(task)
        }
    }

    private fun handleResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account: GoogleSignInAccount? = completedTask.getResult(ApiException::class.java)
            if (account != null) {
                // Config.id = GoogleSignIn.getLastSignedInAccount(this)!!.id
                // Config.displayName = GoogleSignIn.getLastSignedInAccount(this)!!.displayName
                // Config.email = GoogleSignIn.getLastSignedInAccount(this)!!.email
                // Config.familyName = GoogleSignIn.getLastSignedInAccount(this)!!.familyName
                // Config.givenName = GoogleSignIn.getLastSignedInAccount(this)!!.givenName
                // Config.photoUrl = GoogleSignIn.getLastSignedInAccount(this)!!.photoUrl.toString()
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        } catch (e: ApiException) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}