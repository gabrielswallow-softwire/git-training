package com.gitTraining

import org.assertj.core.api.Java6Assertions.assertThat
import org.junit.Test

class RecursiveFibbonaciTest {
    @Test
    fun recursive_fibbonaci_works_for_small_numbers() {
        val inputs = listOf(1,2,3,4,5,6,7,8,9)
        val expectedOutputs = listOf(1,1,2,3,5,8,13,21,34)

        for ((input, expectedOutput) in inputs.zip(expectedOutputs)) {
            assertThat(computeFibbonaciNumber(input, true)).isEqualTo(expectedOutput)
        }
    }
}
