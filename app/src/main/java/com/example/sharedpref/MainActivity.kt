package com.example.sharedpref

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
private var nomer: Int = 0

class MainActivity : AppCompatActivity() {

    private  lateinit var  tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.raz)
        val preferences = getSharedPreferences("count", MODE_PRIVATE)
        val edit = preferences.edit()
        nomer = preferences.getInt("count", nomer)
        var count = nomer +1
        nomer = count
        edit.putInt("count",nomer)
        edit.apply()
        tv.text = nomer.toString()

    }
}