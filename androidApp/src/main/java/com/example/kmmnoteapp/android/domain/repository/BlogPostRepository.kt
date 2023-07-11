package com.example.kmmnoteapp.android.domain.repository

import com.example.kmmnoteapp.android.data.remote.dto.blog_post.GetBlogPosts

interface BlogPostRepository {
    suspend fun getAllPost(): GetBlogPosts
}