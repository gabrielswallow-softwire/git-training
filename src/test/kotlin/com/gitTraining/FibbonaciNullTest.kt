package com.gitTraining

import org.assertj.core.api.Java6Assertions.assertThat
import org.junit.Test

class FibbonaciNullTest {
    @Test
    fun fibbonaci_works_for_small_null() {
        assertThat(computeFibbonaciNumber(null)).isEqualTo(1)
    }
}
