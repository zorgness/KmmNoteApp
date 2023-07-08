package com.example.kmmnoteapp.android.presentation.blog_post

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kmmnoteapp.android.Resource
import com.example.kmmnoteapp.android.domain.use_case.get_blog_posts.GetAllPostUseCase
import com.example.kmmnoteapp.android.service.SharedPreferencesService
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class BlogPostViewModel(
    private val getAllPostUseCase: GetAllPostUseCase,
    //private val sharedPref: SharedPreferencesService

) : ViewModel() {

    private val _state = mutableStateOf(BlogPostListState())
    val state: State<BlogPostListState> = _state

    init {
        getAllPost()
    }
    private fun getAllPost() {

        getAllPostUseCase().onEach { result ->
            when(result) {
                is Resource.Success -> {
                    _state.value = BlogPostListState(blogPostList = result.data ?:
                    emptyList())
                }
                is Resource.Error -> {
                    _state.value = BlogPostListState(error = result.message ?:
                    "An unexpected error occurred")
                }
                is Resource.Loading -> {
                    _state.value = BlogPostListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

}