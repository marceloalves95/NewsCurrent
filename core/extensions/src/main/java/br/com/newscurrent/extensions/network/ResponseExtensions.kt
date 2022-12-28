package br.com.newscurrent.extensions.network

import br.com.newscurrent.network.service.ServiceApi
import retrofit2.Response
import java.net.HttpURLConnection

fun <T : Any> Response<T>.parseResponse(): ServiceApi<T> {
    if (isSuccessful) {
        val body = body()

        if (body != null) {
            return ServiceApi.Success(
                data = body,
                httpCode = code()
            )
        }
    } else {
        return ServiceApi.Error(
            exception = Exception(),
            response = body(),
            httpCode = code()
        )

    }
    return ServiceApi.Error(
        exception = Exception(),
        response = body(),
        httpCode = HttpURLConnection.HTTP_INTERNAL_ERROR
    )
}