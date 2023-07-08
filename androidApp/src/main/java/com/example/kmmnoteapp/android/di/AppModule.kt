package com.example.kmmnoteapp.android.di

import com.example.kmmnoteapp.android.data.remote.repository.BlogPostRepositoryImpl
import com.example.kmmnoteapp.android.data.remote.ApiRoutes
import com.example.kmmnoteapp.android.data.remote.ApiService
import com.example.kmmnoteapp.android.domain.repository.BlogPostRepository
import com.example.kmmnoteapp.android.domain.use_case.get_blog_posts.GetAllPostUseCase
import com.example.kmmnoteapp.android.presentation.blog_post.BlogPostViewModel
import com.example.kmmnoteapp.android.service.SharedPreferencesService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val appModule = module {

   /* single { androidContext() }

    single {
        SharedPreferencesService(get())
    }*/

    single { KotlinJsonAdapterFactory() }

    single<Moshi> {
        Moshi.Builder()
            .add(get<KotlinJsonAdapterFactory>())
            .build()
    }
    single {
        MoshiConverterFactory.create(get())
    }
    single {
        HttpLoggingInterceptor()
            .apply {
                level = HttpLoggingInterceptor.Level.BASIC //BODY
            }

    }
    single {
        OkHttpClient
            .Builder()
            .addInterceptor(get<HttpLoggingInterceptor>())
            .build()
    }
    single {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(get()))
            .client(get())
            .baseUrl(ApiRoutes.BASE_URL)
            .build().create(ApiService::class.java)
    }

    /*single { get<Retrofit>().create(ApiService::class.java) }*/

   single<BlogPostRepository> {
        BlogPostRepositoryImpl(get())
    }

    single {
        GetAllPostUseCase(get())
    }

    viewModel {
        BlogPostViewModel(
            getAllPostUseCase = get(),
        )
    }
}