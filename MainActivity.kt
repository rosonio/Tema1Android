package com.example.tema1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun to2ndActivity(view: View) {
        Intent(this,SecondaryActivity::class.java).also{
            startActivity(it)
        }
    }
}