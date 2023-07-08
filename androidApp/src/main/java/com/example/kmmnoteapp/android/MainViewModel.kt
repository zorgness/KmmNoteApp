package com.example.kmmnoteapp.android

import androidx.lifecycle.ViewModel

class MainViewModel(
    private val repository: MainRepository
) : ViewModel() {

    suspend fun fetchAllPost() {
        repository.fetchAllPost()
    }

}