package com.example.kmmnoteapp.android

interface MainRepository {
    suspend fun fetchAllPost()
}