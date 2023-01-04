package br.com.newscurrent.presentation.ui

import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NewsCurrentActivityTest{

    @Test
    fun myTest() {
        val scenario = launchActivity<NewsCurrentActivity>()
        scenario.recreate()
//        // Your test code goes here.
    }


}