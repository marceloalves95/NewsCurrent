package br.com.newscurrent.ui_components

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import assertk.assertThat
import assertk.assertions.isEqualTo
import br.com.newscurrent.ui_components.databinding.NewsCurrentErrorViewBinding
import io.mockk.impl.annotations.RelaxedMockK
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NewsCurrentErrorViewTest{

    @RelaxedMockK
    private lateinit var binding: NewsCurrentErrorViewBinding

    //private lateinit var activity: Activity
    private lateinit var newsCurrentErrorView:NewsCurrentErrorView
    private lateinit var context: Context

    @Before
    fun setup() {
        context = ApplicationProvider.getApplicationContext()
        //activity = Robolectric.buildActivity(Activity::class.java).get()
        newsCurrentErrorView = NewsCurrentErrorView(context)
    }

    @Test
    fun teste() {
        binding = NewsCurrentErrorViewBinding.bind(newsCurrentErrorView)
        //binding.btTryAgain
        assertThat(binding.actvTitle.text).isEqualTo("")
        //assertContains(R.id.textview, "text");
    }
}