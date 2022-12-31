package br.com.newscurrent.presentation.ui

import androidx.lifecycle.Observer
import br.com.newscurrent.domain.interactor.GetNewsCurrentInteractor
import br.com.newscurrent.domain.interactor.dummyNews
import br.com.newscurrent.domain.interactor.dummyNewsResponse
import br.com.newscurrent.network.event.Event
import br.com.newscurrent.presentation.model.NewsCurrentState
import br.com.newscurrent.testing.base.BaseTest
import io.mockk.Runs
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.mockk
import kotlinx.coroutines.flow.flowOf
import org.junit.After
import org.junit.Before
import org.junit.Test

class NewsCurrentViewModelTest:BaseTest(){

    @RelaxedMockK
    private lateinit var interactor: GetNewsCurrentInteractor

    @RelaxedMockK
    private lateinit var stateObserver: Observer<NewsCurrentState>

    @RelaxedMockK
    private lateinit var viewModel: NewsCurrentViewModel

    @Before
    fun setup(){
        viewModel = NewsCurrentViewModel(interactor).also {
            with(viewModel){
                state.observeForever(stateObserver)
            }
        }
    }

    @After
    fun tearDown(){
        with(viewModel){
            state.removeObserver(stateObserver)
        }
    }

    @Test
    fun `should when`(){

        val state = mockk<NewsCurrentState.ScreenData>(relaxed = true)
        coEvery { interactor.invoke() } returns flowOf(
            Event.loading(isLoading = true),
            Event.data(dummyNews)
        )

        coEvery {
            NewsCurrentState.ScreenData(dummyNews)
        }  returns state

        viewModel.loadNewsCurrent()

        coVerify(exactly = 1) {
            interactor.invoke()
        }
    }

}