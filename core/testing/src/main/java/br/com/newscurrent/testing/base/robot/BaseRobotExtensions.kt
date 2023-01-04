package br.com.newscurrent.testing.base.robot

import io.mockk.MockKMatcherScope
import io.mockk.coEvery
import io.mockk.every

fun <T> arrange(block: MockKMatcherScope.() -> T) {
   block
}

fun TestRun<BaseRobot>.WHEN(
    block: BaseRobot.() -> Unit
): BaseRobot {
    //you can print something here too
    return robot.apply(block)
}

fun TestRun<BaseRobot>.AND(
    block: BaseRobot.() -> Unit
): BaseRobot {
    //you can print something here too
    return robot.apply(block)
}

fun TestRun<BaseRobot>.THEN(
    block: BaseRobot.() -> Unit
): BaseRobot {
    //you can print something here too
    return robot.apply(block)
}

data class TestRun<T>(
    val robot: BaseRobot,
    val isUnitTest: Boolean
)