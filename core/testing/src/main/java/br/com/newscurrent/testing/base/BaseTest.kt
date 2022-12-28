package br.com.newscurrent.testing.base

import io.mockk.MockKAnnotations

abstract class BaseTest {
    init {
        MockKAnnotations.init(this)
    }
}