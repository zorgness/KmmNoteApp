package com.example.kmmnoteapp.android.data.remote.dto.blog_post


import com.squareup.moshi.Json

data class NewEditPostDto(
    @Json(name = "title")
    val title: String,
    @Json(name = "content")
    val content: String,
    @Json(name = "account")
    val account: String
)