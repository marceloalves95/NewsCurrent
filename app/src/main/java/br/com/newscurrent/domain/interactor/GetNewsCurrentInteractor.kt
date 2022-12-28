package br.com.newscurrent.domain.interactor

import br.com.newscurrent.domain.remote.NewsCurrentRemote
import br.com.newscurrent.extensions.others.executeFlow

class GetNewsCurrentInteractor(private val remote: NewsCurrentRemote) {
    suspend operator fun invoke() = executeFlow(
        getRemote = {
            remote.getNews()
        }
    )
}
