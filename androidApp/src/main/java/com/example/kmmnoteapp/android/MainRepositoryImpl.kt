package com.example.kmmnoteapp.android

import com.example.kmmnoteapp.android.data.remote.ApiService

class MainRepositoryImpl(
    private val apiService: ApiService
): MainRepository  {
    override suspend fun fetchAllPost() {
        apiService.fetchAllPost()
    }
}