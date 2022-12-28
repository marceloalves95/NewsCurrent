package br.com.newscurrent.core

import android.app.Application
import br.com.newscurrent.core.di.NewsCurrentModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

open class Application : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@Application)
        }
        NewsCurrentModule.load()
    }
}
