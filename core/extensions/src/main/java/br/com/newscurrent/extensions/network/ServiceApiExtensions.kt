package br.com.newscurrent.extensions.network

import br.com.newscurrent.network.service.ServiceApi

fun <T : Any> ServiceApi<T>.toResponse(): T = when (this) {
    is ServiceApi.Success -> data
    is ServiceApi.Error -> throw exception
}