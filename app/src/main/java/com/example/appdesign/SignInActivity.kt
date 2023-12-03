package com.example.appdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Login_Theme_AppDesign)
        setContentView(R.layout.activity_sign_in)
    }
}