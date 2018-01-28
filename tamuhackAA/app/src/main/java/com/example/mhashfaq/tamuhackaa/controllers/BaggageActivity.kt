package com.example.mhashfaq.tamuhackaa.controllers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import com.example.mhashfaq.tamuhackaa.R

class BaggageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baggage)

        var button: Button = findViewById(R.id.button2)

        button.setOnClickListener{
            val intent = Intent(this, checkedIn::class.java)
            intent.putExtra("checkedIn", true)
            startActivity(intent)
        }

        button.setOnLongClickListener{ v ->
            val intent = Intent(this, checkedIn::class.java)
            intent.putExtra("checkedIn", false)
            startActivity(intent)
            true
        }
    }
}
