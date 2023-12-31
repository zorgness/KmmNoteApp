package com.example.kmmnoteapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kmmnoteapp.android.presentation.blog_post.BlogPostScreen
import com.example.kmmnoteapp.android.presentation.blog_post.BlogPostViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val viewModel = getViewModel<BlogPostViewModel>()
                    BlogPostScreen(viewModel)

                }
            }
        }
    }
}



@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        //BlogPostScreen()
    }
}
