package br.com.newscurrent.data

import br.com.newscurrent.data.api.NewsApi
import br.com.newscurrent.data.mapper.toNews
import br.com.newscurrent.data.models.NewsResponse
import br.com.newscurrent.domain.models.News
import br.com.newscurrent.domain.remote.NewsCurrentRemote
import br.com.newscurrent.extensions.network.parseResponse
import br.com.newscurrent.extensions.network.toResponse
import br.com.newscurrent.network.service.NetworkingApi

class NewsCurrentRemoteImpl(
    private val service: NewsApi,
    private val networkingApi: NetworkingApi
) : NewsCurrentRemote {
    override suspend fun getNews(): News {
        return service.getNews().toResponse().toNews()
    }

    override suspend fun get(): News {
        return networkingApi.getResponse(
            url = "",
            responseClazz = NewsResponse::class
        ).toResponse().toNews()
    }
}
