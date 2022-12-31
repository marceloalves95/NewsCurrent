package br.com.newscurrent.network.service

import br.com.newscurrent.network.model.ServiceState
import retrofit2.HttpException
import retrofit2.Response
import kotlin.reflect.KClass

interface NetworkingApi {
    suspend fun <T:Any> getResponse(
        url:String,
        responseClazz:KClass<T>
    ): ServiceState<T>

}