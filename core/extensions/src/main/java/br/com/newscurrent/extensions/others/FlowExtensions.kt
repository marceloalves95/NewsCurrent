package br.com.newscurrent.extensions.others

import br.com.newscurrent.network.event.Event
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

suspend fun <T> executeFlow(
    getRemote:suspend (() -> T)
):Flow<Event<T>> = flow {
    emit(Event.Loading)
    val data = getRemote()
    emit(Event.Data(data))
}.catch {
    val exception = Throwable(it.cause)
    emit(Event.Error(exception))
}