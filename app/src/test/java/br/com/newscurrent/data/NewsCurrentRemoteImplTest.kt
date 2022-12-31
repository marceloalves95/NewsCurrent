package br.com.newscurrent.data

import br.com.newscurrent.testing.base.BaseTest

class NewsCurrentRemoteImplTest:BaseTest(){

//    @RelaxedMockK
//    private lateinit var remote: NewsCurrentRemoteImpl
//
//    @RelaxedMockK
//    private lateinit var service:NewsApi
//
//    @Before
//    fun setup(){
//        remote = NewsCurrentRemoteImpl(service)
//    }
//
//    @Test
//    fun `should get news when is called with sucess`() = runBlocking{
//        coEvery {
//            service.getNews()
//        } returns ServiceApi.Success(dummyNewsResponse)
//
//        val result = remote.getNews()
//
//        assertThat(result).isEqualTo(dummyNewsResponse.toNews())
//        assertThat(result).isInstanceOf(News::class)
//
//        coVerify(exactly = 1) { service.getNews() }
//        confirmVerified(service)
//    }
//
//    @Test
//    fun `should get news when is called with failure`() = runBlocking{
//
//        val exception = mockk<Throwable>(relaxed = true)
//
//        coEvery {
//            service.getNews()
//        } returns ServiceApi.Error(dummyNewsResponse, exception = exception)
//
//        remote.getNews()
//
//        coVerify(exactly = 1) { service.getNews() }
//        confirmVerified(service)
//    }
}