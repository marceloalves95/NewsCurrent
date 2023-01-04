package br.com.newscurrent.testing.base.robot

import org.junit.After
import org.junit.Before

interface Robot {
    @Before
    fun setup()
    @After
    fun tearDown()
}