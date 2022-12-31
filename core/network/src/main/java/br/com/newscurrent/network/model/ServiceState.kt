package br.com.newscurrent.network.model

import okhttp3.ResponseBody

sealed class ServiceState<out T : Any> {
    data class Success<out T : Any>(
        val data: T,
        val httpCode: Int? = null,
    ) : ServiceState<T>()
    data class Error<out T : Any>(
        val response: T?,
        val message:String,
        val httpCode: Int? = null,
        val errorBody: ResponseBody? = null,
        val exception: Throwable,
    ) : ServiceState<T>()
}