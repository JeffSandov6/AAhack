package com.example.mhashfaq.tamuhackaa.controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mhashfaq.tamuhackaa.R

class checkedIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checked_in)
        val textView: TextView = findViewById(R.id.textView)
        val checkedIn = intent.getBooleanExtra("checkedIn", false)
        if (checkedIn) {
            textView.text = "Mihir Desai: Checked In"
        } else {
            textView.text = "Mihir Desai: Not Checked In"
        }
    }
}
