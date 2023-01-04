package br.com.newscurrent.ui_components

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.newscurrent.extensions.views.clickWithDebounce
import br.com.newscurrent.extensions.views.getLayoutContainer
import br.com.newscurrent.ui_components.databinding.NewsCurrentErrorViewBinding

class NewsCurrentErrorView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = NewsCurrentErrorViewBinding.inflate(getLayoutContainer(), this, true)

    var title: String? = null
        set(value) {
            field = value
            value?.let {
                setupTitle(it)
            }
        }

    var onClick: (() -> Unit?)? = null
        set(value) {
            field = value
            setupButton()
        }

    private fun setupTitle(title: String) {
        binding.actvTitle.text = title
    }

    private fun setupButton() {
        binding.btTryAgain.clickWithDebounce {
            onClick?.invoke()
        }
    }

}