package com.example.mhashfaq.tamuhackaa.utils

import com.parse.Parse
import android.app.Application
import com.example.mhashfaq.tamuhackaa.R

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Parse.initialize(Parse.Configuration.Builder(this)
                .applicationId(resources.getString(R.string.parse_app_id))
                .server(resources.getString(R.string.parse_server_url))
                .clientKey(resources.getString(R.string.parse_master))
                .build()
        )
    }
}
