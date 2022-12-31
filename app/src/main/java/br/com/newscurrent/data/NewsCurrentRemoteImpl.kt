package br.com.newscurrent.data

import br.com.newscurrent.data.api.NewsApi
import br.com.newscurrent.data.mapper.toNews
import br.com.newscurrent.domain.models.News
import br.com.newscurrent.domain.remote.NewsCurrentRemote
import br.com.newscurrent.extensions.network.parseResponse
import br.com.newscurrent.extensions.network.toResponse

class NewsCurrentRemoteImpl(
    private val service: NewsApi
) : NewsCurrentRemote {
    override suspend fun getNews(): News {
        return service.getNews().parseResponse().toResponse().toNews()
    }
}
