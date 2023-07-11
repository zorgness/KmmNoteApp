package com.example.kmmnoteapp.android.data.remote.repository

import com.example.kmmnoteapp.android.data.remote.ApiService
import com.example.kmmnoteapp.android.data.remote.dto.blog_post.GetBlogPosts
import com.example.kmmnoteapp.android.domain.repository.BlogPostRepository

class BlogPostRepositoryImpl(
    private val apiService: ApiService
): BlogPostRepository {
    override suspend fun getAllUserPost(userId: Long): GetBlogPosts {
        return apiService.getAllUserPost(userId)
    }
}