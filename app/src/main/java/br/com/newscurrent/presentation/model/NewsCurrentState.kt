package br.com.newscurrent.presentation.model

import br.com.newscurrent.domain.models.News

sealed class NewsCurrentState {
    data class Error(val exception: Throwable? = null) : NewsCurrentState()
    data class ScreenData(val screenData: News) : NewsCurrentState()
}
