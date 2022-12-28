package br.com.newscurrent.data.mapper

import br.com.newscurrent.data.models.ArticleResponse
import br.com.newscurrent.data.models.NewsResponse
import br.com.newscurrent.data.models.SourceResponse
import br.com.newscurrent.domain.models.Article
import br.com.newscurrent.domain.models.News
import br.com.newscurrent.domain.models.Source

internal fun NewsResponse.toNews() = News(
    articles = articles.map { it.toArticle() },
    status = status,
    totalResults = totalResults
)

internal fun ArticleResponse.toArticle() = Article(
    author = author,
    content = content,
    description = description,
    publishedAt = publishedAt,
    source = source?.toSource(),
    title = title,
    url = url,
    urlToImage = urlToImage
)

internal fun SourceResponse.toSource() = Source(
    id = id,
    nome = nome
)
