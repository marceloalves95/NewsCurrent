package br.com.newscurrent.data.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class NewsResponse(
    @SerializedName("articles")
    val articles: List<ArticleResponse>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
):Parcelable

@Parcelize
data class ArticleResponse(
    @SerializedName("author")
    val author: String?,
    @SerializedName("content")
    val content: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("publishedAt")
    val publishedAt: String?,
    @SerializedName("source")
    val source: SourceResponse?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("urlToImage")
    val urlToImage: String?
):Parcelable

@Parcelize
data class SourceResponse(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val nome: String?
):Parcelable