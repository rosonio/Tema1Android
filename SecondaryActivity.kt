package com.example.tema1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tema1.R
import com.example.tema1.Fragment2
import com.example.tema1.Fragment3
import com.example.tema1.Fragment4

class SecondaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        var fs = Fragment2()
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.FL,fs)
            commit()
        }
    }

    fun toFirstFragment(view: View) {
        var fs = Fragment2()
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.FL,fs)
            commit()
        }
    }
    fun toSecondFragment(view: View) {
        var fs = Fragment3()
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.FL,fs)
            commit()
        }
    }
    fun toThirdFragment(view: View) {
        var fs = Fragment4()
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.FL,fs)
            commit()
        }
    }

    fun closeApp(view: View) {
        this.finish()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}