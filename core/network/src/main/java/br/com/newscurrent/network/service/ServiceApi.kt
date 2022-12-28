package br.com.newscurrent.network.service

sealed class ServiceApi<out T : Any> {
    data class Success<out T : Any>(
        val data: T,
        val httpCode: Int? = null,
    ) : ServiceApi<T>()
    data class Error<out T : Any>(
        val response: T?,
        val httpCode: Int? = null,
        val exception: Throwable,
    ) : ServiceApi<T>()
}