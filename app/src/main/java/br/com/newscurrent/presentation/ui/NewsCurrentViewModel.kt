package br.com.newscurrent.presentation.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.newscurrent.domain.interactor.GetNewsCurrentInteractor
import br.com.newscurrent.extensions.others.launch
import br.com.newscurrent.network.event.Event
import br.com.newscurrent.presentation.model.NewsCurrentState

class NewsCurrentViewModel(
    private val getNewsCurrentInteractor: GetNewsCurrentInteractor
) : ViewModel() {

    private val _state = MutableLiveData<NewsCurrentState>()
    val state: LiveData<NewsCurrentState> get() = _state

    fun loadNewsCurrent() = launch {
        getNewsCurrentInteractor.invoke().collect { event ->
            when (event) {
                is Event.Data -> {
                    _state.value = NewsCurrentState.ScreenData(event.data)
                }
                is Event.Error -> {
                    _state.value = NewsCurrentState.Error(event.error)
                }
                else -> Unit
            }
        }
    }
}
