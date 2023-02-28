package com.example.navapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class FlashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_screen)
        supportActionBar?.hide()
        var handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        },3000)
    }
}