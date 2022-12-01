package de.oninek.adventofcode2022.day01

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

private const val TEST_STRING = """1000
2000
3000

4000

5000
6000

7000
8000
9000

10000"""

class Challenge1Test {

    @Test
    fun challenge01() {
        val result = challenge01(TEST_STRING)

        assertEquals(24000, result)
    }

    @Test
    fun challenge02() {
        val result = challenge02(TEST_STRING)

        assertEquals(45000, result)
    }
}