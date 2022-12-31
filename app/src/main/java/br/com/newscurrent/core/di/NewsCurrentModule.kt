package br.com.newscurrent.core.di

import br.com.newscurrent.data.BASE_URL
import br.com.newscurrent.data.NewsCurrentRemoteImpl
import br.com.newscurrent.data.api.NewsApi
import br.com.newscurrent.domain.interactor.GetNewsCurrentInteractor
import br.com.newscurrent.domain.remote.NewsCurrentRemote
import br.com.newscurrent.network.service.Service
import br.com.newscurrent.presentation.ui.NewsCurrentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.GlobalContext.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object NewsCurrentModule {

    fun load() {
        loadKoinModules(
            listOf(
                dataModule(),
                domainModule(),
                presentationModule()
            )
        )
    }

    private fun dataModule(): Module {
        return module {
            factory<NewsApi> {
                Service.createService(
                    baseUrl = BASE_URL
                )
            }
            single<NewsCurrentRemote> {
                NewsCurrentRemoteImpl(get())
            }
        }
    }

    private fun domainModule(): Module {
        return module {
            factory { GetNewsCurrentInteractor(get()) }
        }
    }

    private fun presentationModule(): Module {
        return module {
            viewModel {
                NewsCurrentViewModel(
                    getNewsCurrentInteractor = get()
                )
            }
        }
    }
}
