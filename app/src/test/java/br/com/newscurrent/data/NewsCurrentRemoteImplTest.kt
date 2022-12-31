package br.com.newscurrent.data

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isInstanceOf
import br.com.newscurrent.data.api.NewsApi
import br.com.newscurrent.data.mapper.toNews
import br.com.newscurrent.domain.interactor.dummyNews
import br.com.newscurrent.domain.interactor.dummyNewsResponse
import br.com.newscurrent.domain.models.News
import br.com.newscurrent.extensions.network.parseResponse
import br.com.newscurrent.extensions.network.toResponse
import br.com.newscurrent.testing.base.BaseTest
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class NewsCurrentRemoteImplTest:BaseTest(){

    @RelaxedMockK
    private lateinit var remote: NewsCurrentRemoteImpl

    @RelaxedMockK
    private lateinit var service: NewsApi

    @Before
    fun setup(){
        remote = NewsCurrentRemoteImpl(service)
    }

    @Test
    fun `should get news when is called with success`() = runBlocking{
        coEvery {
            service.getNews().parseResponse().toResponse().toNews()
        } returns dummyNews

        val result = remote.getNews()

        assertThat(result).isEqualTo(dummyNewsResponse.toNews())
        assertThat(result).isInstanceOf(News::class)

        coVerify(exactly = 1) { service.getNews().parseResponse().toResponse().toNews() }
        confirmVerified(service)
    }

    @Test
    fun `should get news when is called with failure`() = runBlocking{

        val exception = mockk<Throwable>(relaxed = true)

        coEvery {
            service.getNews().parseResponse().toResponse().toNews()
        } throws exception

        remote.getNews()

        coVerify(exactly = 1) { service.getNews() }
        confirmVerified(service)
    }
}