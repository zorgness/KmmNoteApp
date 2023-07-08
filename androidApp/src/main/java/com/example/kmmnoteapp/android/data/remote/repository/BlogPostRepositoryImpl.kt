package com.example.kmmnoteapp.android.data.remote.repository

import com.example.kmmnoteapp.android.data.remote.ApiService
import com.example.kmmnoteapp.android.data.remote.dto.blog_post.BlogPostDto
import com.example.kmmnoteapp.android.data.remote.dto.blog_post.GetBlogPosts
import com.example.kmmnoteapp.android.domain.repository.BlogPostRepository

class BlogPostRepositoryImpl(
    private val apiService: ApiService
): BlogPostRepository {
    override suspend fun getAllPost(): GetBlogPosts {
        return apiService.getAllPost()
    }
}