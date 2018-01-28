package com.example.mhashfaq.tamuhackaa.controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mhashfaq.tamuhackaa.R
import com.parse.ParseObject
import java.util.*
import kotlin.collections.ArrayList

class BaggageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baggage)

        val list: List<String> = Arrays.asList("DFW", "HOU", "PHX", "DHM", "LAX", "DEN", "MIA", "MCO", "LAS", "JFK")
        var depList : MutableList<String> = ArrayList()
        var arrivalList : MutableList<String> = ArrayList()
        var flightId : MutableList<String> = ArrayList()

        for(item in list) {
            var i = 0
            while (i < 10) {
                val randomizer = Random()
                val random = list.get(randomizer.nextInt(list.size))
                if (random == item) {
                    continue
                } else {
                    depList.add(item)
                    arrivalList.add(random)
                    val flightIdString = item + "-" + random + "-12"
                    if (!(flightIdString in flightId)) {
                        flightId.add(flightIdString)
                    }
                    i++
                }
            }

        }
        for (i in depList.indices) {
            var parseObject = ParseObject("bagData")
            parseObject.put("departureAirport", depList[i])
            parseObject.put("arrivalAirport", depList[i])
            parseObject.saveInBackground()
        }
    }
}
