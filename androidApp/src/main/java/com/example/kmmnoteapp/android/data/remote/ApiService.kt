package com.example.kmmnoteapp.android.data.remote

import com.example.kmmnoteapp.android.data.remote.dto.auth.*
import com.example.kmmnoteapp.android.data.remote.dto.blog_post.BlogPostDto
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
    suspend fun updateUser(@Path("userId") userId: Int, @Body updateInfo: UpdateDto): Response<UserDto>?

    @Headers("Content-Type: application/json")
    @GET(ApiRoutes.BLOG_POST)
    suspend fun fetchAllPost(): List<BlogPostDto>
}