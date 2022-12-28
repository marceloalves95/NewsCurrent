package br.com.newscurrent.network.service

import kotlin.reflect.KClass

interface NetworkingApi {
    suspend fun <T:Any> getResponse(
        url:String,
        responseClazz:KClass<T>
    ):ServiceApi<T>
}