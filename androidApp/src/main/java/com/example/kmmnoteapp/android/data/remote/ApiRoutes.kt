package com.example.kmmnoteapp.android.data.remote

object ApiRoutes {
    const val BASE_URL = "http://10.0.2.2:8000"
    //const val BASE_URL = "https://project-dev-id-backend.herokuapp.com"
    const val REGISTER = "/api/users"
    const val UPDATE = "/api/users/{userId}"
    const val LOGIN = "/api/login"
    const val BLOG_POST = "/api/blog_posts"
}