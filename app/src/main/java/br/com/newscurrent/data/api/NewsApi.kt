package br.com.newscurrent.data.api

import br.com.newscurrent.data.API_KEY
import br.com.newscurrent.data.models.NewsResponse
import br.com.newscurrent.network.service.NetworkingApi
import br.com.newscurrent.network.service.ServiceApi
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("top-headlines?country=br")
    suspend fun getNews(
        @Query("category") category: String = "technology",
        @Query("apiKey") apiKey: String = API_KEY
    ): ServiceApi<NewsResponse>

    @GET("top-headlines?country=br")
    suspend fun get(
        @Query("category") category: String = "technology",
        @Query("apiKey") apiKey: String = API_KEY
    ):ServiceApi<NewsResponse>
}
