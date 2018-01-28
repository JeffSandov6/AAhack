package com.example.mhashfaq.tamuhackaa.controllers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mhashfaq.tamuhackaa.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val baggage: Button = findViewById(R.id.baggage)
        val flightAttendant: Button = findViewById(R.id.flightAttendant)
        val gateAttendant: Button = findViewById(R.id.gateAttendant)

        baggage.setOnClickListener {
            /*
            val kickedOut = ParseObject("kickedOut")
            kickedOut.put("barcode", "1234567890")
            kickedOut.saveInBackground {e: ParseException? ->
                if (e == null) {
                    Toast.makeText(baseContext, "Save Success", Toast.LENGTH_SHORT).show()
                }
            }
            */
            startActivity(Intent(baseContext, BaggageActivity::class.java))
        }

        flightAttendant.setOnClickListener {
            /*
            val hashMap = HashMap<String, String>()
            ParseCloud.callFunctionInBackground("hello", hashMap, { `object`: String?, v ->
                if (v == null) {
                    Toast.makeText(baseContext, `object`, Toast.LENGTH_SHORT).show();
                }
            })
            */
        }

        gateAttendant.setOnClickListener {

        }
    }
}
