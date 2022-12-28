package br.com.newscurrent.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.newscurrent.databinding.NewsCurrentMainBinding
import br.com.newscurrent.extensions.views.observe
import br.com.newscurrent.extensions.views.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class NewsCurrentActivity : AppCompatActivity() {

    private val binding by viewBinding(NewsCurrentMainBinding::inflate)
    private val layoutContainer by lazy {
        NewsCurrentLayoutContainer(binding)
    }
    private val viewModel: NewsCurrentViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel.loadNewsCurrent()
        setupObserves()
    }

    private fun setupObserves() = with(viewModel) {
        observe(state) {
            layoutContainer.setState(it)
        }
    }
}
