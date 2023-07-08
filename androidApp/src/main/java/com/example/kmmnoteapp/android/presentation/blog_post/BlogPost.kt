package com.example.kmmnoteapp.android.presentation.blog_post

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.kmmnoteapp.android.data.remote.dto.blog_post.BlogPostDto
import org.koin.androidx.compose.getViewModel

@Composable
fun BlogPostScreen(
    viewModel: BlogPostViewModel
) {
    val viewModel = getViewModel<BlogPostViewModel>()
    val state = viewModel.state.value

    BlogPostContent(
        blogPostList = state.blogPostList
    )

}

@Composable
fun BlogPostContent(
    blogPostList: List<BlogPostDto>
) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        LazyColumn() {
            items(blogPostList) { blogPost ->
                Text(
                    text = blogPost.title
                )
            }
        }

    }

}