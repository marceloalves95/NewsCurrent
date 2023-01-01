package br.com.newscurrent.domain.interactor

import assertk.assertThat
import assertk.assertions.isEqualTo
import br.com.newscurrent.domain.models.News
import br.com.newscurrent.domain.remote.NewsCurrentRemote
import br.com.newscurrent.network.event.Event
import br.com.newscurrent.testing.base.BaseTest
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class GetNewsCurrentInteractorTest : BaseTest() {

    @RelaxedMockK
    private lateinit var getNewsCurrentInteractor: GetNewsCurrentInteractor

    @MockK
    private lateinit var remote: NewsCurrentRemote

    @Before
    fun setup() {
        getNewsCurrentInteractor = GetNewsCurrentInteractor(remote)
    }

    @Test
    fun `should get interactor when it is called with success`() = runBlocking {

        //Arrange
        val progressEmit: MutableList<Event<News>> = mutableListOf()

        coEvery {
            remote.getNews()
        } returns dummyNews

        //Act
        getNewsCurrentInteractor.invoke().collect { event ->
            progressEmit.add(event)
        }

        //Assert
        assertThat(progressEmit).isEqualTo(
            mutableListOf(
                Event.Loading,
                Event.Data(dummyNews)
            )
        )

        coVerify {
            remote.getNews()
        }

        confirmVerified(remote)
    }

    @Test(expected = Throwable::class)
    fun `should get interactor when it is called with failure`() = runBlocking {

        //Arrange
        val progressEmit: MutableList<Event<News>> = mutableListOf()
        val error = mockk<Throwable>(relaxed = true)

        coEvery {
            remote.getNews()
        } throws error

        //Act
        getNewsCurrentInteractor.invoke().collect { event ->
            progressEmit.add(event)
        }

        //Assert
        assertThat(progressEmit).isEqualTo(
            mutableListOf(
                Event.Loading,
                Event.Error(error)
            )
        )

        coVerify {
            remote.getNews()
        }

        confirmVerified(remote)
    }
}