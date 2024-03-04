package com.example.halloapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Diawali huruf besar, Passive
class MainActivity : AppCompatActivity() {
    //passive
    private val name : String = "Refanda"
    //active
    private val isErrorNetwork: Boolean = true

    //diawali huruf kecil, active
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}