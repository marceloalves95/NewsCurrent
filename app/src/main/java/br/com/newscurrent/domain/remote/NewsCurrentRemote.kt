package br.com.newscurrent.domain.remote

import br.com.newscurrent.domain.models.News

interface NewsCurrentRemote {
    suspend fun getNews(): News
    suspend fun get():News
}
