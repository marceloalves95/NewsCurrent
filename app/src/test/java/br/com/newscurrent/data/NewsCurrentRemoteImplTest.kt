package br.com.newscurrent.data

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isInstanceOf
import br.com.newscurrent.data.api.NewsApi
import br.com.newscurrent.data.mapper.toNews
import br.com.newscurrent.data.models.NewsResponse
import br.com.newscurrent.domain.interactor.dummyNewsResponse
import br.com.newscurrent.domain.models.News
import br.com.newscurrent.testing.base.BaseTest
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.ResponseBody.Companion.toResponseBody
import org.junit.Before
import org.junit.Test
import retrofit2.HttpException
import retrofit2.Response

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

        //Arrange
        val response = Response.success(dummyNewsResponse)

        coEvery {
            service.getNews()
        } returns response

        //Act
        val result = remote.getNews()

        //Assert
        assertThat(result).isEqualTo(dummyNewsResponse.toNews())
        assertThat(result).isInstanceOf(News::class)

        coVerify(exactly = 1) {
            service.getNews()
        }

        confirmVerified(service)
    }

    @Test(expected = HttpException::class)
    fun `should get news when is called with failure`() = runBlocking{

        //Arrange
        val responseError = Response.error<NewsResponse>(500 ,
            "some content".toResponseBody("plain/text".toMediaTypeOrNull())
        )

        coEvery {
            service.getNews()
        } throws HttpException(responseError)

        //Act
        remote.getNews()

        //Assert
        coVerify(exactly = 1) {
            service.getNews()
        }

        confirmVerified(service)
    }
}