import com.example.kmmnoteapp.android.data.remote.dto.blog_post.BlogPostDto

data class MainListState(
    val isLoading: Boolean = false,
    val coinsList: List<BlogPostDto> = emptyList(),
    val error: String = ""
)