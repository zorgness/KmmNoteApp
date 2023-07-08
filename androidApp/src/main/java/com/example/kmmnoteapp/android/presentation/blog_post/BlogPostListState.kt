package com.example.kmmnoteapp.android.presentation.blog_post

import com.example.kmmnoteapp.android.data.remote.dto.blog_post.BlogPostDto

data class BlogPostListState(
    val isLoading: Boolean = false,
    val blogPostList: List<BlogPostDto> = emptyList(),
    val error: String = ""
)