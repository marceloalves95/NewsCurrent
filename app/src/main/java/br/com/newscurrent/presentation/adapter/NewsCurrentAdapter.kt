package br.com.newscurrent.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.newscurrent.databinding.NewsCurrentItemBinding
import br.com.newscurrent.domain.models.Article

class NewsCurrentAdapter(
    private val listArticles: List<Article>
) : RecyclerView.Adapter<NewsCurrentAdapter.NewsCurrentViewHolder>() {

    inner class NewsCurrentViewHolder(private val binding: NewsCurrentItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(article: Article) = with(binding) {
            actvAuthor.text = article.author
            actvTitle.text = article.title
            actvDescription.text = article.description
            actvContent.text = article.content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsCurrentViewHolder {
        return NewsCurrentViewHolder(NewsCurrentItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: NewsCurrentViewHolder, position: Int) {
        holder.bind(listArticles[position])
    }

    override fun getItemCount() = listArticles.size
}
