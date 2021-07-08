package com.arsh.whatsappmessenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.google.firebase.auth.FirebaseAuth
// to not make user login again again and again
class SplashActivity : AppCompatActivity() {
    private val auth by lazy {
        FirebaseAuth.getInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(auth.currentUser == null){ // if no user is currently loged in
            startActivity(Intent(this,LoginActivity::class.java))
        }else{
            startActivity(Intent(this,MainActivity::class.java))
        }
        finish()

    }
}