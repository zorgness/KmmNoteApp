package com.example.kmmnoteapp.android.data.remote.dto.blog_post


import com.squareup.moshi.Json

data class BlogPostDto(
    @Json(name = "id")
    val id: Int,
    @Json(name = "title")
    val title: String,
    @Json(name = "content")
    val content: String,
    @Json(name = "createdAt")
    val createdAt: String,
    @Json(name = "account")
    val account: String
)