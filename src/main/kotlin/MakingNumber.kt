package org.example

import kotlin.random.Random

class MakingNumber {
    private val checkNumber = CheckingNumber()

    fun makeNumber(): IntArray {
        var correctAnswer: IntArray
        do {
            val random = Random.nextInt(100, 1000)
            correctAnswer = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        } while (checkNumber.check(correctAnswer))
        return correctAnswer
    }
}