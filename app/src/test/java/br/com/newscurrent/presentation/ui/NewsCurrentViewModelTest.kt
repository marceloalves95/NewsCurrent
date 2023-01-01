package br.com.newscurrent.presentation.ui

import androidx.lifecycle.Observer
import br.com.newscurrent.domain.interactor.GetNewsCurrentInteractor
import br.com.newscurrent.domain.interactor.dummyNews
import br.com.newscurrent.network.event.Event
import br.com.newscurrent.presentation.model.NewsCurrentState
import br.com.newscurrent.testing.base.BaseTest
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.mockk
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
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
    fun `should load news current when it is called with success`() = runBlocking{

        //Arrange
        val state = NewsCurrentState.ScreenData(dummyNews)

        coEvery { interactor.invoke() } returns flowOf(
            Event.loading(isLoading = true),
            Event.data(dummyNews)
        )

        coEvery {
            stateObserver.onChanged(state)
        } returns Unit

        //Act
        viewModel.loadNewsCurrent()

        //Assert
        coVerify(exactly = 1) {
            interactor.invoke()
        }

        confirmVerified(interactor)
    }

    @Test
    fun `should load news current when it is called with failure`() = runBlocking{

        //Arrange
        val error = mockk<Throwable>(relaxed = true)
        val state = NewsCurrentState.Error(exception = error)

        coEvery { interactor.invoke() } returns flowOf(
            Event.loading(isLoading = true),
            Event.error(error)
        )

        coEvery {
            stateObserver.onChanged(state)
        } returns Unit

        //Act
        viewModel.loadNewsCurrent()

        //Assert
        coVerify(exactly = 1) {
            interactor.invoke()
        }

        confirmVerified(interactor)

    }
}