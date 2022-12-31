package br.com.newscurrent.data.api

import br.com.newscurrent.data.API_KEY
import br.com.newscurrent.data.models.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("top-headlines?country=br")
    suspend fun getNews(
        @Query("category") category: String = "technology",
        @Query("apiKey") apiKey: String = API_KEY
    ): Response<NewsResponse>
}
