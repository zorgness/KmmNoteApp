package com.example.kmmnoteapp.android

import android.app.Application
import android.os.Bundle
import com.example.kmmnoteapp.android.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(listOf(appModule))
        }
    }
}