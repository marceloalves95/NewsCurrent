package br.com.newscurrent.presentation.ui

import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.newscurrent.databinding.NewsCurrentMainBinding
import br.com.newscurrent.domain.models.News
import br.com.newscurrent.presentation.adapter.NewsCurrentAdapter
import br.com.newscurrent.presentation.model.NewsCurrentState

class NewsCurrentLayoutContainer(
    private val binding: NewsCurrentMainBinding
) {
    private var newsAdapter = NewsCurrentAdapter(emptyList())

    fun setState(state: NewsCurrentState) {
        when (state) {
            is NewsCurrentState.ScreenData -> handleScreenData(state.screenData)
            is NewsCurrentState.Error -> handleErrorData(state.exception)
        }
    }

    private fun handleScreenData(news: News) = with(binding) {
        rvNewsActual.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            newsAdapter = NewsCurrentAdapter(news.articles)
            adapter = newsAdapter
        }
    }

    private fun handleErrorData(error: Throwable?) {
        Toast.makeText(binding.root.context, "Erro $error", Toast.LENGTH_SHORT).show()
    }
}
