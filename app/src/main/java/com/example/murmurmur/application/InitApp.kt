package com.example.murmurmur.application

import android.app.Application
import com.example.murmurmur.dagger2.AppComponent
import com.example.murmurmur.dagger2.DaggerAppComponent

class InitApp : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

    fun appComponent() = appComponent
}