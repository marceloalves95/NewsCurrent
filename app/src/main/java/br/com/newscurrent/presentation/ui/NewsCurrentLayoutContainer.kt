package br.com.newscurrent.presentation.ui

import androidx.recyclerview.widget.LinearLayoutManager
import br.com.newscurrent.databinding.NewsCurrentMainBinding
import br.com.newscurrent.domain.models.News
import br.com.newscurrent.extensions.views.gone
import br.com.newscurrent.extensions.views.shimmerVisible
import br.com.newscurrent.extensions.views.visible
import br.com.newscurrent.presentation.adapter.NewsCurrentAdapter
import br.com.newscurrent.presentation.model.NewsCurrentState

class NewsCurrentLayoutContainer(
    private val binding: NewsCurrentMainBinding,
    private val viewModel: NewsCurrentViewModel
) {
    private var newsAdapter = NewsCurrentAdapter(emptyList())

    fun setState(state: NewsCurrentState) {
        when (state) {
            is NewsCurrentState.ScreenData -> handleScreenData(state.screenData)
            is NewsCurrentState.Error -> handleErrorData(state.exception)
            else -> Unit
        }
        handleLoading(state)
    }

    private fun handleLoading(state: NewsCurrentState){
        binding.shimmerFrameLayout.shimmerVisible(state is NewsCurrentState.Loading)
    }

    private fun handleScreenData(news: News) = with(binding) {
        frameLayout.gone()
        rvNewsActual.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            newsAdapter = NewsCurrentAdapter(news.articles)
            adapter = newsAdapter
        }
    }

    private fun handleErrorData(error: Throwable?) {
        binding.frameLayout.visible()
        binding.ncevError.apply {
            title = error?.message
            onClick = { viewModel.loadNewsCurrent() }
        }
    }
}
