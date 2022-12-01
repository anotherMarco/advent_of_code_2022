package de.oninek.adventofcode2022.day01

fun challenge01(input: String): Int {
   return input.split("\n\n")
        .map { s ->
            s.split('\n')
                .sumOf { it.toInt() }
        }
        .max()
}

fun challenge02(input: String): Int {
    return input.split("\n\n")
        .map { s ->
            s.split('\n')
                .map { it.toInt() }
                .sum()
        }
        .sortedDescending()
        .take(3)
        .sum()
}