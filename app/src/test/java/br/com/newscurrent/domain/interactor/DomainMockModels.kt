package br.com.newscurrent.domain.interactor

import br.com.newscurrent.data.models.ArticleResponse
import br.com.newscurrent.data.models.NewsResponse
import br.com.newscurrent.data.models.SourceResponse
import br.com.newscurrent.domain.models.Article
import br.com.newscurrent.domain.models.News
import br.com.newscurrent.domain.models.Source

val dummySource = Source(
    id = "1",
    nome = "Biztoc.com"
)

@SuppressWarnings("MaxLineLength")
val dummyArticles = Article(
    source = dummySource,
    author = "yahoo.com",
    title = "Nio Day 2022: New EC7 Coupe, Improved ES8 Flagship SUV, 3rd-Gen Power-Swap Station And More",
    description = "Chinese electric vehicle maker Nio, Inc. (NYSE: NIO) held its “Nio Day 2022” at Hefei City on Saturday. It announced a new model and an improved version of its flagship SUV, among other things. The annual event went by the theme “Feel the light.” New Coupe SU…",
    url = "https://biztoc.com/x/ac9c1f39808ac21d",
    urlToImage = "https://c.biztoc.com/p/ac9c1f39808ac21d/og.webp",
    publishedAt = "2022-12-25T18:58:06Z",
    content = "Chinese electric vehicle maker Nio, Inc. (NYSE: NIO) held its Nio Day 2022 at Hefei City on Saturday. It announced a new model and an improved version of its flagship SUV, among other things. The ann… [+415 chars]"
)

val dummyNews = News(
    articles = listOf(dummyArticles),
    status = "ok",
    totalResults = 10
)

val dummySourceResponse = SourceResponse(
    id = "1",
    nome = "Biztoc.com"
)

val dummyArticleResponse = ArticleResponse(
    source = dummySourceResponse,
    author = "yahoo.com",
    title = "Nio Day 2022: New EC7 Coupe, Improved ES8 Flagship SUV, 3rd-Gen Power-Swap Station And More",
    description = "Chinese electric vehicle maker Nio, Inc. (NYSE: NIO) held its “Nio Day 2022” at Hefei City on Saturday. It announced a new model and an improved version of its flagship SUV, among other things. The annual event went by the theme “Feel the light.” New Coupe SU…",
    url = "https://biztoc.com/x/ac9c1f39808ac21d",
    urlToImage = "https://c.biztoc.com/p/ac9c1f39808ac21d/og.webp",
    publishedAt = "2022-12-25T18:58:06Z",
    content = "Chinese electric vehicle maker Nio, Inc. (NYSE: NIO) held its Nio Day 2022 at Hefei City on Saturday. It announced a new model and an improved version of its flagship SUV, among other things. The ann… [+415 chars]"

)

val dummyNewsResponse = NewsResponse(
    articles = listOf(dummyArticleResponse),
    status = "ok",
    totalResults = 10
)