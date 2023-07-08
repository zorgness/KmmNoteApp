package com.example.kmmnoteapp.android.domain.use_case.get_blog_posts

import com.example.kmmnoteapp.android.Resource
import com.example.kmmnoteapp.android.data.remote.dto.blog_post.BlogPostDto
import com.example.kmmnoteapp.android.domain.repository.BlogPostRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class GetAllPostUseCase(
    private val repository: BlogPostRepository
) {
    operator fun invoke(): Flow<Resource<List<BlogPostDto>>> = flow {

        try {

            emit(Resource.Loading())
            val blogPosts = repository.getAllPost()
            emit(Resource.Success(data = blogPosts.list))


        } catch (he: HttpException) {

            emit(Resource.Error(he.localizedMessage ?: "An unexpected error occurred"))

        } catch (ioe: IOException) {
            emit(Resource.Error("Cannot reach server, check your network connection"))
        }

    }
}