package com.gitTraining

fun computeFibbonaciNumber(position: Int?): Int {
    var notNullPosition = position
    if (notNullPosition == null) {
        notNullPosition = 1
    }
    var i = 1
    var j = 1

    if (notNullPosition <= 2) return 1

    var currentPosition = 2
    while (currentPosition < notNullPosition) {
        val temp = i
        i = j
        j += temp
        currentPosition ++
    }
    return j
}

fun computeFibbonachiArray(start: Int, end: Int, efficient: Boolean = false): List<Int> {
    if (!efficient) return (start..end).map { computeFibbonaciNumber(it) }
    if (start > end) return listOf()
    if (start == end) return listOf(computeFibbonaciNumber(start))
    val output = mutableListOf(computeFibbonaciNumber(start), computeFibbonaciNumber(start + 1))
    (2..(end-start)).forEach { output.add(output[it-2] + output[it-1]) }
    return output
}