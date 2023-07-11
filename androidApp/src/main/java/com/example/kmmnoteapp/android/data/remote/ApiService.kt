package com.example.kmmnoteapp.android.data.remote

import com.example.kmmnoteapp.android.data.remote.dto.auth.*
import com.example.kmmnoteapp.android.data.remote.dto.blog_post.BlogPostDto
import com.example.kmmnoteapp.android.data.remote.dto.blog_post.GetBlogPosts
import com.example.kmmnoteapp.android.data.remote.dto.blog_post.NewEditPostDto
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @Headers("Content-Type: application/json")
    @POST(ApiRoutes.REGISTER)
    suspend fun register(@Body registerInfo: RegisterDto): Response<UserDto>?

    @Headers("Content-Type: application/json")
    @POST(ApiRoutes.LOGIN)
    suspend fun login(@Body loginInfo: LoginDto): Response<SessionDto>?

    @Headers("Content-Type: application/merge-patch+json")
    @PATCH(ApiRoutes.UPDATE)
    suspend fun updateUser(@Path("userId") userId: Long, @Body updateInfo: UpdateDto): Response<UserDto>?

    @Headers("Content-Type: application/json")
    @GET(ApiRoutes.BLOG_POST)
    suspend fun getAllUserPost(
        @Query("userId") userId: Long,
    ): GetBlogPosts

    @Headers("Content-Type: application/json")
    @GET(ApiRoutes.BLOG_POST_BY_ID)
    suspend fun getPostById(@Path("postId") postId: Int): BlogPostDto

    @Headers("Content-Type: application/json")
    @GET(ApiRoutes.BLOG_POST)
    suspend fun newBlogPost(@Body newPost: NewEditPostDto): BlogPostDto

    @Headers("Content-Type: application/json")
    @GET(ApiRoutes.BLOG_POST_BY_ID)
    suspend fun updateBlogPost(@Path("postId") postId: Int, @Body updatedPost: NewEditPostDto): BlogPostDto

    @Headers("Content-Type: application/json")
    @DELETE(ApiRoutes.BLOG_POST_BY_ID)
    suspend fun deletePost(@Path("postId") postId: Int): Any
}