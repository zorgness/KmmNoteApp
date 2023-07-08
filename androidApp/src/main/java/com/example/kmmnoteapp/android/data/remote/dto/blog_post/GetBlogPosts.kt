package com.example.kmmnoteapp.android.data.remote.dto.blog_post


import com.squareup.moshi.Json

data class GetBlogPosts(
    @Json(name = "hydra:member")
    val list: List<BlogPostDto> = listOf()
)