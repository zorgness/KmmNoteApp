package com.example.kmmnoteapp.android.di

import com.example.kmmnoteapp.android.data.remote.ApiRoutes
import com.example.kmmnoteapp.android.data.remote.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val appModule = module {
    single {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(ApiRoutes.BASE_URL)
            .build()
            .create(ApiService::class.java)
    }
}