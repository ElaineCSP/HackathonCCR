package com.example.hackathonccr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.R


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.hackathonccr.R.layout.activity_splash)

        Handler().postDelayed({
            val intentTelaLoginActivity = Intent(this@SplashActivity, MainActivity::class.java)

            startActivity(intentTelaLoginActivity)

            finish()
        }, 2500)

    }

}
